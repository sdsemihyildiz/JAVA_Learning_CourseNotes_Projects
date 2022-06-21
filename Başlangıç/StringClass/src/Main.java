public class Main {
    public static void main(String[] args) {

        String a = "Semih";

        String b = new String("Semih");

        System.out.println(b);

        /*              1. yorum



        System.out.println("Harf sayisi: "+b.length());

        System.out.println("0. index: "+b.charAt(0));
        System.out.println("2. index: "+b.charAt(2));
        System.out.println("0. index: "+b.charAt(b.length()-1));

        */
        /*                  2. yorum
        for (int i=0;i<b.length();i++){
            System.out.println(b.charAt(i));

        }*/
        /*                  3. yorum
        System.out.println(b.startsWith("Se"));  //Semih stringi se ile başlıyor mu
        System.out.println(b.startsWith("es"));
        System.out.println(b.endsWith("ih")); // Semih stringi ih ile bitiyor mu
        System.out.println(b.endsWith("es"));

        System.out.println(b.indexOf('h')); // kaçıncı index olduğunu bulma
        System.out.println(b.lastIndexOf('m')); // sondan başlayarak kaçıncı index olduğunu bulma
        */


        /*
        System.out.println(b.toLowerCase()); // karakterleri küçük harf yapma
        System.out.println(b.toUpperCase()); // karakterleri büyük harf yapma
        */
        /*
        String a1="1923";                       4. yorum
        int b1=Integer.parseInt(a1);        // String içindeki int değerleri integer a çevirme
        System.out.println(b1);
        System.out.println(b1-42);
        */

        /*                              5. yorum
        int b1=1923;
        String a1=String.valueOf(b1);       // integer değeri string e çevirme
        System.out.println(a1);
        */

        /*                      6. yorum
        String a1= "Semih";
        String a2="Semih";
        if (a1==a2){
            System.out.println("Esitler");          // burada objeleri kontrol ediyoruz, aynı yere yerleştikleri için
                                                    // sonuç eşit çıkıyor
        }
        */

        String b1 = new String("Semih");
        String b2 = new String("Semih");
        if (b1 == b2) {                                 // ikisi bellekte farklı yerlerde olduklarından eşit degiller
            System.out.println("Esitler.");
        } else {
            System.out.println("Esit degiller.");
        }
        if (b1.equals(b2)) {                             // içeriğini kontrol ettiğimiz için eşit çıkıyorlar.
            System.out.println("Esitler.");
        } else {
            System.out.println("Esit degiller.");
        }


    }
}
