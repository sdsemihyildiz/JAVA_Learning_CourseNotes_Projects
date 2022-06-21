
public class Main {
    public static void main(String[] args) {

        System.out.println(IDeneme.a);
        System.out.println(IDeneme.b);
        System.out.println(IDeneme.deneme);
        System.out.println(IDeneme.c);
        IDeneme.deneme();


        //ideneme içindeki alan static olmamasına rağmen alabildik.
        //Böyle yaparak interface içine alan ekleyebiliyoruz.
        //private ekleyemiyoruz çünkü değişebilmek için mutlaka constructor ve getter-setter ihtiyacımız var
        //fakat interface içine eklenemediği için olmuyor.

        //Interface içerisinde bir metod eklemek istiyorsak mutlaka public ile başlamalı



    }
}
