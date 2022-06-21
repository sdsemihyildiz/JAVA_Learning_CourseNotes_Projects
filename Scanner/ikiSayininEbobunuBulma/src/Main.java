import java.util.Scanner;

public class Main {
    public static int ebobBulma(int sayi1, int sayi2) {

        int ebob = 1;


        for (int i = 1; i <= sayi1 && i <= sayi2; i++) {

            if ((sayi1 % i == 0) && (sayi2 % i == 0)) {
                ebob = i;


            }

        }
        return ebob;


    }


    public static void main(String[] args) {
        // Kullanicidan alinan iki sayinin ebobunu bulma.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz: ");
        int birincisayi = scanner.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        int ikincisayi = scanner.nextInt();
        System.out.print("Iki sayinin ebobu: " + ebobBulma(birincisayi, ikincisayi));


    }
}
