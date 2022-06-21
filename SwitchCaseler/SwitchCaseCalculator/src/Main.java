import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("******************");
        String islemler = "1. Toplama Islemi\n"
                + "2. Cikarma islemi\n"
                + "3. Carpma islemi\n"
                + "4. Bolme islemi\n";
        System.out.println(islemler);
        System.out.println("******************");
        System.out.println("Islemi seciniz.");
        String islem = scanner.nextLine();
        int a;
        int b;
        switch (islem) {


            case "1":
                System.out.print("Birinci sayi: ");
                a = scanner.nextInt();
                System.out.print("Ikinci sayi: ");
                b = scanner.nextInt();
                System.out.println("Girilen degerlerin Toplami= " + (a + b));
                break;
            case "2":
                System.out.print("Birinci sayi: ");
                a = scanner.nextInt();
                System.out.print("Ikinci sayi: ");
                b = scanner.nextInt();
                System.out.println("Girilen degerlerin farklari= " + (a - b));
                break;
            case "3":
                System.out.print("Birinci sayi: ");
                a = scanner.nextInt();
                System.out.print("Ikinci sayi: ");
                b = scanner.nextInt();
                System.out.println("Girilen degerlerin carpımları= " + (a * b));
                break;
            case "4":
                System.out.print("Birinci sayi: ");
                a = scanner.nextInt();
                System.out.print("Ikinci sayi: ");
                b = scanner.nextInt();
                System.out.println("Girilen degerlerin birbirine bolumu= " + ((double) a / b));
                break;
            default:
                System.out.println("Gecersiz islem.");
        }


    }
}
