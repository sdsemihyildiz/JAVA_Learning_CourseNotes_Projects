public abstract class Sekil {
    private String isim; // bütün şekillerin bir isimi olacağı için


    public Sekil(String isim) {
        this.isim = isim;
    }

    abstract void alan_hesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
