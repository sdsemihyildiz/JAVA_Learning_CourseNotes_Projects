

public class Main {
    public static void main(String[] args) throws InterruptedException {


        System.out.println("Adana havalimanina hosgeldiniz.");

        String sartlar ="Yurtdisi cikis kurallari...\n"
                +"Herhangi bir siyasi yasaginiziz bulunmamasi.\n"
                +"150 TL harc bedelini tam olarak yatirmaniz gerekiyor.\n"
                +"Gideceginiz ulkeye vizeniz olmasi gerekiyor...";

        String mesaj="Yurtdisi sartlarindan hepsini saglamaniz gerekiyor.";

        while (true){

            System.out.println("-------------------------------------");
            System.out.println(sartlar);
            System.out.println("-------------------------------------");
            Yolcu yolcu=new Yolcu();
            System.out.println("Harc bedeli kontrol ediliyor...");
            Thread.sleep(3000);
            if (yolcu.yurt_disi_harci_kontrol()==false){
                System.out.println(mesaj);
                continue;

            }
            System.out.println("Siyasi yasak kontrol ediliyor...");
            Thread.sleep(3000);
            if (yolcu.siyasi_yasak_kontrol()==false){
                System.out.println(mesaj);
                continue;
            }
            System.out.println("Vize durumu kontrol ediliyor...");
            Thread.sleep(3000);
            if (yolcu.vize_durumu_kontrol()==false){
                System.out.println(mesaj);
                continue;
            }
            System.out.println("Islemleriniz tamam. Yurtdisina cikabilirsiniz.");
            break;


        }

    }
}
