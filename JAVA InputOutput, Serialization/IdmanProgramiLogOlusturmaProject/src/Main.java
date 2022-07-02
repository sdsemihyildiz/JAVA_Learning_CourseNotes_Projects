import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Idman programina hosgeldiniz.");
        System.out.println("---------------");
        String idmanlar = "Gecerli hareketler...\n" + "Burpee\n" + "PushUp(Sinav)\n"
                + "SitUp(Mekik)\n" + "Squat\n";
        System.out.println(idmanlar);
        System.out.println("---------------");
        System.out.println("Bir idman olusturun...");
        System.out.println("---------------");
        System.out.print("Burpee Sayisi: ");
        int burpee = scanner.nextInt();
        System.out.print("PushUp Sayisi: ");
        int pushUp = scanner.nextInt();
        System.out.print("SitUp Sayisi: ");
        int situp = scanner.nextInt();
        System.out.print("Squat Sayisi: ");
        int squat = scanner.nextInt();

        scanner.nextLine();

        Idman idman = new Idman(burpee, pushUp, situp, squat);
        System.out.println("-------");
        System.out.println("Idmaniniz basliyor...");

        int i = 1;
        try (FileWriter writer = new FileWriter("Log.txt")) {

            writer.write("Idman programi....\n");
            writer.write("Burpee sayisi: "+idman.getBurpee_sayisi()+" \n");
            writer.write("Pushup sayisi: "+idman.getPushup_sayisi()+" \n");
            writer.write("SitUp sayisi: "+idman.getSitup_sayisi()+" \n");
            writer.write("Squat sayisi: "+idman.getSquat_sayisi()+" \n");


            while (idman.idmanBittiMi() == false) {
                System.out.print("Hareket Turu(Burpee, Pushup, Situp, Squat): ");
                String tur = scanner.nextLine();
                System.out.print("Bu hareketten kac tane yapmak istiyorsunuz: ");
                int sayi = scanner.nextInt();
                scanner.nextLine();
                idman.hareketYap(tur, sayi);

                writer.write(i+". Islem------> Hareket: "+ tur+" Sayi: "+sayi+"\n");
                i++;



            }
            System.out.println("Idmanini basari ile bitirdin...");

        } catch (IOException e) {
            System.out.println("");
        }




    }
}
