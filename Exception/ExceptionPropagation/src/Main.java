public class Main {
    public static void ucuncufonksiyon() {
       /*  try {


        }catch (ArithmeticException e){
            System.out.println("Bir sayi sifira bolunemez");

        }

        */
        int a = 12 / 0;


    }

    public static void ikincifonksiyon() {
        try {
            ucuncufonksiyon();
        } catch (ArithmeticException e) {
            System.out.println("Bir sayi sifira bolunemez");

        }

    }

    public static void birincifonksiyon() {
        ikincifonksiyon();
    }

    public static void main(String[] args) {
        birincifonksiyon();


    }
}
