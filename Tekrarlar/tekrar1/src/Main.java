import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilonuzu girin: ");
        int kilo = scanner.nextInt();
        System.out.print("Boyunuzu girin(Örnek: 1,80) : ");
        double boy = scanner.nextDouble();
        double bki = kilo / (boy * boy);
        System.out.print("Beden Kitle Indeksiniz: " + (int) bki);

    }
}
