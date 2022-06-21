import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {
    public static void main(String[] args) {

        try (ObjectOutputStream out = new ObjectOutputStream
        (new FileOutputStream("ogrenci.bin"))) {

            Ogrenci ogrenci1=new Ogrenci("Semih Yildiz",12345,"Psikoloji");
            Ogrenci ogrenci2=new Ogrenci("Hilal Sarsu",54321,"Iletisim");

            out.writeObject(ogrenci1); out.writeObject(ogrenci2);



        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi.");
        } catch (IOException e) {
            System.out.println("Dosya acilirken hata olustu");
        }

    }
}
