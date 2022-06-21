import java.util.Scanner;

class SiyasiException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Siyasi yasaginiz bulunuyor...");

    }
}
class VizeException extends Exception{

    public void printStackTrace() {
        System.out.println("Gideceginiz ulkeye vizeniz bulunmamaktadir....");

    }
}
class HarcException extends Exception{

    public void printStackTrace() {
        System.out.println("Harc tutarini tam olarak yatirmaniz gerekmektedir..");

    }
}

public class Yolcu  {

    private int harc;

    private boolean siyasiYasak;

    private boolean vizeDurumu;

    public Yolcu() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yatirdiginiz harc bedeli: ");
        this.harc = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Siyasi yasaginiz bulunuyor mu? (Evet ya da Hayir)");
        String cevap = scanner.nextLine();
        if (cevap.equals("Evet")) {
            this.siyasiYasak = true;

        } else {
            this.siyasiYasak = false;

        }
        System.out.print("Vizeniz bulunuyor mu?(Evet ya da Hayir)");
        String cevap2 = scanner.nextLine();
        if (cevap2.equals("Evet")) {
            this.vizeDurumu = true;

        } else {
            this.vizeDurumu = false;
        }


    }


    public void yurt_disi_harci_kontrol() throws HarcException{
        if (this.harc < 150) {
            throw new HarcException();


        } else {
            System.out.println("Yurt disi harci islemi tamam.");

        }


    }


    public void siyasi_yasak_kontrol() throws SiyasiException{
        if (this.siyasiYasak == true) {
            throw new SiyasiException();

        } else {
            System.out.println("Siyasi yasaginiz bulunmuyor.");

        }


    }


    public void vize_durumu_kontrol() throws VizeException{
        if (this.vizeDurumu==true){
            System.out.println("Vize islemleri tamam...");


        }else {

            throw new VizeException();

        }

    }
}
