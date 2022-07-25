//Subclass
public class Yazilimci extends Calisan{
    private String diller;

    public Yazilimci(String ad, String soy_ad, String id,String diller) {
        super(ad, soy_ad, id);
        this.diller=diller;

    }
    public void formatAt(String isletim_sistemi){
        System.out.println(getAd()+" "+isletim_sistemi+" isletim sistemini yukluyor");
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println("Yazilimcinin bildigi diller: "+diller);

    }
}
