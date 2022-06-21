import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        do{
        //Koşul doğru olduğu sürece
        //while dan farkı en az bir lere çalışmasının garanti olması.
        }while(Koşul);

         */
        /*
        int i = 0;
        do {
            System.out.println("i= " + i);
            i++;
        } while (i < 5);
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        //6869
        int total = 0;
        do {
            total += number % 10;
            number /= 10;

        } while (number > 0);
        System.out.println("Total= " + total);


    }
}
