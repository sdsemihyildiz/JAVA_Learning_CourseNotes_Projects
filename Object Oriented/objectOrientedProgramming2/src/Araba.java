public class Araba {

    private String renk;
    private int kapilar;
    private int tekerlekler;
    private String motor;
    private String model;

    public String getModel() {
        return model; //veya retur this.model; şeklinde yazabiliriz
    }

    public void setModel(String model) {

        this.model = model; //this anahtar kelimesi kullanılarak buradaki modele ulaşmaya çalıştığımızı belirtiyoruz.


    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKapilar() {
        return kapilar;
    }

    public void setKapilar(int kapilar) {
        if (kapilar < 0) {
            System.out.println("Kapi sayisi 0'dan kucuk olamaz");

        }
        else {
            this.kapilar = kapilar;
        }
    }

    public int getTekerlekler() {
        return tekerlekler;
    }

    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}
