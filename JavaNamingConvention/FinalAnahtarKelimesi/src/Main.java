public class Main {
    public static void main(String[] args) {

       /* FinalTest f1 = new FinalTest("Obje1");
        FinalTest f2 = new FinalTest("Obje2");

        System.out.println("Obje sayisi: "+f1.obje_sayisi);
        System.out.println("Obje sayisi: "+f2.obje_sayisi);

        f2.obje_sayisi=10;

        */

      // System.out.println(Math.PI); //public static final double PI = 3.14159265358979323846; final olduğu için elleyemiyoruz


        System.out.println("Database Ismi: "+Database.databaseIsmi);
        System.out.println("Username: "+Database.userName);
        System.out.println("PASSWORD: "+Database.password);

        Database.userName="root2"; //değiştiremiyoruz çünkü final ile yazıldı







    }
}
