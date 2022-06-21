import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number 1: ");
        int a = scanner.nextInt();
        System.out.println("Number 2: ");
        int b = scanner.nextInt();
        System.out.println("Number 3: ");
        int c = scanner.nextInt();

        int max = -1;                                   //  Mak sayısı belli etmek için aralardaki soutlar yerine sondaki
        if (a >= b && a >= c) {                         //  sout kısmına System.out.println("Max number is " + maks);
            max =a;                                     //  yazsak bile yeterli olurdu.
            System.out.println("Max number is " + a);
        } else if (b >= a && b >= c) {
            max =b;
            System.out.println("Max number is: " + b);
        } else {
            max =c;
            System.out.println("Max number is " + c);
        }
    }
}
