import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {

        //ArrayList<String> arrayList=new ArrayList<String>();
        List<String> list =new ArrayList<String>();
        //Elemana erişme
        list.add("Semih");
        list.add("Enes");
        list.add("Osman");
        list.add("Tunahan");
        //Elemana erişme
        /*
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

         */
        for (int i=0;i< list.size();++i){
            System.out.println(list.get(i));

        }
        System.out.println("********");
        //for each ile bastırma
        list.remove(1);  // belli bir elemanı silme
        for (String s: list){
            System.out.println(s);


        }





    }
}
