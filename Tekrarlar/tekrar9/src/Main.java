import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        //1 bakiye öğrenme 2 para yatirma 3 çıkış

        int bakiye=1500;
        String islemler="1. Bakiye öğrenme\n"+"2. Para çekme\n"+"3. para yatirma\n"+"Çıkış için q ya basin";
        System.out.println("********************");
        System.out.println(islemler);
        System.out.println("***************************");

        while (true){

            System.out.println("islemi seçiniz: ");
            String islem= scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("ÇIKIŞ YAPILIYOR");
                break;
            } else if (islem.equals("1")) {
                System.out.println("Bakiyeniz : "+bakiye);

            }else if(islem.equals("2")){
                System.out.println("Çekmek istediginiz tutar: ");
                int tutar= scanner.nextInt();
                scanner.nextLine();

                if (bakiye-tutar<0){
                    System.out.println("Yetersiz bakiye çekimi. Bakiyeniz: "+bakiye);


                }else {
                    bakiye-=tutar;
                    System.out.println("yeni bakiyeniz: "+bakiye);

                }



            } else if (islem.equals("3")) {
                System.out.println("yatirmak istediğiniz tutar: ");
                int tutar= scanner.nextInt();
                scanner.nextLine();
                bakiye+=tutar;
                System.out.println("Yeni bakiye: "+bakiye);

            }else {
                System.out.println("Gecersiz islem");
            }


        }











    }
}
