import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Araciniz kilometrede kac kurus yakiyor? (Ornek olarak: 0,32 kurus gibi): ");
        double kurus = scanner.nextDouble();

        System.out.print("Araciniz ile kac km gittiniz?(Ornek olarak 15 veya 15,2 gibi): ");
        double km = scanner.nextDouble();
        double yakis = km * kurus;
        System.out.print("Odemeniz gereken tutar: " + yakis + "TRY");
    }
}
