public class Main {
    public static void main(String[] args) {

        ReentrantLock re = new ReentrantLock();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                re.thread1Fonksiyonu();

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                re.thread2Fonksiyonu();

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
        re.threadOver();



    }
}
