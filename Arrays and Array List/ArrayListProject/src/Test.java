import java.util.Scanner;

public class Test {

    private static Sarkicilar sarkicilar = new Sarkicilar(); // başka bir objeyi bu class içine ekledik yani composition

    private static Scanner scanner = new Scanner(System.in);

    public static void islemleri_bastir() {

        System.out.println("\t 0-Islemleri goruntule");
        System.out.println("\t 1-Sarkicilari goruntule");
        System.out.println("\t 2-Sarkici ekle");
        System.out.println("\t 3-Sarkici guncelle");
        System.out.println("\t 4-Sarkici sil");
        System.out.println("\t 5-Sarkici ara");
        System.out.println("\t 6-Uygulamadan cik");


    }
    public static void sarkici_goruntule(){
        sarkicilar.sarkicilari_bastir();


    }
    public static void sarkici_ekle(){
        System.out.println("Eklemek istediginiz sarkicinin ismi: ");
        String isim= scanner.nextLine();
        sarkicilar.sarkici_ekle(isim);

    }
    public static void sarkici_guncelle(){
        System.out.println("Guncellemek istediginiz sarkicinin pozisyonu: ");
        int pozisyon= scanner.nextInt();
        scanner.nextLine();
        String yeni_isim= scanner.nextLine();
        sarkicilar.sarkici_guncelle(yeni_isim,pozisyon-1);



    }
    public static void sil(){
        System.out.println("Silmek istediginiz sarkicinin pozisyonu: ");
        int pozisyon= scanner.nextInt();
        sarkicilar.sarkici_sil(pozisyon-1);



    }
    public static void ara(){
        System.out.println("Aramak istediginiz sarkici: ");
        String isim= scanner.nextLine();
        sarkicilar.sarkici_ara(isim);


    }

    public static void main(String[] args) {

        System.out.println("\t Sarkici uygulamasina hosgeldiniz.");
        System.out.println("------------------------------------------");

        islemleri_bastir();
        boolean cikis = false;
        int islem;

        while(!cikis) {
            System.out.println("Bir islem seciniz:");

            islem = scanner.nextInt();

            scanner.nextLine();

            switch(islem) {
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    sarkici_goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                    break;
                case 3:
                    sarkici_guncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan cikiliyor...");
                    break;



            }


        }


    }

}

