public class Draciel extends Beyblade{
    private String kutsalCavanar;

    public Draciel(String beybladeci, int donus_hizi, int saldiri_gucu,String kutsalCavanar) {
        super(beybladeci, donus_hizi, saldiri_gucu);
        this.kutsalCavanar = kutsalCavanar;
    }
    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println("Kutsal canavar adi: " + kutsalCavanar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci()+" "+kutsalCavanar+"' ortaya cikariyor...");
        System.out.println(getBeybladeci()+" in savunmasi: Kale Savunmasi");
    }



}