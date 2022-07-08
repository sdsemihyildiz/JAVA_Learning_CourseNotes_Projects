public class Test {
    public static void main(String[] args) {

        Araba araba1 = new Araba();
        /*
        //kapı sayısı - bir değer olamayacağı için biz bu objeyi public olarak erişime açamayız
        //bundan dolayı bu özellikleri saklamamız gerektiğinde private olarak erişime engellemeliyiz.
        //bu yönteme encapsulation yöntemi denir.

        araba1.model="Renault";
        araba1.kapilar=-4; */

/*
        araba1.setModel("Renault");
        System.out.println("Arabanin modeli: "+araba1.getModel());
        araba1.setKapilar(-4);
*/
      /* Araba araba2;
        araba2.setKapilar(); */

        Araba araba3=null;
        araba3.setModel("Renault");

    }

}
