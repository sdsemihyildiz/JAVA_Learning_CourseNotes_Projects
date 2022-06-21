//implement kodu ile override yapıyoruz interface içinde yazdıklarımız.
// bu class ikinci video da yapıldı.
//Birden fazla interface implement edebiliriz.

public class MakineMuhendisi implements Muhendis, Calisma{



    private boolean askerlik;

    private boolean adli_sicil;

    public MakineMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }


    @Override
    public void askerlik_durumu_sorgula() {

        if (askerlik) {
            System.out.println("Askerligimi yaptim.");

        } else {
            System.out.println("Askerligimi henuz yapmadim.");
        }

    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {

        return "Ortalamam: " + derece;
    }

    @Override
    public void adli_sicil_sorgula() {

        if (adli_sicil) {
            System.out.println("Adli sicil kaydim bulunuyor.");

        } else {
            System.out.println("Herhangi bir adli sicil kaydim bulunmuyor.");
        }

    }

    @Override
    public void is_tecrubesi(String[] array) {

        if (array.length==0){
            System.out.println("Herhangi bir is tecrubem yok.");

        }
        else {
            System.out.println("Makine muhendisi olarak su sirketlerde calistim.");
            for (int i=0;i< array.length;++i){

                System.out.println(array[i]);

            }
        }


    }
    public void referans_getir(String[]array){
        if (array.length==0){
            System.out.println("Herhangi bir referansim bulunmuyor.");

        }else {
            for (int i=0;i<array.length;++i){
                System.out.println("Referanslarim: "+ array[i]);

            }
        }



    }

    @Override
    public void calis() {           //Birden fazla interface implement edebiliriz.
        System.out.println("Makina muhendisi calisiyor.");
    }
}
