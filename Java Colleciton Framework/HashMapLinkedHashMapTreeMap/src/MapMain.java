import java.util.*;

public class MapMain {

    public static void mapYazdir(Map<Integer, String> map) {
        map.put(10, "C++");
        map.put(5, "Java");
        map.put(1, "Python");
        map.put(2, "Php");
        map.put(100, "C");

      /*  birinci yorum
      for (Map.Entry<Integer, String> entry : map.entrySet()) {

            System.out.println("Key: " + entry.getKey() + "--> Deger: " + entry.getValue());

        }

       */

        /* ikinci yorum

            System.out.println(map.keySet());

         */


       /* Üçüncü yorum

       for (Integer key: map.keySet()){        // başka bir yazdırma yolu da bu.
            System.out.println("Key: "+key+" Value: "+map.get(key));
        }

        */

        // Yazdırmanın bir başka yolu
        Collection<String> values = map.values();
        for (String s : values) {
            System.out.println("Deger: " + s);
        }


    }

    public static void main(String[] args) {

        //hashmap karışık depolama
        //linkedhashmap eklenen sıraya göre depolama
        //treemap keyler küçükten büyüğe doğru sıralanır


        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();

        System.out.println("***HashMap***");
        mapYazdir(hashMap);
        System.out.println("***LinkedHashMap***");
        mapYazdir(linkedHashMap);
        System.out.println("***TreeMap***");
        mapYazdir(treeMap);

    }
}
