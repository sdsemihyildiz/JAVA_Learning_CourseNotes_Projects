import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Kullanıcıdan aldığınız boy ve kilo değerlerine göre kullanıcının beden kitle indekisini bulun.
        Beden kitle Indeksi = Kilo / boy(m) * boy(m)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilonuzu girin: "); //print şeklinde yazarsak alt satıra geçmeden Kilonuzu girin: 85 buradaki gibi input verir
        int kilo = scanner.nextInt();
        System.out.print("Boyunuzu girin:(Ornek: 1,72)");
        double boy= scanner.nextDouble();
        double bki= kilo / (boy*boy);
        System.out.print("Beden Kitle Indeksiniz: "+bki);
    }
}
