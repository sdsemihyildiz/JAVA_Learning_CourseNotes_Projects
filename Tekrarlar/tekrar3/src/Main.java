import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("Lutfen bir sayi daha giriniz: ");
        int sayi2 = scanner.nextInt();

        System.out.println("---Degismeden once---");

        System.out.println("Birinci sayi: " + sayi1);
        System.out.println("Ikinci sayi: " + sayi2);

        System.out.println("---Degistikten sonra---");

        int gecici;
        gecici = sayi2;
        sayi2 = sayi1;

        System.out.println("Birinci sayi: " + gecici);
        System.out.println("Ikinci sayi: " + sayi2);
    }
}
