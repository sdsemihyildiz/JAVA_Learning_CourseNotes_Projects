import java.util.Scanner;

public class WaitNotify {
    private Object lock = new Object();
    public void thread1Fonksiyonu() {

        //lock daha önce tanımlamadık, bu obje üzerinde tanımlayacağımızı söylemek için this diyoruz.
        //synchronized (this)
        synchronized (lock) {

            System.out.println("Thread 1 calisiyor...");
            System.out.println("Thread 1 Thread 2'nin kendisini uyandirmasini bekliyor...");

            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread 1 uyandi, devam ediyor...");
        }


    }

    public void thread2Fonksiyonu() {

        Scanner scanner = new Scanner(System.in);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (lock) {

            System.out.println("Thread 2 calisiyor...");

            System.out.println("Devam etmek icin bir tusa basin...");

            scanner.nextLine();

            lock.notify();
            System.out.println("Uyandirdim abi, ben gidiyorum...");


        }


    }
}

