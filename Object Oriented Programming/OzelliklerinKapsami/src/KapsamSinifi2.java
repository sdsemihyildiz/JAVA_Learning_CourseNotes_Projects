public class KapsamSinifi2 {

    private int privateDegisken = 30;

    public KapsamSinifi2() {


    }

    public void dahilisinifkontrol() {
        DahiliSinif d = new DahiliSinif();

        System.out.println("Kontrol ediliyor...."+d.a); //

    }

    public class DahiliSinif {

        private int privateDegisken = 20; // bunu yazarsak yukarıda tanımlanan değil en lokal olan bu değişkeni işleme alır.
        private int a = 3;

        public void onilecarp() {

            // int privateDegisken=10; // daha içeride olduğu için bu kullanılır.

            for (int i = 1; i < 6; ++i) {
                System.out.println(i + "*" + KapsamSinifi2.this.privateDegisken + " = " + (i * KapsamSinifi2.this.privateDegisken));
                // bu şekilde yazarsam java kapsamsınıfı2nin private değişkeninini alır.
            }
        }
    }
}
