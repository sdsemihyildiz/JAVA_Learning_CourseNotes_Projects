public class Main {
    public static void main(String[] args) {


        //    int a=30/0; //unchecked exception  ArithmeticException

       /*  int []a={1,2,3,4,5,6}; // ArrayIndexOutOfBoundsException
        System.out.println(a[6]);

        */
/*
        try {
            //int a=30/0;
            int[] array = {1, 2, 3, 4, 5, 6};
            System.out.println(array[6]);
        } catch (ArrayIndexOutOfBoundsException e) { //RuntimeException e yazabilirdik çünkü bu üst classı
            e.printStackTrace(); //hatanın ne olduğunu ekrana bastirma türünü bulma
            System.out.println("Array boyunu astiniz");
        }

 */ //Catch bloklarını özelden genele doğru yazmalıyız yani özellikle belirlediğimiz bir hatadan genel olaran Exceptiona doğru
        try {
            int b=30/0;
            int[]a={1,2,3,4,5};
            System.out.println(a[6]);

        }
        catch (ArithmeticException e){
            System.out.println("Bir sayi 0'a bolunemez...");


        }
        catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Arrayin boyunu astiniz");

        }
        System.out.println("Burasi calisiyor");


    }
}
