import java.util.Scanner;

public class Main {
    public static void selamlama() {
        System.out.println("Merhaba nasilsiniz ?");
        System.out.println("Selamlar...");
    }

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        int fakt = 1;
        while (sayi > 0) {
            fakt *= sayi;
            sayi--;
        }
        System.out.println("Faktoriyel= " + fakt);

    }

    public static void main(String[] args) {
        /*
                     public             static          void        main        (String[]args)
        Erişim_Belirleyici(Opsiyonel) Ekstra_Özellikler Dönüş_Tipi Fonksiyon_Adı(Parametreler) {

        // burası fonksion bloğu

        //fonksionun yapacağı işler burada olacak.
        }

         */

        factorial();

        factorial();

    }
}
