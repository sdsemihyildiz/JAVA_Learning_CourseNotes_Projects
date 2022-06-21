import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Ramazan Pidesi Uygulamasi");
        Random random = new Random();
        Queue<String> pide_kuyrugu = new LinkedList<String>();
        pide_kuyrugu.offer("Semih");
        pide_kuyrugu.offer("Hilal");
        pide_kuyrugu.offer("Tunahan");
        pide_kuyrugu.offer("Metincan");
        pide_kuyrugu.offer("Enes");
        pide_kuyrugu.offer("Osman");
        pide_kuyrugu.offer("Yusuf");
        pide_kuyrugu.offer("Furkan");
        pide_kuyrugu.offer("Berkay");
        pide_kuyrugu.offer("Muhammed");
        int pide_sayisi = 1 + random.nextInt(10); //0-10 arası bir değer çıkacak rastgele
        System.out.println("Pideler cikiyor.");
        System.out.println("Cikan pide sayisi: " + pide_sayisi);
        Thread.sleep(3000);
        while (pide_sayisi != 0) {
            System.out.println(pide_kuyrugu.poll() + " pidesini aldi.");
            pide_sayisi--;
            Thread.sleep(1000);
        }
        System.out.println("Pide kalmadi.");


    }
}
