import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int brush;
        int wash;
        System.out.print("How many times you brush your teeth in a day?: ");
        brush = scanner.nextInt();
        System.out.print("How many times you wash your hands in a day?: ");
        wash = scanner.nextInt();
        System.out.println("\nBefore Change!");
        System.out.print("\nBrush: " + brush + "\nWash: " + wash);

        int temporary = brush;
        brush = wash;
        wash = temporary;

        System.out.println("\nAfter Change!");

        System.out.print("\nBrush: " + brush + "\nWash: " + wash);


    }
}
