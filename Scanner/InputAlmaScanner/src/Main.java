
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir Sayi giriniz.");

        if (scanner.hasNextInt()) {
            int sayi = scanner.nextInt();
            System.out.println("Sayi: " + sayi);

        } else {
            System.out.println("Daha sonra lutfen bir sayi giriniz....!");
        }
    }
}
