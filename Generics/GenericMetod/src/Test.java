public class Test {
    public static void main(String[] args) {
/*
        Character[] char_dizi = {'J', 'A', 'V', 'A'};

        Integer[] integer_dizi = {1, 2, 3, 4, 5, 6,};
        String[] string_dizi = {"JAVA", "Python", "C++", "PHP"};

        Ogrenci[] ogrenci_dizi = {new Ogrenci("Semih"), new Ogrenci("Enes"), new Ogrenci("Tunahan"), new Ogrenci("Metin"),};


        yazdir(char_dizi);
        yazdir(string_dizi);
        yazdir(integer_dizi);
        yazdir(ogrenci_dizi);


    }

    public static <E> void yazdir(E[] dizi) {// ben sana farklı veri tiplerinden veri yollayabilirim ve sen E yi gördüğün her yere bunu yaz

        for (E e: dizi){
            System.out.println(e);

        }


    }*/




        Sayisal sayisal1=new Sayisal(30,40,20,30);

        Sayisal sayisal2=new Sayisal(25,45,2,35);

        Sayisal birinci=birinci(sayisal1, sayisal2);

        EsitAgirlik esitAgirlik1=new EsitAgirlik(30,20,40,2);
        EsitAgirlik esitAgirlik2=new EsitAgirlik(40,10,50,0);

        EsitAgirlik birinci2=birinci(esitAgirlik1,esitAgirlik2);

        System.out.println("Birinci sayisal ogrenicinin puani: "+ birinci.puanHesapla());
        System.out.println("Birinci esit agirlik ogrenicinin puani: "+ birinci2.puanHesapla());




    }

    public static <E extends Aday> E birinci(E e1, E e2){
// extends aday yazmasaydik hata verirdi. Her şeyi kabul etmesini engelliyoruz böylece.
        if (e1.puanHesapla()>e2.puanHesapla()){
            return e1;

        }else {
            return e2;

        }




    }
}
