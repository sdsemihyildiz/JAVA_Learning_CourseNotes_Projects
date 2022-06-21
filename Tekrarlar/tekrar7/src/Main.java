import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler = "1. Toplama islemi\n"
                + "2. Cikarma islemi\n"
                + "3. Carpma islemi\n"
                + "4. Bolme islemi";
        System.out.println("Bir islem seciniz.");
        System.out.println(islemler);
        System.out.print("Islem: ");
        int a;
        int b;


        String islem = scanner.nextLine();

        switch (islem) {
            case "1":
                System.out.print("Bir sayi giriniz: ");
                a = scanner.nextInt();
                System.out.print("Bir sayi giriniz: ");
                b = scanner.nextInt();

                int toplam = a + b;
                System.out.println("Sayilarin toplamlari: " + toplam);
                break;
            case "2":
                System.out.print("Bir sayi giriniz: ");
                a = scanner.nextInt();
                System.out.print("Bir sayi giriniz: ");
                b = scanner.nextInt();
                int fark = a - b;
                if (fark < 0) {
                    fark = (a - b) * -1;

                }
                System.out.println("Sayilarin farklari: " + fark);
                break;
            case "3":
                System.out.print("Bir sayi giriniz: ");
                a = scanner.nextInt();
                System.out.print("Bir sayi giriniz: ");
                b = scanner.nextInt();
                int carpim = a * b;
                System.out.println("Sayilarin carpimlari: " + carpim);
                break;
            case "4":
                System.out.print("Bir sayi giriniz: ");
                a = scanner.nextInt();
                System.out.print("Bir sayi giriniz: ");
                b = scanner.nextInt();
                double bolumleri = (a / (double) b);
                System.out.println("Sayilarin Bolumleri: " + bolumleri);
                break;
            default:


        }

    }
}
