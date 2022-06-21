public class Main {
    public static boolean asalMi(int sayi) {
        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                return false;
            }
        }
        return true;


    }

    public static void main(String[] args) {
        /*

        1'den 1000'e kadar olan sayilardan asal olanlari ekrana yazdirin.
        Asal sayi: 1'e ve kendisinden baska hicbir sayiya tam olarak bolunmeyen sayiya denir.

         */

        for (int i = 2; i < 1000; i++) {

            if (asalMi(i)) {
                System.out.println(i);
            }


        }

    }
}
