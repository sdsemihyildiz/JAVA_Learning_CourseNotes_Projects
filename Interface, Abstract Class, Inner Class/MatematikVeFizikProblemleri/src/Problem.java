public class Problem {
    public static class Matematik { //statik inner class olusturduk

        public static void daire_alan(int yaricap) {

            System.out.println("Dairenin alani: " + (yaricap * yaricap * Math.PI));


        }

        public static void ucgenCevresi(int kenar1, int kenar2, int kenar3) {
            System.out.println("Ucgenin cevresi: " + (kenar1 + kenar2 + kenar3));


        }


    }


    public static class Fizik {

        public static void icCarpim(Vec vec1, Vec vec2) {
            int iccarpim = vec1.getI() * vec2.getI() + vec1.getJ() * vec2.getJ() + vec1.getK() * vec2.getK();
            System.out.println(vec1.getIsim() + " ile " + vec2.getIsim() + " in ic carpimi= " + iccarpim);


        }


    }
}
