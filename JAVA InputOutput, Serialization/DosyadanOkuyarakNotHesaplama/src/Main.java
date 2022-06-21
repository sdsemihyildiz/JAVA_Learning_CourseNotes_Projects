import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static String harfNotuHesapla(String isim, int vize1, int vize2, int finalnot) {

        String cikti = "";
        double toplamnot = (vize1 * 3 / 10) + (vize2 * 3 / 10) + (finalnot * 4 / 10);

        if (toplamnot >= 90) {
            cikti = isim + " bu dersten AA aldi..";

        } else if (toplamnot >= 85) {
            cikti = isim + " bu dersten BA aldi.";


        } else if (toplamnot >= 80) {
            cikti = isim + " bu dersten BB aldi.";


        } else if (toplamnot >= 75) {
            cikti = isim + " bu dersten CB aldi.";


        } else if (toplamnot >= 70) {
            cikti = isim + " bu dersten CC aldi.";


        } else if (toplamnot >= 65) {
            cikti = isim + " bu dersten DC aldi.";


        } else if (toplamnot >= 60) {
            cikti = isim + " bu dersten DD aldi.";


        } else if (toplamnot >= 55) {
            cikti = isim + " bu dersten FD aldi.";


        } else {
            cikti = isim + " bu dersten FF aldi.";
        }

        return cikti;

    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new FileReader("dosya.txt"));
             FileWriter writer = new FileWriter("harfnotlari.txt")) {
            while (scanner.hasNextLine()) {
                String ogrenciBilgileri = scanner.nextLine();

                String[] ogrenciArray = ogrenciBilgileri.split(",");

                int vize1 = Integer.valueOf(ogrenciArray[1]);

                int vize2 = Integer.valueOf(ogrenciArray[2]);

                int finalnot = Integer.valueOf(ogrenciArray[3]);

                String cikti = harfNotuHesapla(ogrenciArray[0], vize1, vize2, finalnot);
                writer.write(cikti + "\n");


            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi.");
        } catch (IOException e) {
            System.out.println("Dosya olusurken hata olustu.");
        }


    }
}
