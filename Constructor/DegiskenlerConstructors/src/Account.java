public class Account {
    private String hesapNo;

    private double bakiye;

    private String isim;

    private String eMail;

    private String telefonNo;

    public Account() {                       // Class adımız ile constructor adımız aynı olmalı
        // Constructorlar bizim obje oluştururken ilk çağırdığımzı fonksiyonlardır.

        System.out.println("Kendi yazdigimiz constructor....");


    }

    public Account(String hesapNo, double bakiye, String isim, String eMail, String telefonNo) {
        this.hesapNo=hesapNo;
        this.bakiye=bakiye;
        this.isim=isim;
        this.eMail=eMail;
        this.telefonNo=telefonNo;


    }


    public void paraYatir(double miktar) {

        bakiye += miktar;
        System.out.println("Yeni bakiye: " + bakiye);


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
