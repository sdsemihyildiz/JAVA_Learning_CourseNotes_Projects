//static anahtar kelimesi ile yazdığımızda objeye bağlı değil sınıfa bağlı olarak işlem görür.
//sınıfa ait oldukları için bellekte bir defa oluşurlar ve sınıf ismi üzerinden direkt olarak erişebiliyoruz.
public class Main {
    public static void main(String[] args) {

        /* Seyirci seyirci1 = new Seyirci("Semih");
        Seyirci seyirci2 = new Seyirci("Enes");


        seyirci1.oyun_seyret();

        seyirci2.oyun_seyret();

                        //hem obje hem class üzerinden ulaşabiliyoruz seyirci_sayisina

        System.out.println("Seyirci sayisi: " + Seyirci.getSeyirci_sayisi());
        System.out.println("Seyirci sayisi: " + seyirci1.getSeyirci_sayisi());
      System.out.println("Seyirci sayisi: " + seyirci2.seyirci_sayisi);

        */

        selamla();
        System.out.println(Math.PI);

    }
    public static void selamla(){
        System.out.println("Selamlar....");
    }
}
