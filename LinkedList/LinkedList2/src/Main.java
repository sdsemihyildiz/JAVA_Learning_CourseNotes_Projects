import java.util.LinkedList;
import java.util.ListIterator;



public class Main {
    public static void listeyi_bastir(LinkedList<String> gidilecek_yerler) {
        /*
        for (String s : gidilecek_yerler) {
            System.out.println(s);
        } */

        ListIterator<String> iterator = gidilecek_yerler.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

    }
    public static void sirali_ekle(LinkedList<String> gidilecek_yerler, String yeni) {
        ListIterator<String> iterator = gidilecek_yerler.listIterator();
        while (iterator.hasNext()) {

            int karsilastir = iterator.next().compareTo(yeni); //iterator içindeki değer ile gönderdiğimiz değer compare
            if (karsilastir == 0) {
                System.out.println("Listenizde bu eleman zaten var."); // eğer eşit ise değerimiz 0 çıkar
                return;
            } else if (karsilastir < 0) {    // eğer daha büyük ise -1 çıkar yani 0 dan küçük

                // yeni deger iterator.next ten daha büyük


            } else if (karsilastir > 0) {        // eğer küçük ise 0 dan büyük çıkar

                iterator.previous();       // iteratoru geri aldık
                iterator.add(yeni);        // yeni değeri ekledik

                return;

            }

        }
        iterator.add(yeni); // eğer boş ise listemiz buradan yeni eleman eklemeyi açtık


    }


    public static void main(String[] args) {

        LinkedList<String> gidilecek_yerler = new LinkedList<String>();

        sirali_ekle(gidilecek_yerler,"Postane");
        sirali_ekle(gidilecek_yerler,"Market");
        sirali_ekle(gidilecek_yerler,"Ev");
        listeyi_bastir(gidilecek_yerler);
        // alfabetik olarak sıraladı, eğer add ile yapsaydık istediğimiz sırada yapabilirdik




       /*  gidilecek_yerler.add("Postane");         2. yorum

        gidilecek_yerler.add("Market");

        gidilecek_yerler.add("Okul");

        gidilecek_yerler.add("Kutuphane");

        gidilecek_yerler.add("Spor salonu");

        gidilecek_yerler.add("Ev");

        listeyi_bastir(gidilecek_yerler);

        System.out.println("-------------------------------");

        // gidilecek_yerler.add(4,"Alisveris Merkerzi"); // 1. yorum alışveriş merkezini ekledik
        gidilecek_yerler.remove(3);  // kütüphaneyi sildik
        listeyi_bastir(gidilecek_yerler);

        */





    }
}
