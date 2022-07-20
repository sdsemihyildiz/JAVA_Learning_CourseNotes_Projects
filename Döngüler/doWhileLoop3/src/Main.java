import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 6 different number");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();
        int number6 = scanner.nextInt();
        int total = 0;
        do {
            total += number1 % 10 + number2 % 10 + number3 % 10 + number4 % 10 + number5 % 10 + number6 % 10;
            number1 /= 10;
            number2 /= 10;
            number3 /= 10;
            number4 /= 10;
            number5 /= 10;
            number6 /= 10;



        } while (number1 > 0 || number2 > 0 || number3 > 0 || number4 > 0 || number5 > 0 || number6 > 0);
        System.out.println("Total= "+ total);
    }
}
