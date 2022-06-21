import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Deadlock {

    private Hesap hesap1 = new Hesap();
    private Hesap hesap2 = new Hesap();
    private Random random = new Random();

    private Lock lock1 = new ReentrantLock();

    private Lock lock2 = new ReentrantLock();

    public void locklariKontrolEt(Lock a, Lock b){

        boolean a_elde_edildi=false;
        boolean b_elde_edildi=false;

        while (true){   //iki locktan birisi alındıysa sonsuza kadar devam edecek.

            a_elde_edildi=a.tryLock();
            b_elde_edildi=b.tryLock();

            if (a_elde_edildi==true&&b_elde_edildi==true){
                return;
            }
            if (a_elde_edildi==true){
                a.unlock();
            }
            if (b_elde_edildi==true){
                b.unlock();
            }

        }


    }

    public void threadFonksiyonu1() {
        /*
        lock1.lock();
        lock2.lock();

         */
        locklariKontrolEt(lock1,lock2);


        for (int i = 0; i < 5000 ; i++) {
            Hesap.paraTransferi(hesap1, hesap2, random.nextInt(100));

        }

        lock1.unlock();
        lock2.unlock();



    }

    public void threadFonksiyonu2() {
        /*
        lock1.lock();
        lock2.lock();

         */
        locklariKontrolEt(lock2,lock1);


        for (int i = 0; i < 5000 ; i++) {

            Hesap.paraTransferi(hesap2, hesap1, random.nextInt(100));

        }

        lock1.unlock();
        lock2.unlock();



    }

    public void threadOver() {
        System.out.println("Hesap1 Bakiye : " + hesap1.getBakiye() + " Hesap2 Bakiye : " + hesap2.getBakiye());

        System.out.println("Toplam Bakiye : " + (hesap1.getBakiye() + hesap2.getBakiye()));


    }
}
