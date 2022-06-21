import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        try (FileWriter writer1 = new FileWriter("dosya.txt");
             FileWriter writer2 = new FileWriter("dosya2.txt")) {



            writer1.write("Semih\n");
            writer2.write("Semih\n");

 */
        try (FileWriter writer1 = new FileWriter("diller.txt")) {
            Scanner scanner = new Scanner(System.in);
            String dil;
            while (true) {
                System.out.print("Bir dil giriniz: ");
                dil = scanner.nextLine();



                if (dil.equals("-1")) {
                    System.out.println("Programdan cikiliyor..");
                    System.out.println("Dosyayi kontrol edin..");
                    break;
                }
                writer1.write(dil + "\n");


            }

        } catch (IOException e) {
            System.out.println("Dosya olusturulurken hata olustu...");
        }
    }
}
