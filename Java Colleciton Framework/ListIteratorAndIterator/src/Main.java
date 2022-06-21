import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    // ListIterator vs Iterator

    /*
    ListIterator

    Sadece List Interface'i implemente eden classlarda kullanılır.
    next() ve previous() metodu vardır.
    Ekstradan add() metodu bulunur.

    Iterator:

    Set , Queue ve List Interface'i implement'e eden classlarda kullanılabilir.
    previous() metodu yoktur.

    */
    public static void main(String[] args) {

       /* Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Go");

        Iterator<String> iterator1 = set.iterator();

        List<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Go");

        Iterator<String> iterator2 = list.iterator();

        while (iterator1.hasNext()){
            System.out.println(iterator1.next());

        }
        System.out.println("--------------");
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());

        }
        System.out.println("--------------");
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());

        }

        */

        List<String> list = new ArrayList<String>();


        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Go");
        ListIterator<String> iterator = list.listIterator();
/*              İkinci yorum
        while (iterator.hasNext()) {

            System.out.println(iterator.next());

        }
        System.out.println("-------------");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());

        }

         */


        while (iterator.hasNext()){
            String value=iterator.next();
            if (value.equals("Go")){
                iterator.remove();

            }

        }
        for (String s: list){
            System.out.println(s);


        }




    }
}
