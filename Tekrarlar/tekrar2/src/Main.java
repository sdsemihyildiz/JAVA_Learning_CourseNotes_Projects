import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kac KM yol gittiniz?: ");
        int gidilenyol= scanner.nextInt();
        System.out.print("Araciniz KM basina kac kurus yakiyor?(0,36 gibi): ");
        double yakis= scanner.nextDouble();
        int total=(int)(gidilenyol*yakis);
        System.out.print("Odemeniz gereken tutar: "+total+" TL");


    }
}
