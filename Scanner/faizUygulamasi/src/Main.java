import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Faiz uygulaması
        Kullanıcıdan ana para değerini ve parasını kaç yıl vadeli yatırmak istediğinin bilgisini alı ve her sene sonunda
        toplam para miktarını ekrana yazdirin.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamiza hosgeldiniz. Faiz orani: %6");
        int anapara, vade;
        System.out.print("Yatirmak istediginiz tutar: ");
        anapara = scanner.nextInt();
        System.out.print("Paranizi kac yil vadeli yatirmak istiyorsunuz: ");
        vade = scanner.nextInt();
        double toplampara = anapara;
        double faizOrani = 0.06;
        for (int i = 1; i <= vade; i++) {
            toplampara = ((toplampara * faizOrani) + toplampara);
            System.out.println(i + ". yilin sonunda toplam para: " + (int) toplampara);

        }


    }
}
