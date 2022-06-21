import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class ReentrantLock {

    private int say = 0;
    private Lock lock = new java.util.concurrent.locks.ReentrantLock();

    private Condition condition = lock.newCondition(); //bunu ekleyerek istediğimi wait notify ı ekleyebiliriz.


    public void arttir() {
        for (int i = 0; i < 10000; i++) {

            say++;
        }


    }

    public void thread1Fonksiyonu() {

        lock.lock();
        System.out.println("Thread 1 calisiyor");
        System.out.println("Thread 1 uyandirilmayi bekliyor.");
        try {
            condition.await(); //birisi uyandirana kadar thread1 burada uyumaya devam ediyor
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread 1 uyandirildi ve islemine devam ediyor.");
        arttir();

        lock.unlock();


        /*
        lock.lock();
        try {
            arttir();
        }
        finally {
            lock.unlock();
        }
         */

        //bu şekilde yazarak exception olsa bile programın durmamasını ve unlock işlemine devam etmesini sağladık.


    }

    public void thread2Fonksiyonu() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Scanner scanner =new Scanner(System.in);


        lock.lock();
        System.out.println("Thread 2 calisiyor.");

        arttir();


        System.out.println("Devam etmek icin bir tusa basin");
        scanner.nextLine();
        condition.signal(); //is bittikten sonra calisabilirsin uyumana gerek yok sinyali
        System.out.println("Thread 1 i uyandirdim, ben gidiyorum");

        lock.unlock();

        /*
        lock.lock();
        try {
            arttir();
        }
        finally {
            lock.unlock();
        }

         */


    }

    public void threadOver() {
        System.out.println("Say degiskeninin deger: " + say);


    }
}
