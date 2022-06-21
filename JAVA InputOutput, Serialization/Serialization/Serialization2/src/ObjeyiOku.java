import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjeyiOku {
    public static void main(String[] args) {
        try (ObjectInputStream in=new ObjectInputStream
                (new FileInputStream("ogrenciler.bin"))){

           Ogrenci [] ogrenci_array = (Ogrenci[]) in.readObject();
           //read object dediğimiz anda baştan sona kadar okuyor ve depoluyor.
            ArrayList<Ogrenci>ogrenci_list=(ArrayList<Ogrenci>) in.readObject();

            System.out.println("-----------");
            for (Ogrenci o: ogrenci_array){
                System.out.println(o);
                System.out.println("----------");
            }
            System.out.println("----------");
            for (Ogrenci o: ogrenci_list){
                System.out.println(o);
                System.out.println("----------");
            }
            System.out.println("----------");

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi.");
        } catch (IOException e) {
            System.out.println("Dosya acilirken hata olustu");
        } catch (ClassNotFoundException e) {
            System.out.println("Sinif bulunamadi.");
        }
    }
}
