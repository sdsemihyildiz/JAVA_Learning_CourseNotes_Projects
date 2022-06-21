public class Main {
    public static int deneme(int a) {
        // Return aslında en son çalıştırılan koddur. Return altına yazılan hiçbir kod çalışmaz.

        return a * 2;
        System.out.println("Cikti veriliyor..."); // Görüldüğü üzere bu fonksiyon çalışmadı.
        // Return aslında en son çalıştırılan koddur. Return altına yazılan hiçbir kod çalışmaz.
        // Return döngülerdeki break; komutu gibidir.
    }

    public static void main(String[] args) {
        deneme(4);

    }
}
