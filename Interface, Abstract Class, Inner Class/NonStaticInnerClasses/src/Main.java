import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //static olmayan inner classlarda obje oluşturm
        Matematik.Factorial factorial = new Matematik().new Factorial(); //Inner classlarda obje oluşturma
        Matematik.Asal asal = new Matematik().new Asal();
        Matematik.Alan alan = new Matematik().new Alan();
        Matematik.Alan.DaireAlan daire_alan=new Matematik().new Alan().new DaireAlan();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tane sayi giriniz: ");
        int sayi = scanner.nextInt();

        if (asal.asal_mi(sayi)) {
            System.out.println("Bu sayi asaldir.");


        } else {
            System.out.println("Bu sayi asal degildir.");

        }
        factorial.faktoriyel();
       // alan.daire_alan(5);
        daire_alan.daire_alan(6);



    }
}
