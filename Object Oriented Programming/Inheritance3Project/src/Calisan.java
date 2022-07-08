//Superclass
public class Calisan {
    private String ad;
    private String soy_ad;
    private String id;

    public Calisan(String ad, String soy_ad, String id) {
        this.ad = ad;
        this.soy_ad = soy_ad;
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoy_ad() {
        return soy_ad;
    }

    public void setSoy_ad(String soy_ad) {
        this.soy_ad = soy_ad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void bilgilerigoster(){

        System.out.println("Calisan Bilgileri");
        System.out.println("Ad: "+ad);
        System.out.println("Soy Ad: "+soy_ad);
        System.out.println("ID: "+id);

    }
}
