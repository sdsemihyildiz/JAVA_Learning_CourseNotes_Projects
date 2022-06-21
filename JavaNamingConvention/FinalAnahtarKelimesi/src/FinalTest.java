public class FinalTest {

    private static int say = 0;
    /*
        public final int obje_sayisi=4; //değeri ya burada tanımlarken ya da constructor içinde vermeliyiz.

        public FinalTest(){
         //   obje_sayisi=5; // final anahtar kelimesi kullandığımız için değeri tekrar değiştiremeyiz.


           //  obje_sayisi=4;

     */
    public final int obje_sayisi;
    private final String isim;

    public FinalTest(String isim) {
        this.isim = isim;

        say++;

        obje_sayisi = say;


    }

    public static int getSay() {
        return say;
    }

    public static void setSay(int say) {
        FinalTest.say = say;
    }
}
