import java.security.spec.ECFieldF2m;
import java.util.InputMismatchException;
import java.util.Scanner;

class CarpmaException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("Iki sayi da cok buyuk, lutfen daha kucuk sayilar girin(10.000 den kucuk)");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------");
        System.out.println("Pls select an Action");
        String actions = """
                1. Addition
                2. Subtraction
                3. Multiplication
                4. Dividing
                """;
        System.out.println(actions);
        System.out.println("---------");
        String action = scanner.nextLine();
        int a;
        int b;
        try {


            switch (action) {
                case "1":
                    System.out.print("Number 1: ");
                    a = scanner.nextInt();
                    System.out.print("Number 2: ");
                    b = scanner.nextInt();
                    System.out.print("Total: " + (a + b));
                    break;
                case "2":
                    System.out.print("Number 1: ");
                    a = scanner.nextInt();
                    System.out.print("Number 2: ");
                    b = scanner.nextInt();
                    System.out.print("Total: " + (a - b));
                    break;
                case "3":
                    System.out.print("Number 1: ");
                    a = scanner.nextInt();
                    System.out.print("Number 2: ");
                    b = scanner.nextInt();
                    if (a > 10000 && b > 10000) {
                        throw new CarpmaException();
                    }
                    System.out.print("Total: " + (a * b));
                    break;
                case "4":
                    System.out.print("Number 1: ");
                    a = scanner.nextInt();
                    System.out.print("Number 2: ");
                    b = scanner.nextInt();
                    System.out.print("Total: " + (double) a / b);
                    break;
                default:
                    System.out.print("Error, Not valid action!");
            }

        } catch (ArithmeticException e) {
            System.out.println("Bir sayi 0'a bolunemez.");

        } catch (InputMismatchException e) {
            System.out.println("Lutfen inputlari dogru formatta giriniz.");

        } catch (CarpmaException e) {
            e.printStackTrace();
        }
    }
}
