public class Test {
    public static void main(String[] args) {

        Araba araba1 = new Araba(); //bir araba oluşturduk ve bir araba1 referansımız var

        araba1.renk = "Kirmizi";
        araba1.kapilar = 4;
        araba1.tekerlekler = 4;
        araba1.motor = "16V";
        araba1.model = "Renault";
        System.out.println(araba1.motor);
    }

}
