import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.print("First edge: ");
        a = scanner.nextInt();
        System.out.print("Second edge: ");
        b = scanner.nextInt();
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Hypotenuse: " + c);

    }
}
