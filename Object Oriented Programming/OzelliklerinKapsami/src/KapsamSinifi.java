public class KapsamSinifi {


    private int privateDegisken = 30;

    public KapsamSinifi() {
        System.out.println("privateDegisken= " + privateDegisken);


    }

    public void onilecarp() {
        int privateDegisken = 10; // böyle yaparsak en içtekini değil ana tanımlananı alır.
// alttaki thisleri silersek en içtekini alır
        for (int i = 1; i < 6; i++) {
            System.out.println(i + "*" + this.privateDegisken + "=" + (i * this.privateDegisken));

        }

    }
}
