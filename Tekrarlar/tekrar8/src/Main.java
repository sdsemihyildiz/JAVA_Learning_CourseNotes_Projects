import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Vizeniz: ");
        int vize1 = scanner.nextInt();
        System.out.print("Ikinci Vizeniz: ");
        int vize2 = scanner.nextInt();
        System.out.print("Final notunuz: ");
        int finalNotu = scanner.nextInt();


        double total = (int) ((vize1 * 0.3) + (vize2 * 0.3) + (finalNotu * 0.4));


        if (total >= 90) {

            System.out.println("Notunuz: " + "AA");

        } else if (total >= 85 && total < 90) {

            System.out.println("Notunuz: " + "BA");

        } else if (total >= 80 && total < 85) {

            System.out.println("Notunuz: " + "BB");
        } else if (total >= 75 && total < 80) {

            System.out.println("Notunuz: " + "CB");

        } else if (total >= 70 && total < 75) {

            System.out.println("Notunuz: " + "CC");
        } else if (total >= 65 && total < 70) {

            System.out.println("Notunuz: " + "DC");
        } else if (total >= 60 && total < 65) {

            System.out.println("Notunuz: " + "DD");
        } else {
            System.out.println("Notunuz: " + "FF, "+ "dersten kaldiniz.");

        }
    }
}

