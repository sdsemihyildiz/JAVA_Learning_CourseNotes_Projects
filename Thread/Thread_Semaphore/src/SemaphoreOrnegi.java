import java.util.concurrent.Semaphore;

public class SemaphoreOrnegi {

    private Semaphore sem =new Semaphore(1);

    //aynı anda kaç thread e izin verilebilir diye soruyor, permit bu anlama geliyor


    public void threadFonksiyonu(int id){

        try {
            sem.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread basliyor, Thread ID: "+id);
        System.out.println("------");

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread cikiyor, Thread ID: "+id);

        sem.release();
        System.out.println("-------");


    }


}
