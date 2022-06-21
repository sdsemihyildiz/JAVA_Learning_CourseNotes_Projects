import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //change the variables you took from the user

        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;

        System.out.print("Number 1: ");
        number1 = scanner.nextInt();

        System.out.print("Number 2: ");
        number2 = scanner.nextInt();
        System.out.print("Before change!");
        System.out.println("\nNumber 1: " + number1 + "\nNumber 2: " + number2);

        int temporary = number1;
        number1 = number2;
        number2 = temporary;
        System.out.println();
        System.out.print("After change!");
        System.out.println("\nNumber 1: " + number1 + "\nNumber 2: " + number2);

    }
}
