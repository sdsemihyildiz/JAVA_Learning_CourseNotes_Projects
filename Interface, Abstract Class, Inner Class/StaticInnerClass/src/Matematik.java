public class Matematik {

    //private double PI=Math.PI; // static yaparak aşağıda dümdüz PI yazarak kullanabiliriz
    private static double PI=Math.PI;


    public static class Alan{


        // static void kısmındaki static kısmını silsek bile hata vermeyecektir

        public static void daire_alan(int yaricap){

          //  System.out.println("Dairenin alani: "+(yaricap*yaricap*PI));//static olmadığı için direkt olarak kullanamıyoruz
            System.out.println("Dairenin alani: "+(yaricap*yaricap*Math.PI));




        }


    }

}
