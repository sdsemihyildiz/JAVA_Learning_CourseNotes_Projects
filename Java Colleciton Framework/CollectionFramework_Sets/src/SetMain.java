import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {

/*
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new LinkedHashSet<String>();
        Set<String> set3 = new TreeSet<String>();
        //Hashset
        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        set1.add("Java Script");
        set1.add("Php");
        //LinkedHashset
        set2.add("Java");
        set2.add("Python");
        set2.add("C++");
        set2.add("Java Script");
        set2.add("Php");
        //Treeset
        set3.add("Java");
        set3.add("Python");
        set3.add("C++");
        set3.add("Java Script");
        set3.add("Php");

 */

       /* set3.add("Php"); // bunu yapsak bile ekleyemeyiz çünkü 3 set türü de bir elemanı sadece bir defa ekleyebilir.

        System.out.println("Hashset**************");
        for (String s: set1){
            System.out.println(set1);

        }
        System.out.println("LinkedHashset**************");
        for (String s: set2){
            System.out.println(set2);
        }
        System.out.println("TreeSet**************");
        for (String s: set3){
            System.out.println(set3);
        }
        // bunu çalıştırdığımızda treesette alfabetik olarak sıralanıyor
        //Linkedhashsette eklediğimiz sıraya göre sıralanıyor

    }

        */

        /*

        System.out.println(set1.contains("Go")); // contains ile içinde olup olmadığını kontrol ediyoruz.
        System.out.println(set1.contains("Java"));

         */

        //    System.out.println(set1.isEmpty()); // içinde eleman olup olmadığını sorguluyoruz.

        //   set1.remove("Java");   System.out.println(set1);

        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();

        set1.add("Java");
        set1.add("C++");
        set1.add("Python");
        set1.add("Java Script");
        set1.add("Php");

        set2.add("Go");
        set2.add("Java");
        set2.add("CSS");

        Set<String> fark = new HashSet<String>(set2);
        System.out.println(fark.removeAll(set1));
        System.out.println(fark);
        // bunu yaparsak fark kümesini bulmaya çalışıyoruz eğer farklı eleman var ise true çıkıyor yok ise false çıkıyor
        System.out.println("*********");
        Set<String> kesisim = new HashSet<String>(set2);
        System.out.println(kesisim.retainAll(set1));
        System.out.println(kesisim);
// bunu yaparsak kesişim kümesini bulmaya çalışıyoruz eğer ortak eleman var ise true çıkıyor yok ise false çıkıyor


    }
}
