public class Main {
    public static void main(String[] args) {
        /*
        Mantiksal Operatorler
        && --> and operatoru
        Butun sonuclar kendi icinde true ise genel sonuc true, en az biri bile false olursa genel sonuc false.

        || ---> or operatoru
        Butun sonuclardan en az birisi bile true ise genel sonuc true olur, hepsi false ise genel sonuc false olur.

        ! --> not operatoru
        True olan bir islemi false yapar, false olan bir islemi true yapar.
         */
        System.out.println(3 == 3);
        System.out.println(2 > 3);
        System.out.println("Murat" == "Murat");
        System.out.println(3 == 3 || 2 > 3 || "Murat" == "Murat");
        System.out.println(!(3 < 4));
        System.out.println("---------------------");
        System.out.println(!((3<4&&"Murat"=="Murat")|| 3.4>2.1));

    }
}
