public class Main {
    public static void skorhesapla(String isim, int puan) {
        System.out.println(isim + " adli oyuncunun " + puan + " puani var");

    }

    public static void skorhesapla(int puan) {
        System.out.println("Isimsiz oyuncunun puani: " + puan);
    }

    public static void skorhesapla(String isim) {
        System.out.println(isim + " adli oyuncunun hic puani yok.");
    }
    //overloading: bir fonksiyona birden fazla parametre çağırarak aşırı yükleme yapmak.
    //Önemli olan şey fonksiyon isminin aynı şekilde kalması.
    /*
    public static void toplama(String a, String b) {

        System.out.println(a + " " + b);
    }

    public static void toplama(int a, int b) {
        System.out.println("Toplamlari= " + (a + b));
    }

    public static void toplama(int a, int b, int c) {
        System.out.println("Toplamlari = " + (a + b + c));

    } */

    public static void main(String[] args) {
        /*toplama(3, 4, 5);
        toplama(2, 5);
        toplama("Mustafa Murat","Semih"); */
        skorhesapla("Semih", 1000);
        skorhesapla(672);
        skorhesapla("Enes");


    }
}
