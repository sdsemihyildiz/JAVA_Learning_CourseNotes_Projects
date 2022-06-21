import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen yasinizi girin: ");
        int yas = scanner.nextInt();
        if (yas < 18) {
            System.out.println("Bu mekana giremezsiniz.");

        } else{
            System.out.println("Mekana giris yapabilirsiniz.");
        }

    }
}
