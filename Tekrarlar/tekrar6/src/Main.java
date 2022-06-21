import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Beden Kitle Indeksi Hesaplayici");
        System.out.println("------------------");
        System.out.print("Kilonuz: ");
        int kilo = scanner.nextInt();
        System.out.print("Boyunuz (1,85 gibi)= ");
        double boy = scanner.nextDouble();

        double bki = (kilo / (boy * boy));

        if (bki < 18.5) {
            System.out.println("Beden kitle indeksiniz: " + (int) bki + " Zayifsiniz.");
        } else if (bki >= 18.5 && bki < 25) {
            System.out.println("Beden kitle indeksiniz: " + (int) bki + " Normalsiniz.");


        } else if (bki >= 25 && bki < 30) {
            System.out.println("Beden kitle indeksiniz: " + (int) bki + " Fazla kilolusunuz");

        } else {
            System.out.println("Beden kitle indeksiniz: " + (int) bki + " Obezitesiniz");
        }
    }
}
