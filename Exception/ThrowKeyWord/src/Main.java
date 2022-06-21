import java.util.Scanner;

public class Main {

    public static void mekan_kontrol(int yas) {
        if (yas < 18) {
            throw new ArithmeticException();

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
        } catch (ArithmeticException e) {
            System.out.println("18 Yasindan kucukler mekana giremez.");
        }

        // System.out.println("*************"); // yaş 18 den küçük olursa program sonlanacağı için bunu görmeyiz.


    }
}
