public class Dranza extends Beyblade{

    private String kutsalCavanar;

    public Dranza(String beybladeci, int donus_hizi, int saldiri_gucu, String kutsalCavanar) {
        super(beybladeci, donus_hizi, saldiri_gucu);
        this.kutsalCavanar = kutsalCavanar;
    }
    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println("Kutsal canavar adi: Kirmizi Anka Kusu");
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci()+" "+kutsalCavanar+"' ortaya cikariyor...");
        System.out.println(getBeybladeci()+" in Saldirisi: Alev Kilici");
    }



}
