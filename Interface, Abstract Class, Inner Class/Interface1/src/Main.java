//Interfaceler normal class gibi değillerdir, onlardan obje oluşturamayız. İçinde herhangi bir özellik yoktur, final ve static özelliği tanımlanabilir.
//Normal şartlardan birden fazla inheritance yapamayız, interfaceler bize bu konuda yardımcı olur.(Çoklu kalıtım)
//Bir çatı görevi görür.

public class Main {
    public static void main(String[] args) {

        // Muhendis muhendis1= new Muhendis(false,false); // böyle yazamıyorum çünkü interface içinde obje oluşturamayız.
        PcMuhendisi muhendis1 = new PcMuhendisi(false, false);

     /*    muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalamasi(3.25));
        String[] tecrube = {"Ruh sagligi"};
        muhendis1.is_tecrubesi(tecrube);
    */                                          // ikinci video da bu kısım yoruma alındı.


        MakineMuhendisi muhendis2 = new MakineMuhendisi(true, false);
     // Muhendis muhendis2= new Muhendis(false,false);
        String[] tecrube = {};
        String[] referans = {"Enes Simsek", "Ali Osman Zengin"};
        muhendis2.adli_sicil_sorgula();
        muhendis2.askerlik_durumu_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalamasi(3.25));
        muhendis2.referans_getir(referans);
        muhendis2.is_tecrubesi(tecrube);
        muhendis2.calis(); //Birden fazla interface implement edebiliriz.


    //((MakinaMuhendisi)muhendis2).referans_getir(referans);  bu şekilde yaparak interface i dönüştürüp kullanabiliriz.
        //fakat gereksiz bir ve güvenli bir islem degil.


    }
}
