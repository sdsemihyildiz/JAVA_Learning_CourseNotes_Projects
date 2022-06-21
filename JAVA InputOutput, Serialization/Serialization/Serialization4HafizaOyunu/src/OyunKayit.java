import java.io.*;

public class OyunKayit {
    public static void oyun_kaydet(Kart[][] kartlar) {

        try (ObjectOutputStream out = new ObjectOutputStream
                (new FileOutputStream("kayit.bin"))) {
            System.out.println("Oyun kaydediliyor.");

            out.writeObject(kartlar); //bütün kartları bu dosyaya kaydetmek istediğimizi söylüyoruz


        } catch (IOException e) {
            System.out.println("IOException hatasi olustu.");

        }


    }

    public static Kart[][] kayittanAl() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("kayit.bin")
        )) {

            Kart[][] cikti = (Kart[][]) in.readObject();
            return cikti;

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
