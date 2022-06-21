import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    //Ekleme sırasına göre depolamaz
    //Bir hash sadece bir defa varolabilir (key)
    //Bir değer birden fazla kere kullanılabilir (value)

    public static void main(String[] args) {

        HashMap<Integer,String>hashMap=new HashMap<Integer,String >();

        hashMap.put(10,"Java");
        hashMap.put(30,"Python");
        hashMap.put(50,"Php");
        hashMap.put(20,"Php");

        hashMap.put(50,"Javascript");
/*
        System.out.println(hashMap);
        System.out.println(hashMap.get(50));
        System.out.println(hashMap.get(10));
        System.out.println(hashMap.get(100)); //hata vermez fakat karşılığı olmadı için null bir referans görürüz.

 */
        for (Map.Entry<Integer,String>entry: hashMap.entrySet()){

            System.out.println("Anahtar: "+entry.getKey()+" ---> Deger: "+entry.getValue());



        }








    }
}
