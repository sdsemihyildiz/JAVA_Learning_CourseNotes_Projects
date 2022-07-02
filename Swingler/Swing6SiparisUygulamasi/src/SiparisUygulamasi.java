import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import java.util.Map;

public class SiparisUygulamasi extends JFrame {
    Map<String, Integer> siparisler = new LinkedHashMap<String, Integer>(); // Eklenme sırasına göre kaydetmek için
    private JPanel panel;
    private JCheckBox iskender;
    private JCheckBox beyti;
    private JCheckBox salata;
    private JCheckBox ayran;
    private JButton siparis_goster;

    public SiparisUygulamasi() {
        add(panel);
        setSize(400, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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


        siparis_goster.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (iskender.isSelected()) {
                    siparisler.put("Iskender", 35);
                } else {
                    siparisler.remove("Iskender");
                }
                if (beyti.isSelected()) {
                    siparisler.put("Beyti", 50);
                } else {
                    siparisler.remove("Beyti");
                }
                if (salata.isSelected()) {
                    siparisler.put("Salata", 10);
                } else {
                    siparisler.remove("Salata");
                }
                if (ayran.isSelected()) {
                    siparisler.put("Ayran", 5);
                } else {
                    siparisler.remove("Ayran");
                }
                siparisleriGoster();

            }
        });
    }

    public static void main(String[] args) {


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SiparisUygulamasi siparis = new SiparisUygulamasi();
                siparis.setVisible(true);

            }
        });

    }

    public void siparisleriGoster() {

        String message = "";
        int tutar = 0;

        if (siparisler.isEmpty()) {
            message = "Siparisiniz bulunmamaktadir.";

        } else {
            message += "Siparisler\n";

            for (Map.Entry<String, Integer> entry : siparisler.entrySet()) {
                message += entry.getKey() + "\n";
                tutar += entry.getValue();

            }
            message += "Toplam tutar: " + tutar;
        }
        JOptionPane.showMessageDialog(this, message);


    }
}
