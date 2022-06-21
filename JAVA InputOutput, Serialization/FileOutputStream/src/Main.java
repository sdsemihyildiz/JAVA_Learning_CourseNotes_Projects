import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileOutputStream fos = null;
        //  File file =new File("Dosya.txt");

        try {
            fos = new FileOutputStream("Dosya.txt",true); //true eklediğimiz zaman dosyaya sürekli ne koyarsak onu ekler
           /* fos.write(65);
            fos.write(74);

            */

            /* byte []array={101,75,66,68};
           fos.write(array);

             */
            String s="Semih";
            byte[]array=s.getBytes();
            fos.write(array);

        } catch (FileNotFoundException e) {
            System.out.println("File not found exception bulundu");
        } catch (IOException e) {
            System.out.println("Dosya yazilirken bir hata olustu.");
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                System.out.println("Dosya kapatilirken bir hata olustu..");
            }
        }
    }
}
