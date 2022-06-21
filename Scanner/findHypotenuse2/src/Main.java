import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        System.out.print("First edge: ");
        x = scanner.nextInt();
        System.out.print("Second edge: ");
        y = scanner.nextInt();
        double h = Math.sqrt(x * x + y * y);
        System.out.println("Hypotenuse is: " + h);
    }
}
