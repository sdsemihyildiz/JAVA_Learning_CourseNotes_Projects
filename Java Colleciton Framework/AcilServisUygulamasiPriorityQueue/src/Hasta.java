public class Hasta implements Comparable<Hasta> {
    private String isim;
    private String sikayet;
    private int oncelik;

    public Hasta(String isim, String sikayet) {
        this.isim = isim;
        this.sikayet = sikayet;
        this.oncelik = oncelik;

        if (sikayet.equals("Apandist")) {
            this.oncelik = 3;
        } else if (sikayet.equals("Yanik")) {
            this.oncelik = 2;

        } else {
            this.oncelik = 1;
        }
    }

    @Override
    public String toString() {
        String bilgiler = "Hasta adi: " + isim +
                "\nSikayet: " + sikayet +
                "\nOncelik: " + oncelik;
        return bilgiler;

    }

    @Override
    public int compareTo(Hasta hasta) {
        if (this.oncelik > hasta.oncelik) {
            return -1;

        } else if (this.oncelik < hasta.oncelik) {
            return 1;

        }
        return 0;
    }
}
