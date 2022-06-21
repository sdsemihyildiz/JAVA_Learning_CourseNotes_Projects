import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir pozitif tam sayi gir: ");
        int pozitif = scanner.nextInt();
        System.out.print("Bir negatif tam sayi gir: ");
        int negatif = scanner.nextInt();
        int toplamPozitif = 0;
        int toplamNegatif = 0;


        do {
            toplamPozitif += pozitif % 10;
            pozitif /= 10;
            toplamNegatif += negatif % 10;
            negatif /= 10;


        } while (pozitif > 0 || negatif > 0);
        toplamNegatif *= -1;
        System.out.println("Sonuc: " + (toplamPozitif - toplamNegatif));
    }
}
