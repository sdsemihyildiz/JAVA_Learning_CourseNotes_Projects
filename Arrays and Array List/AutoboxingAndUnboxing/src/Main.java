import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Wrapper Class
                                    Sağ taraftakiler wrapper classlar
        boolean ---> Boolean
        char ---> Character
        byte ---> Byte
        short ---> Short
        int ---> Integer
        long ---> Long
        float ---> Float
        double ---> Double


         */

        ArrayList<String> arrayList = new ArrayList<String>();

        // ArrayList<int>arrayList2=new ArrayList<int>(); // oluşturamıyor olmamızın sebebi bu tanımların ilkel tanımlamalar olması.


        Integer a = 5; // ilkel veri tipi yerine bir sınıf olarak tanımladık.

        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();


       /*  for (int i=0;i<10;++i){

            arrayList2.add(Integer.valueOf(i*4)); //Autoboxing




        }
        for (int i=0;i<arrayList2.size();i++){

            System.out.println(arrayList2.get(i).intValue()); // Unboxing


        } */


    }
}
