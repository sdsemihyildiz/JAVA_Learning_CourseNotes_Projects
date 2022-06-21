import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static int[] arrayi_doldur(int sayi) {
        Scanner scanner = new Scanner(System.in);
        int[] cikti = new int[sayi];
        for (int i = 0; i < sayi; ++i) {

            cikti[i] = scanner.nextInt();


        }
        return cikti;

    }

    public static void arrayi_bastir(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.println("Element " + (i + 1) + ": " + array[i])
            ;
        }

    }

    public static void array_sort(int[] array) {

        //Array sınıfı

        Arrays.sort(array);
        arrayi_bastir(array);


    }

    public static void main(String[] args) {

        /* int []a1={1,2,3,4,5,6};
        int []a2={1,2,3,4,5,6};
        if (a1==a2){   // a1==a2 ifadesi : a1 ve a2 nin bellekleteki gösterdiği yer aynı mı diye soruyor.
            System.out.println("Esitler");

        }
        else {
            System.out.println("Esit degiller.");
        } */

        // Eşit olmamalarının sebebi objeler aynı olsa bile bellekte farklı yerlerde oldukları için eşit değillerdir.

        int[] a1 = {1, 2, 3, 4, 5, 6};
        int[] a2 = {1, 2, 3, 4, 5, 6};

        if (Arrays.equals(a1, a2)) {          // bu şekilde yazdığımızda içeriklerini kıyasladığımız için eşitler.
            System.out.println("Esitler");

        } else {
            System.out.println("Esit degiller.");
        }


    }
}
