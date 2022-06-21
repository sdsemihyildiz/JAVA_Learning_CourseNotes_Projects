import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileWriter fileWriter = null;
        //Try-catch dışında bu yapıyı kurmamızın sebebi writer metodunu kullanabilmek

        try {
            fileWriter = new FileWriter("dosya.txt",true);
            //true koyarak eski yazılanları sildirmeden devam ettiriyoruz

           /*

            fileWriter.write("Semih Yildiz\n");

            fileWriter.write("Hilal Sarsu\n");

            fileWriter.write("Enes Simsek\n");

            */
            fileWriter.write("Tunahan\n");


        } catch (IOException e) {
            System.out.println("Dosya acilirken IOException olustu");
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println("Dosya kapatilirken bir hata olustu.");
                }
            }
        }


    }
}
