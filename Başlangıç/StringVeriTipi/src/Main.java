public class Main {
    public static void main(String[] args) {
        String a = "Java";
        String b = " Programming ";
        String c = "Language";
        String toplam = a + b + c;
        System.out.println(toplam);
        System.out.println("---------------");

        String d= "Hello";
        double e= 3.52;
        byte f=10;

        d= d+e+f;
        System.out.println(d);
        System.out.println("---------------");

        char g= '?';
        String h= "Hi, how are you "+g;
        System.out.println(h);
        System.out.println("---------------");

        String j="Java\tProgramming\tLanguage";
        System.out.println(j);
        System.out.println("---------------");

        String k="Java\nProgramming\nLanguage";
        System.out.println(k);
    }
}
