public class Dragon extends Beyblade {
    private final String kutsalCavanar;
    private final String gizliYetenek;

    public Dragon(String beybladeci, int donus_hizi, int saldiri_gucu, String kutsalCavanar, String gizliYetenek) {
        super(beybladeci, donus_hizi, saldiri_gucu);
        this.kutsalCavanar = kutsalCavanar;
        this.gizliYetenek = gizliYetenek;

    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println("Kutsal canavar adi: " + kutsalCavanar);
        System.out.println("Gizli Yetenek: " + gizliYetenek);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCavanar + "' ortaya cikariyor...");
        System.out.println(getBeybladeci() + " in saldirisi: Hayalet kasirgasi");
    }


}