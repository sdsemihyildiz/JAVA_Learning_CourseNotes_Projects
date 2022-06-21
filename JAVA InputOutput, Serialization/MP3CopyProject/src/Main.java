import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    private static ArrayList<Integer> icerik = new ArrayList<Integer>();

    public static void dosya_oku() {

        try {
            FileInputStream in = new FileInputStream("hotelcalifornia.mp3");

            int oku;
            while ((oku = in.read()) != -1) {
                icerik.add(oku);


            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void kopyala(String dosyaismi) {

        try {
            FileOutputStream out = new FileOutputStream(dosyaismi);
            for (int deger : icerik) {
                out.write(deger);


            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) {
        //Dosyanın tümünü almak için arraylist kullanacağız

        dosya_oku();
        long baslangic = System.currentTimeMillis();

        kopyala("hotelcalifornia2.mp3");
        kopyala("hotelcalifornia3.mp3");
        kopyala("hotelcalifornia4.mp3");

        long bitis = System.currentTimeMillis();
        System.out.println("Uc dosyanin kopyalanmasi su kadar surdu: " + ((bitis - baslangic) / 1000) + " saniye.");


    }
}
