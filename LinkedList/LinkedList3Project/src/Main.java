import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void islemleri_bastir() {
        System.out.println("0- Islemleri goruntule");
        System.out.println("1- Bir sonraki sehire git");
        System.out.println("2- Bir onceki sehire git");
        System.out.println("3- Uygulamadan cik");


    }

    public static void sehirleri_turla(LinkedList<String> sehirler) {

        ListIterator<String> iterator = sehirler.listIterator();
        int islem;

        islemleri_bastir();

        Scanner scanner = new Scanner(System.in);

        if (!iterator.hasNext()) {
            System.out.println("Herhangi bir sehir bulunmuyor..");

        }
        boolean cikis = false;
        boolean ileri = true;       // düzeltmek için yazdık

        while (!cikis) {
            System.out.println("Bir islem seciniz.");
            islem = scanner.nextInt();
            switch (islem) {

                case 0:
                    islemleri_bastir();
                    break;

                case 1:
                    if (!ileri) {                   // düzeltmek için yazdık
                        if (iterator.hasNext()) {  // düzeltmek için yazdık
                            iterator.next();  // düzeltmek için yazdık
                        }   // düzeltmek için yazdık
                        ileri = true;  // düzeltmek için yazdık

                    }
                    if (iterator.hasNext()) {
                        System.out.println("Sehre gidiliyor: " + iterator.next());
                    } else {
                        System.out.println("Gidilecek sehir kalmadi.");// artik iterator null olduğundan bunu söylüyoruz
                        ileri = true;  // düzeltmek için yazdık
                    }
                    break;

                case 2:
                    if (ileri) { // düzeltmek için yazdık
                        if (iterator.hasPrevious()) { // düzeltmek için yazdık
                            iterator.previous(); // düzeltmek için yazdık

                        } // düzeltmek için yazdık
                        ileri = false; // düzeltmek için yazdık

                    }
                    if (iterator.hasPrevious()) {
                        System.out.println("Sehre gidiliyor: " + iterator.previous());

                    } else {
                        System.out.println("Sehir turu basladi.");

                    }
                    break;

                case 3:

                    cikis = true;
                    System.out.println("Uygulamadan cikiliyor.");
                    break;

            }
        }


    }

    public static void main(String[] args) {


        LinkedList<String> sehirler = new LinkedList<String>();

        sehirler.add("Ankara");
        sehirler.add("Eskisehir");
        sehirler.add("Afyonkarahisar");

        sehirleri_turla(sehirler);


    }


}
