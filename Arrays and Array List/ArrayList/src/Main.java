import java.util.ArrayList;

//Array listler arraylerin genişletilebilir halleridir. Mantığı array ile aynıdır. ArrayList<String>arrayList=new ArrayList<>();
// System.out.println(arrayList.get(0)); -----> 0. indexi yani 1. elemanı çağırıyor
//System.out.println(arrayList.size()); arraylistin kaç tane elemanı olduğunu bulmak için kullanılır

//  for (int i=0;i<arrayList.size();i++){System.out.println(arrayList.get(i));}    array listi yazdırmak için komut

//arrayList.remove(0); 0. indeksi siler ya da bu örnek için arrayList.remove("Metallica");

//System.out.println(arrayList.indexOf("Metallica")); bir arraylist içinde arrayin hangi sırada olduğunu bulma

// aynı elemandan iki tane var ise lastindexof komutu ile bir sonraki aynı elemana kadar işlemi devam ettiririrz.
//System.out.println(arrayList.lastIndexOf("Metallica"));


public class Main {

    public static void yazdir(ArrayList<String> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println("Element " + (i + 1) + ": " + a.get(i));

        }
    }

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Metallica");
        arrayList.add("Guns and Roses");
        arrayList.add("Black Sabbath");
        arrayList.add("Iron Maiden");
        arrayList.add("Megadeth");



       /*  System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(3));

        System.out.println(arrayList.size()); */ // 1. yorum

        // arrayList.remove(0);

        // arrayList.remove("Metallica");

         /* System.out.println(arrayList.indexOf("Metallica"));
        System.out.println(arrayList.lastIndexOf("Metallica"));
        System.out.println(arrayList.lastIndexOf("Dream Theater"));

            */ // ikinci yorum


      //  arrayList.set(4, "Megadeth"); // bu komut ile yeni bir eleman atadık.


  /*       for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        */ //3. yorum

        yazdir(arrayList);
    }
}
