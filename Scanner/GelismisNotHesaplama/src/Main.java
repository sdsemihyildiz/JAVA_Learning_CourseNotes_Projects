import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Toplam not <55 --FF
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vize1: ");
        int vize1 = scanner.nextInt();
        System.out.print("Vize2: ");
        int vize2 = scanner.nextInt();
        System.out.print("Final: ");
        int finalnot = scanner.nextInt();
        System.out.print("Okul Ortalamaniz: ");
        double ortalama = scanner.nextDouble();
        double toplamnot = ((vize1 * (3 / 10.0)) + (vize2 * (3 / 10.0)) + (finalnot) * (4 / 10.0));
        if (toplamnot >= 90) {                // Asagidaki Toplam not kismini yazmaya gerek yok benim eksta yazim hatam
            System.out.println("AA");
        } else if (toplamnot >= 85 && toplamnot < 90) {
            System.out.println("BA aldiniz.");

        } else if (toplamnot >= 80 && toplamnot < 85) {
            System.out.println("BB aldiniz.");

        } else if (toplamnot >= 75 && toplamnot < 80) {
            System.out.println("CB aldiniz.");

        } else if (toplamnot >= 70 && toplamnot < 75) {
            System.out.println("CC aldiniz.");

        } else if (toplamnot >= 65 && toplamnot < 70) {
            System.out.println("DC aldiniz.");

        } else if (toplamnot >= 60 && toplamnot < 65) {
            System.out.println("DD aldiniz.");
            if (ortalama < 2.5) ;
            System.out.println("DD aldiniz ve not ortalamaniz dusuk, dersi tekrardan almayi dusunebilirsiniz.");

        } else if (toplamnot >= 55 && toplamnot < 60) {

            System.out.println("FD aldiniz.");
        } else {
            System.out.println("FF aldiniz.");
        }
    }
}
