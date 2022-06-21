public class Main {
    public static void main(String[] args) {

        // Sekil sekil=new Sekil("Sekil"); obje oluşturamıyoruz çünkü abstract classlardan direkt olarak obje oluşturamayız.

        Kare kare1 = new Kare("Kare1", 5);
        Daire daire1 = new Daire("Daire1", 3);
        Sekil sekil;
        sekil=new Kare("Kare2",6);



        kare1.alan_hesapla();
        daire1.alan_hesapla();
        sekil.alan_hesapla();
        kare1.cevre_hesapla();
        // sekil.cevre_hesapla();  // şekil abstract bir referans olduğu için hesaplayamıyor


    }

}
