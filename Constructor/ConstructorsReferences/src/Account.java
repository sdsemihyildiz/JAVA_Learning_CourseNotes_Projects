public class Account {
    private String hesapNo;

    private double bakiye;

    private String isim;

    private String eMail;

    private String telefonNo;

    public Account() {
        /*
        this.hesapNo="Bilgi yok.";
        this.bakiye=0.0;
        this.isim="Bilgi yok.";
        this.eMail="Bilgi yok.";
        this.telefonNo="Bilgi yok."; */

        this("Bilgi yok", 0.0, "Bilgi yok", "Bilgi yok", "Bilgi yok");


        // Class adımız ile constructor adımız aynı olmalı
        // Constructorlar bizim obje oluştururken ilk çağırdığımzı fonksiyonlardır.

        //    System.out.println("Kendi yazdigimiz constructor....");


    }

    public Account(String isim, String eMail, String telefonNo) {

       /* this.isim = isim;
        this.telefonNo = telefonNo;
        this.eMail = eMail;
        this.bakiye = 0.0;
        this.hesapNo = "Bilgi yok."; */

        this("Bilgi yok", 0.0, isim, eMail, telefonNo);


    }

    public Account(String hesapNo, double bakiye, String isim, String eMail, String telefonNo) {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.eMail = eMail;
        this.telefonNo = telefonNo;


    }


    public void paraYatir(double miktar) {

        bakiye += miktar;
        System.out.println("Yeni bakiye: " + bakiye);


    }

    public void bilgilerigoster() {
        System.out.println("Hesap no: " + this.hesapNo);
        System.out.println("Bakiye: " + this.bakiye);
        System.out.println("Isim no: " + this.isim);
        System.out.println("eMail: " + this.eMail);
        System.out.println("Telefon no: " + this.telefonNo);


    }

    public void paraCekme(double miktar) {
        if (miktar > 1500) {
            System.out.println("Para cekemezsiniz, bir günde 1500TL'den fazla para cekemezsiniz.");
        }
        if (bakiye - miktar < 0) {
            System.out.println("Yeterli bakiye yok. Bakiyeniz: " + bakiye);
        } else {
            bakiye -= miktar;
            System.out.println("Yeni bakiye: " + miktar);
        }
    }


    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
}
