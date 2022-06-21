import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void mekan_kontrol(int yas) throws IOException {
        if (yas < 18) {
            // throw new ArithmeticException();
            throw new IOException();


        } else {
            System.out.println("Mekana hosgeldiniz.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen yasinizi girin: ");
        int yas = scanner.nextInt();

        try {

            mekan_kontrol(yas);

        }
        catch (IOException ex) {

            System.out.println("IOEception olustu");
        }


    }
}
