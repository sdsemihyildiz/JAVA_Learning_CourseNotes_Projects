public class Main {
    public static void main(String[] args) {
        //Double: 64 bit - 8 byte
        //Float: 32 bit - 4 byte
        //Otomatik donusturme: int ->> float ->> double

        double a = 5.25;
        double b = 4.0;
        double c = 4d;
        double d = 4.23d;
        System.out.println(c);
        System.out.println("---------------");

        // float e = 5.0; böyle bırakırsak hata verir fakat

        float e = (float) 5.0;
        float f = 5f;
        float g = 5.2f;
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println("---------------");

        int h = 22 / 7;
        float j = 22f / 7f;
        double k = 22d / 7d;
        System.out.println("h: " + h);
        System.out.println("j: " + j);
        System.out.println("k: " + k);
        System.out.println("---------------");

        int l = 5;
        float m = l;
        System.out.println(m);
        System.out.println("---------------");

        double n = 5.2;
        float o = (float) n;
        System.out.println(o);
        System.out.println("---------------");

        double number1 = 70.25;
        double number2 = 60d;
        double number3 = 80.2;

        float x = 70.25f;
        float y = 60f;
        float z = 80.2f;
        System.out.println("Average= " + (number1 + number2 + number3) / 3);
        System.out.println("Average= " + (x + y + z) / 3);
        //Kesin bir değer göstermek istiyorsak double komutu daha tercih edilebilir.
    }
}
