import java.util.Scanner;



                                            //REFERANSLARI ESITLEMEK



public class Main {


    public static int[] arrayi_doldur(int sayi) {
        Scanner scanner = new Scanner(System.in);
        int[] cikti = new int[sayi];
        for (int i=0;i<sayi;++i){

            cikti[i]= scanner.nextInt();


        }return cikti;

    }
    public static void arrayi_bastir(int[]array){
        for (int i=0;i< array.length;++i){
            System.out.println("Element "+(i+1)+": "+array[i])
            ;
        }

    }

    public static void main(String[] args) {

        int []a=arrayi_doldur(5);
        arrayi_bastir(a);



    }
}
