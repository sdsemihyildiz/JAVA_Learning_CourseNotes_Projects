import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Polymorphism ile beyblade programi yazin.

        System.out.println("Beyblade Programina hosgeldiniz..");
        System.out.println("Cikis icin q'ya basin.");
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Hangi beyblade'i uretmek istiyorsunuz?");

            String islem= scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Programdan cikiliyor.");
                break;
            }
            else {
                BeybladeFabrikasi fabrika=new BeybladeFabrikasi();
                Beyblade beyblade=fabrika.beybladeUret(islem);
                if (beyblade==null){
                    System.out.println("Lutfen gecerli bir beyblade ismi girin..");

                }else {
                    beyblade.bilgilerigoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();

                }


            }


        }








    }




}
