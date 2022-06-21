import java.util.Scanner;

public class Main {
    public static void arrayi_bastir(int[]array){

        for (int i=0;i< array.length;++i){

            System.out.println("Element "+(i+1)+":"+ array[i]);


        }

    }
    public static double ortalama_bul(int[]array){

        int toplam=0;
        for (int i=0;i< array.length;++i){
            toplam+=array[i];

        }
        return ((double) toplam/ array.length);

    }
    public static void main(String[] args) {
        //Array: belli verileri depolamak için kullanılır.


        //int a=5;

      /*  int[] a = new int[10];

        a[5] = 32;
        a[9] = 50;*/

      /*  int [] a={30,40,50,60,70};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println(a[5]); */ //5 tane değer girdiğimiz için bu değeri dahil ettiğimizde error alırız

        int[] a = new int[5];
        int []b={10,20,30,40,50};
      //  System.out.println("Arrayimizin uzunlugu: "+b.length);
        arrayi_bastir(b);
        System.out.println("Ortalama: "+ortalama_bul(b));


     /*  for (int i=0;i<5;i++){
           a[i]=i*4+2;
           System.out.println(a[i]);    // bu şekilde gösterilir.*/

      /*  Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; ++i) {

            a[i] = scanner.nextInt(); */

/*
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("******************");
            System.out.println(a[i]);
        } */


    }
}
