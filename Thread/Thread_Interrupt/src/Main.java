import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread calisiyor.");
                for (int i=0;i<10000000;i++){
                    //Thread üzerinde interrupt olup olmadığını aşağıdaki komut bloğu ile kontrol ediyoruz
                    if (Thread.currentThread().isInterrupted()){
                        System.out.println("Thread kesintiye ugradi.");
                        return; //thread kesintiye uğradığı için
                    }
                    list.add(i); // eğer interrupt olmadıysa ekle
                }
               /* for (int i = 1; i <= 10; i++) {
                    System.out.println("Thread yaziyor: " + i);
                    try {
                        Thread.sleep(1000);
                        System.out.println("Uykumun " + (i) + ". saniyesindeyim.");
                    } catch (InterruptedException e) {
                        System.out.println("Uykum bolundu.");
                    }
                }
                */
                System.out.println("Thread kesintiye ugramadan isini bitirdi.");
            }
        });
        t.start();
        try {
            Thread.sleep(5000);//kaçıncı saniyede uykuya göndermek istediğimizi yazıyoruz buraya
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t.interrupt(); // yarıda kesme komutu

    }
}
