import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your weight: ");
        int weight = scanner.nextInt();
        System.out.print("Your height: ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("Weak");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal");

        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
