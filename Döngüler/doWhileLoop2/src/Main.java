import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int odd = 0;
        int even = 0;
        do {

            if ((number % 10) % 2 == 0) {
                even += number % 10;

            }
            if ((number % 10) % 2 != 0) {
                odd += number % 10;
            }
            number /= 10;
        }
        while (number > 0);


        System.out.println("Total odd= " + odd);
        System.out.println("Total even= " + even);


    }

}
