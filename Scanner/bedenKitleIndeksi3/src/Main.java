import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pls enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Pls enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your name is: " + name + "\nYour age is: " + age);

    }
}
