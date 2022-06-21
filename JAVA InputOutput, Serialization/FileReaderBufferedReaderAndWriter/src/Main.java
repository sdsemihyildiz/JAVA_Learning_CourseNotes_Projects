import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // try(FileReader reader=new FileReader("ogrenciler.txt")){
        try (Scanner scanner = new Scanner(new FileReader("ogrenciler.txt"))) {
            // bu şekilde yazarak bir satırı \n görene kadar okutabiliyoruz
            while (scanner.hasNextLine()) { // okuyacak bir satır kalana kadar okumaya devam et
                // System.out.print("Okunan satir: "+ scanner.nextLine()); okuyacak bir satır kalana kadar okumaya devam et
                String ogrenci_bilgisi = scanner.nextLine();
                String[] array = ogrenci_bilgisi.split(",");
                if (array[1].equals("Psikoloji")) {
                    System.out.println("Ogrenci Bilgisi: " + ogrenci_bilgisi);

                } else if (array[1].equals("Muhendislik")) {
                    System.out.println("Ogrenci Bilgisi: " + ogrenci_bilgisi);

                } else if (array[1].equals("Iletisim")) {
                    System.out.println("Ogrenci Bilgisi: " + ogrenci_bilgisi);

                }


            }


        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi.");
        } catch (IOException e) {
            System.out.println("Dosya acilirken hata olustu.");
        }

    }
}
