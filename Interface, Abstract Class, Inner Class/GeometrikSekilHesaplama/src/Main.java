import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String islemler ="Islemler ....\n"+
                "1. Kare alan hesapla\n"+
                "2. Ucgen alan hesapla\n"+
                "3. Daire alan hesapla\n"+
                "Cikis icin 'q' ya basin.";

        while (true){
            System.out.println(islemler);
            System.out.println("Hangi seklin alanini hesaplamak istiyorsunuz: ");
            String sekil_turu= scanner.nextLine();
            Sekil sekil=null;

            if (sekil_turu.equals("q")){
                System.out.println("Programdan cikiliyor.");
                System.out.println("----------------------");
                break;

            } else if (sekil_turu.equals("1")) {
                System.out.println("Karenin kenari: ");
                int kenar=scanner.nextInt();
                scanner.nextLine();
                sekil=new Kare("Kare1",kenar);//şekil referansımıza kare atadığımız için şekil kare gibi davranacak
                sekil.alan_hesapla();
                System.out.println("----------------------");



            }else if(sekil_turu.equals("2")){
                System.out.println("Ucgenin Kenar 1: ");
                int kenar1= scanner.nextInt();
                System.out.println("Kenar 2: ");
                int kenar2= scanner.nextInt();
                System.out.println("Kenar 3: ");
                int kenar3= scanner.nextInt();
                scanner.nextLine();

                sekil=new Ucgen("Ucgen1",kenar1,kenar2,kenar3);
                sekil.alan_hesapla();
                System.out.println("----------------------");


            } else if (sekil_turu.equals("3")) {
                System.out.println("Dairenin yaricapi: ");
                int yaricap= scanner.nextInt();
                scanner.nextLine();

                sekil=new Daire("Daire1",yaricap);
                sekil.alan_hesapla();
                System.out.println("----------------------");


            }
            else {
                System.out.println("Gecersiz islem...");
                System.out.println("----------------------");

            }


        }



    }
}
