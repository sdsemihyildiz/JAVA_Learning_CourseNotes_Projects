import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* for (int i=0;i<10;i++){
            System.out.println("i= "+i); */
        /* int i=10;
        while (i<100){
            System.out.println("i= "+i);
            i+=3; */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz.");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;
        while (sayi > 0) {
            faktoriyel *= sayi;
            sayi--;

        }
        System.out.println("Faktoriyel= " + faktoriyel);
    }
}

