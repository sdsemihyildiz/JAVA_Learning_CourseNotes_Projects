import java.util.Scanner;
/*
        Method overloading kullanarak bir tane hesap makinasi tasarlamaya çalışın.
        Toplama ve çarpma metodlarıını 2 veya 3 parametre alacak şekilde tasarlayin.
         */

public class Main {
    public static int cikarma(int a, int b) {
        return (a - b);


    }

    public static double bolme(double a, double b) {
        return (a / b);

    }

    public static int toplama(int a, int b) {
        return (a + b);
    }

    public static int toplama(int a, int b, int c) {
        return (a + b + c);
    }

    public static int carpma(int a, int b) {
        return (a * b);
    }

    public static int carpma(int a, int b, int c) {
        return (a * b * c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String islemler = """
                1. Toplama islemi
                2. Cikarma islemi
                3. Carmpa islemi
                4. Bolme islemi
                Cikis icin q'ya basiniz.""";
        System.out.println("--------------------");
        System.out.println(islemler);
        System.out.println("--------------------");
        while (true) {
            System.out.print("Islemi seciniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan cikiliyor...");
                break;

            } else if (islem.equals("1")) {

                System.out.print("Kac deger toplayacaksiniz? (2 veya 3) = ");
                int kacsayi = scanner.nextInt();
                if (kacsayi == 2) {

                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen sayilarin toplamlari: " + toplama(a, b));

                } else if (kacsayi == 3) {

                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen sayilarin toplamlari: " + toplama(a, b, c));

                } else {

                    System.out.println("Bunun icin uygun metod bulunmuyor..");
                }

            } else if (islem.equals("2")) {

                System.out.print("a: ");
                int a = scanner.nextInt();
                System.out.print("b: ");
                int b = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Girilen sayilarin farklari: " + -cikarma(a, b));


            } else if (islem.equals("3")) {
                System.out.print("Kac deger carpacaksiniz? (2 veya 3) = ");
                int kacsayi = scanner.nextInt();
                if (kacsayi == 2) {

                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen sayilarin carpimlari: " + carpma(a, b));

                } else if (kacsayi == 3) {

                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen sayilarin carpimlari: " + carpma(a, b, c));

                } else {

                    System.out.println("Bunun icin uygun metod bulunmuyor..");
                }


            } else if (islem.equals("4")) {
                System.out.print("a: ");
                int a = scanner.nextInt();
                System.out.print("b: ");
                int b = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Girilen sayilarin bolumu: " + bolme(a, b));

            } else {
                System.out.println("Gecersiz islem.");

            }


        }


    }
}
