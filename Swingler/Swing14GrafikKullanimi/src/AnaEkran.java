
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class AnaEkran extends JFrame{
    

    public AnaEkran(String title) throws HeadlessException {
        super(title);
    }
    
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AnaEkran.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(AnaEkran.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AnaEkran.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(AnaEkran.class.getName()).log(Level.SEVERE, null, ex);
        }
        GrafikKullanimi grafik = new GrafikKullanimi();
        AnaEkran ekran = new AnaEkran("Grafik Kullanımı");
        ekran.setVisible(true);
        ekran.setResizable(true);
        ekran.setSize(800,600);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ekran.add(grafik);
        
    }
    
}
