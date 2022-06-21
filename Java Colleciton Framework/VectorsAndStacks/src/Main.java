import java.util.*;

public class Main {
    public static void main(String[] args) {

        Vector<String >vector=new Vector<String>();
        vector.add("Java");
        vector.add("Python");
        vector.add("C++");
        vector.add("Php");

/* 1. yorum
        for (String s: vector){
            System.out.println(s);


        }

 */
  //Iterator kullanarak ekrana bastırma
        /*  2. yorum
        ListIterator<String> iterator= vector.listIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }

         */
// Enumeration kullanarak bastırma
        /*  3. yorum
        Enumeration<String>enumeration= vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

         */

        //System.out.println("Ilk eleman: "+vector.firstElement());
        //System.out.println("Son eleman: "+vector.lastElement());

        Stack<String>stack=new Stack<String>();
        stack.push("Java");
        stack.push("Python");
        stack.push("Php");
        stack.push("Go");
/*
        for (String s: stack){
            System.out.println(s);
        }

 */
/*
        Enumeration<String>enumeration= stack.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());

        }
        System.out.println("---------------------");

 */
      //  System.out.println(stack.peek()); //stack içine son giren elemanı al

      /*   System.out.println("Son eleman cikariliyor.."+ stack.pop());
        for (String s: stack){
            System.out.println(s);
        }
        System.out.println(stack.empty()); //stack boşsa true döndürür, doluysa false gönderir
       */

        while (!stack.empty()){

            System.out.println("Eleman cikariliyor: "+stack.pop());
            //Eklenme sırasına göre elemanları çıkartıyor
        }













    }
}
