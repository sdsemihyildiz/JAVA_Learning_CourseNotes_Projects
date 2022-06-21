public class Main {
    // diş dünyaya döndürdüğümüz değere göre normalde void yazdığımız yere döndüreceğimiz değerin türünü yazıyoruz.
    public static int toplama(int a, int b, int c) {
        // System.out.println(a+b+c);
        return (a + b + c); //return metodu bizim çıktı almamızı sağlayan bir anahtar kelime.
        // Return: fonksiyondan dönen bir değeri başka bir fonksiyonda kullanmamıza yarar.
    }

    public static void main(String[] args) {

        System.out.println("Cikti degeri: " + toplama(1, 2, 3));
    }
}
