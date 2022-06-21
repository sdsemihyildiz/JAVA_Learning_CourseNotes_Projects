import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> diller = new ArrayList<String>();

        diller.add("Java");
        diller.add("PHP");
        diller.add("Python");
        diller.add("Kotlin");
        diller.add("C#");
       /*                                       1. yorum
        for (int i=0;i< diller.size();i++){
            System.out.println(diller.get(i));
        }

        */


        for (String s : diller) {                   // For each şeklinde gösterimi
            System.out.println(s);
        }

        System.out.println("-----------------------");

        diller.add(1, "C++");

        for (String s : diller) {
            System.out.println(s);
        }
        // Normal şartlarda bunu yaptığımızda index 1 deki eleman ve sonraki elemanlar bir sonraki indexe kayıyor ve
        // belirlediğimiz indexin içine yenisi ekleniyor fakay bu çok fazla efor sarfettirdiği için mantıklı değil
        // sonraki elemanlar bir sonraki indexe kayıyor ve belirlediğimiz indexin içine yenisi ekleniyor
        // fakat bu çok fazla efor sarfettirdiği için mantıklı değil.


        // Linkedlistte ise her bir obje bir referans taşıyarak bir sonrakine doğru taşınıyor. Sondaki elemanda ise null referansı olur.

        System.out.println("-----------------------");

        LinkedList<String>linkedList=new LinkedList<String>();
        linkedList.add("Semih");
        linkedList.add("Enes");
        linkedList.add("Osman");

        System.out.println(linkedList);

    }
}
