import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         /*
        Çalışanlar Programı

        Calisan Sınıfı Şeklinde Bir Üst Sınıf

        Calisan Sınıfından Türeyen Yazilimci adında Bir Alt Sınıf
        Calisan Sınıfından Türeyen Yonetici adında Bir Alt Sınıf

        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calisanlar programina hosgeldiniz...");
        String islemler = "Islemler...\n"
                + "1. Yazilimci Islemleri\n"
                + "2. Yonetici Islemleri\n"
                + "Cikis icin q'ya basin";
        System.out.println("----------------------------");
        System.out.println(islemler);
        System.out.println("----------------------------");
        while (true) {

            System.out.println("Islemi seciniz: ");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan cikiliyor...");
                break;
            } else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("Semih", "Yildiz", "987654", "JAVA");
                String yazilimci_islem = "1. Format At\n"
                        + "2. Bilgileri Goster\n"
                        + "Cikis icin q'ya basin";
                System.out.println(yazilimci_islem);

                while (true) {
                    System.out.println("Islemi seciniz: ");

                    String y_islem = scanner.nextLine();
                    if (y_islem.equals("q")) {
                        System.out.println("Yazilimci islemlerinden cikiliyor.");

                        break; //sadece içinde bulunduğu while true döngüsünü sonlandırıyor.

                    } else if (y_islem.equals("1")) {

                        System.out.println("Isletim sistemi: ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);

                    } else if (y_islem.equals("2")) {
                        yazilimci.bilgilerigoster();

                    } else {
                        System.out.println("Gecersiz yazilimci islemi...");
                    }
                }


            } else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici("Enes", "Simsek", "315269", 31);
                String yonetici_islem = "Yonetici Islemleri\n"
                        + "1. Zam Yap\n"
                        + "2. Bilgileri Goster\n"
                        + "Cikis icin q'ya basin";
                System.out.println(yonetici_islem);
                while (true) {
                    System.out.println("Islem seciniz: ");
                    String y_islem = scanner.nextLine();
                    if (y_islem.equals("q")) {
                        System.out.println("Yonetici islemlerinden cikiliyor..");
                        break;
                    } else if (y_islem.equals("1")) {
                        System.out.println("Yoneticinin ne kadar zam yapmasini istiyorsunuz: ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);

                    } else if (y_islem.equals("2")) {
                        yonetici.bilgilerigoster();


                    } else {
                        System.out.println("Gecersiz Yonetici islemi...");
                    }


                }


            } else {
                System.out.println("Gecersiz islem...");

            }


        }


    }
}
