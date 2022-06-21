public class Yonetici extends Calisan{

    private int sorumlu_kisi_sayisi;


    public Yonetici(String ad, String soy_ad, String id,int sorumlu_kisi_sayisi) {
        super(ad, soy_ad, id);
        this.sorumlu_kisi_sayisi=sorumlu_kisi_sayisi;





    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println("Yoneticinin sorumlu oldugu kisi sayisi: "+sorumlu_kisi_sayisi);


    }
    public void zamYap(int zam){
        System.out.println(getAd()+" calisanlara "+zam+"$ kadar zam yapiyor..");

    }
}
