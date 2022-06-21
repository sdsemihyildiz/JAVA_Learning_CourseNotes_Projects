import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Pls enter your weight (For example: 85 or 85,5): ");
        double weight= scanner.nextDouble();
        System.out.println("Pls enter your height (For example:1,80): ");
        double height= scanner.nextDouble();

        double bmi= weight / (height*height);
        System.out.println("Your Body Mass Index is:"+bmi);

    }
}
