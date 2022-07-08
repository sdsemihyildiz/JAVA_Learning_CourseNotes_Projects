import javax.swing.*;
import java.awt.*;
import java.sql.JDBCType;

public class OyunEkrani extends JFrame {

    public OyunEkrani(String title) throws HeadlessException {
        super(title);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        OyunEkrani ekran = new OyunEkrani("Uzay Oyunu");

        ekran.setResizable(false);//boyutu değiştirilemesin
        ekran.setFocusable(false); //bütün işlemlerimiz jframe üzerine değil jpanel üzerine odaklanacak
        ekran.setSize(800, 600);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Oyun oyun = new Oyun();

        oyun.requestFocus(); //klavyeden işlemleri anlaması için kullanıyoruz
        oyun.addKeyListener(oyun); //klavye işlemlerini anlaması için
        oyun.setFocusable(true); //bütün işlemleri jpanel üzerinden alması için true yaptık odağı buraya aldık
        oyun.setFocusTraversalKeysEnabled(false);//klavye işlemlerimizin direkt olarak gerçeklemesi için

        ekran.add(oyun); //jpaneli jframe üzerine ekledik

        ekran.setVisible(true); //jframe jpanel üzerine eklendiği anda oluşsun dedik


    }
}
