public class Main {
    public static void main(String[] args) {

        Deadlock deadlock =new Deadlock();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                deadlock.threadFonksiyonu1();
            }
        });

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
            deadlock.threadFonksiyonu2();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        deadlock.threadOver();
    }
}
