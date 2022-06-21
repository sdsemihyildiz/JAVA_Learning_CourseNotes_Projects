public class Main {
    public static void main(String[] args) {

        byte b=100;
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        short d=100;
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        int a = 4;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        long c=100;
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        System.out.println("--------------------------");

        //byte->>short->>int->>long

        byte k=100;
        byte l= (byte) (k/2); //(byte) şeklinde yazmasaydık hata verirdi ve int olarak algıladığı için dönüşüm yapamazdı
        System.out.println(l);

        System.out.println("--------------------------");

        short i=100;
        byte o=2;
        int z=4;
        long p=i+o+z;
        System.out.println(p);
    }
}
