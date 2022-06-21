public class Main {
    public static void toplama(int a, int b, int c){
        System.out.println("Toplamlari: "+ (a+b+c));
    }
    public static void selamlama(String isim)/*göndereceğimiz parametrenin türünü parantez içinde belirliyoruz.*/ {


        System.out.println("Selamlar..."+ isim );


    }
    public static void main(String[] args) {
       /* selamlama("Semih");
        selamlama("Ayse"); */

        toplama(3,4,5);
        toplama(10,12,24);

    }
}
