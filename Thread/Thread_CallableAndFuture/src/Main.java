import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        //Future<?> future =executor.submit(new Callable<Integer>() Soru işareti koyarak ne istersek o değerde döner.
        Future<Integer> future =executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                System.out.println("Thread calisiyor.");
                int sure = random.nextInt(1000) + 500;

               /* if (sure>1000){
                    throw new IOException("Thread cok uzun sure uyudu.");
                }

                */
                try {
                    Thread.sleep(sure);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread cikiyor....");
                return sure;
            }
        });
        executor.shutdown();
        try {
            System.out.println("Donen deger: "+future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
