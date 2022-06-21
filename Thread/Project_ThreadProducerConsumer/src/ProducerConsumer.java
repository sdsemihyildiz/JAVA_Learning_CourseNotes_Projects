import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumer {

    Random random = new Random();
    Object lock = new Object(); //anahtar oluşturduk

    Queue<Integer> queue = new LinkedList<Integer>();
    private int limit = 10;


    public void producer() {

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock) {

                if (queue.size() == limit) {

                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

                Integer value = random.nextInt(100);
                queue.offer(value);
                System.out.println("Producer uretiyor: " + value);
                lock.notify(); //güvenlik açısından eğer uyuyan bir consumer varsa uyandırmak amaçlı yazıyor


            }


        }


    }

    public void consumer() {

        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lock) {
                if (queue.size() == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                Integer value = queue.poll();
                System.out.println("Consumer tuketiyor: " + value);
                System.out.println("Queue Size: " + queue.size());
                lock.notify(); // bekleyen bir consumer olma ihtimaline karşın uyandırmak için yazıyoruz.

            }


        }


    }
}
