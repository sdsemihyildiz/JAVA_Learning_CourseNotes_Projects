public class StaticClass {

    public static int obje_sayisi = 0;
    private static String isim;


    public StaticClass(String isim) {
        this.isim = isim;
        obje_sayisi++;


    }

    public static String getIsim() {
        //  return isim; // static olan bir alandan static olmayan bir alanı kullanamayız
        // bu hatayi gidermek için private static String isim yapmalıyız

        return isim;


    }


}
