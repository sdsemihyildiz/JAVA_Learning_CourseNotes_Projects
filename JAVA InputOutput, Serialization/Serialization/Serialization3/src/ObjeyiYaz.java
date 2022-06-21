
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;


public class ObjeyiYaz {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Semih Yildiz",1234, "Psikoloji");


        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))){

            Ogrenci.setOgrenci_sayisi(100);


            out.writeObject(ogrenci1);


        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadi...");
        } catch (IOException ex) {
            System.out.println("Dosya acilirken IOException olustu...");
        }
    }

}
