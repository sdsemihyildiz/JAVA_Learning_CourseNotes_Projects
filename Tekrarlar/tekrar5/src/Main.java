import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Birinci sayi: ");
        int a= scanner.nextInt();
        System.out.print("Ikinci sayi: ");
        int b= scanner.nextInt();
        System.out.print("Ucuncu sayi: ");
        int c= scanner.nextInt();
        int maks=-1;


        if (a>=b&&a>=c){
            maks=a;
            System.out.println("En buyuk sayi: "+a);

        }else if (b>=a&&b>=c){
            maks=b;
            System.out.println("En buyuk sayi: "+b);

        }else {
            maks=c;
            System.out.println("En buyuk sayi: "+c);


        }
    }
}
