import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari {

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

    @Override
    public boolean yurt_disi_harci_kontrol() {
        if (this.harc < 150) {
            System.out.println("Lutfen yurt disi cikis harcini tam yatirin.");
            return false;
        } else {
            System.out.println("Yurt disi harci islemi tamam.");
            return true;
        }


    }

    @Override
    public boolean siyasi_yasak_kontrol() {
        if (this.siyasiYasak == true) {
            System.out.println("Siyasi yasaginiz bulunuyor. Yurt disina cikamazsiniz.");
            return false;
        } else {
            System.out.println("Siyasi yasaginiz bulunmuyor.");
            return true;
        }


    }

    @Override
    public boolean vize_durumu_kontrol() {
        if (this.vizeDurumu==true){
            System.out.println("Vize islemleri tamam.");
            return true;

        }else {
            System.out.println("Vizeniz gideceginiz ulkeye bulunmamaktadir.");
            return false;
        }

    }
}
