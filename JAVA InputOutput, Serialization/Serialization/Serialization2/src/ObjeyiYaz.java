import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjeyiYaz {
    public static void main(String[] args) {

        Ogrenci ogrenci1 = new Ogrenci("Semih Yildiz", 12345, "Psikoloji");
        Ogrenci ogrenci2 = new Ogrenci("Hilal Sarsu", 54321, "Iletisim");
        Ogrenci ogrenci3 = new Ogrenci("Enes Simsek", 3152, "Muhendislik");

        Ogrenci [] ogrenci_array= {ogrenci1, ogrenci2, ogrenci3};
        ArrayList<Ogrenci> ogrenci_list=new ArrayList<Ogrenci>(Arrays.asList(ogrenci_array));



        try (ObjectOutputStream out = new ObjectOutputStream
                (new FileOutputStream("ogrenciler.bin"))) {

            out.writeObject(ogrenci_array);
            out.writeObject(ogrenci_list);

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi.");
        } catch (IOException e) {
            System.out.println("Dosya acilirken hata olustu");
        }

    }
}
