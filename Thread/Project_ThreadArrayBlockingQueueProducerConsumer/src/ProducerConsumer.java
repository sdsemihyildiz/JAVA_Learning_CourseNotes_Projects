import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
    Random random =new Random(); // değerleri random olarak eklemek için kuruyoruz

    BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10); // max 10 tane elemanı olsun diyoruz

    public void produce(){

        while (true){

            try {
                Thread.sleep(5000); // bunu 1000 consumer 2000 yaparsak farklı sonuç oluyor
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }



            try {
                Integer value = random.nextInt(100); //0 ile 100 arasında değer üretecek
                queue.put(value);
                System.out.println("Producer uretiyor: "+value);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }

    }

    public void consume(){
        while (true){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            try {
                Integer value = queue.take();
                System.out.println("Consumer tuketiyor: "+value);
                System.out.println("Queue size: "+queue.size());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }

    }







}
