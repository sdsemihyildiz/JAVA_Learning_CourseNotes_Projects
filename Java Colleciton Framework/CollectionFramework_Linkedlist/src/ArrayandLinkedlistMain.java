import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayandLinkedlistMain {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();


        zamanHesapla("LinkedList", linkedList);
        //zamanHesapla("ArrayList", arrayList); arraylist çok daha yavaş


    }

    public static void zamanHesapla(String veri_tipi, List<Integer> list) {
        //listenin sonunda değer ekleme

        long baslangic;

        long bitis;

        baslangic=System.currentTimeMillis();

        for (int i = 0; i < 1000000; ++i) {
            list.add(0,i);

        }
        bitis=System.currentTimeMillis();

        System.out.println(veri_tipi+" ekleme suresi "+(bitis-baslangic)+" ms");

            //linkedlist değerleri referansta tuttuğu için bütün değerler ile ilgilenmiyor
        // bundan dolayı daha hızlı

    }
}
