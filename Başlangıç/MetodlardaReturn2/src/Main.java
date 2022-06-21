public class Main {
    public static int ikiilecarp(int a) {
        return a * 2;

    }

    public static int ikiiletopla(int a) {
        return a + 2;

    }

    public static int dortilecarp(int a) {
        return a * 4;

    }
                // Return aslında en son çalıştırılan koddur. Return altına yazılan hiçbir kod çalışmaz.

    public static void main(String[] args) {

        System.out.println("Sonuc: "+dortilecarp(ikiiletopla(ikiilecarp(8))));

    }
}
