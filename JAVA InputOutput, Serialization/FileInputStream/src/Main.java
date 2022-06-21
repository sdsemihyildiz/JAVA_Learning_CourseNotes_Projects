import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // fis = new FileInputStream("dosya.txt"); eğer 2 olarak koyarsak adını nullpointer hatasi
            // fis = new FileInputStream("dosya2.txt");
            fis = new FileInputStream("dosya.txt");


            //Belli bir yerinden itibaren istediğimiz kadar karakter okutma
            int deger;
            String s = "";
            int say=0;
            fis.skip(5);
            while ((deger= fis.read())!=-1){
                s+=(char)deger;
                say++;
                if (say==11){
                    break;
                }

            }System.out.println("Dosyanin 5. yerinden itibaren 11 karakter: "+s);


            /*
            while ((deger = fis.read()) != -1) { //dosya içinde karakter varsa okumaya devam et, en başından sonuna kadar
                s += (char) deger;//s içine bütün karakterlerimi böyle attıık


            }
            System.out.println("Dosya icerigi: " + s);

             */




            /*

            fis.skip(5); //kaçıncı byte dan okumaya başlayacağını seçiyoruz.
            System.out.println("Okunan ilk karakter: "+(char)(fis.read()));
            System.out.println("Okunan ikinci karakter: "+(char)(fis.read()));
            System.out.println("Okunan ucuncu karakter: "+(char)(fis.read()));
            System.out.println("Okunan dorduncu karakter: "+(char)(fis.read()));

             */


          /*

            System.out.println("Birinci Okunan karakter: "+(char)(fis.read()));
            System.out.println("Ikinci Okunan karakter: "+(char)(fis.read()));
            System.out.println("Ucuncu Okunan karakter: "+(char)(fis.read()));

           */


        } catch (FileNotFoundException e) {
            System.out.println("File bulunamadi...");
        } catch (IOException e) {
            System.out.println("Dosya okunurken hata olustu..");
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println("Dosya kapatilirken bir hata olustu...");

            }
            /*
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println("Dosya kapatilirken bir hata olustu...");
            }
        }

             */


        }
    }
}
