import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KelimeveHarfSayisi extends JFrame {
    private JPanel panel1;
    private JTextArea yaziAlani;
    private JButton goster;
    private JLabel kelime_alani;
    private JLabel harf_alani;

    public KelimeveHarfSayisi() {
        add(panel1);
        setSize(400, 400);
        setTitle("Harf ve Kelime Sayisi");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        goster.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String yazi = yaziAlani.getText();
                int karakter_sayisi = 0;
                int kelime_sayisi = 0;

                for (int i = 0; i < yazi.length(); i++) {
                    if (yazi.charAt(i) != ' ') {  //boşluk karakterini ortadan kaldırıyoruz.

                        karakter_sayisi++;

                    }


                }
                String[] kelime_array = yazi.split(" "); //boşluğa göre ayırıyoruz
                for (String kelime : kelime_array) {
                    kelime_sayisi++;

                }
                kelime_alani.setText("Kelime sayisi: "+kelime_sayisi);
                harf_alani.setText("Karakter sayisi: "+karakter_sayisi);

            }
        });
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
        KelimeveHarfSayisi kelimeveharfsayisi = new KelimeveHarfSayisi();
        kelimeveharfsayisi.setVisible(true);


    }
}
