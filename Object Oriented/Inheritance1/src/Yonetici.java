//SubClass
public class Yonetici extends Calisan {

    private final int sorumlu_kisi; //Ekstra özellik ekliyoruz

    public Yonetici(String isim, int maas, String departman, int sorumlu_kisi) {

        super(isim, maas, departman);
        // super dediğimiz zaman: benim miras aldığım classın const'larını kullanmak istiyorum demiş oluyoruz
        /* this.isim=isim;
        this.maas=maas;
        this.departman=departman; */
        this.sorumlu_kisi = sorumlu_kisi;


    }

    public void zam_yap(int zam_miktari) {
        System.out.println("Calisanlara " + zam_miktari + " TL zam yapildi.");


    }

    public void bilgilerigoster() {

        /*System.out.println("Isim: " + getIsim());
        System.out.println("Maas: " + getMaas());
        System.out.println("Departman: " + getDepartman()); */
        super.bilgilerigoster();
        System.out.println("Sorumlu Kisi Sayisi: "+ this.sorumlu_kisi);



    }
}
