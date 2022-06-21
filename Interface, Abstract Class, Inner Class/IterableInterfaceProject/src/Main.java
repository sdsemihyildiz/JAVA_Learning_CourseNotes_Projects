import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kumanda programina hosgeldiniz.");
        Scanner scanner = new Scanner(System.in);
        String islemler = "Islemler..\n" + "1. Kanallari goster\n" + "2. Kanal ekle\n" + "3. Kanal sil\n" +
                "4. Kanal sayisi ogren\n" + "Cikis icin q'ya basin.";

        Kumanda kumanda = new Kumanda();

        while (true) {
            System.out.println(islemler);
            System.out.print("Islemi giriniz: ");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan cikiliyor.");
                break;
            } else if (islem.equals("1")) {
                kanallariGoster(kumanda);


            } else if (islem.equals("2")) {
                System.out.print("Eklenecek kanal: ");
                String kanal_ismi = scanner.nextLine();
                kumanda.kanal_ekle(kanal_ismi);


            } else if (islem.equals("3")) {
                System.out.print("Silinecek kanal: ");
                String kanal_ismi = scanner.nextLine();
                kumanda.kanal_sil(kanal_ismi);

            } else if (islem.equals("4")) {
                System.out.print("Kanal sayisi: "+kumanda.kanal_sayisi());



            } else {
                System.out.println("Gecersiz islem..");
            }

        }

    }

    public static void kanallariGoster(Kumanda kumanda) {
        if (kumanda.kanal_sayisi() == 0) {
            System.out.println("Su anda hicbir kanal bulunmuyor");

        } else {
            for (String kanal : kumanda) {
                System.out.println("Kanal: " + kanal);

            }
        }
    }
}
