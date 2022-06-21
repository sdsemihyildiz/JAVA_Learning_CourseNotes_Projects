import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedWriter writer=new BufferedWriter(new FileWriter("ogrenciler.txt",true))){
        writer.write("Semih Yildiz, Psikoloji\n");
        } catch (IOException e) {
            System.out.println("Dosya okunurken hata olustu.");
        }
    }
}
