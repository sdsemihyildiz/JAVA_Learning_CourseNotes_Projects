import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashSet;
import java.util.Set;

public class SiparisUygulamasi extends JFrame {

    Set<String> set = new LinkedHashSet<String>();


    private JCheckBox javaCheck;
    private JCheckBox pythonCheck;
    private JCheckBox cCheck;
    private JButton goster;
    private JLabel dillerAlani;
    private JPanel panel1;

    public SiparisUygulamasi() {
        add(panel1);
        setSize(400, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        goster.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (javaCheck.isSelected()) {
                    set.add("JAVA");

                } else {
                    set.remove("Java");

                }
                if (pythonCheck.isSelected()) {
                    set.add("Python");

                } else {
                    set.remove("Python");

                }
                if (cCheck.isSelected()) {
                    set.add("C++");

                } else {
                    set.remove("C++");

                }
                labelDegistir();

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
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SiparisUygulamasi siparisUygulamasi = new SiparisUygulamasi();
                siparisUygulamasi.setVisible(true);

            }
        });


    }

    public void labelDegistir() {
        String yazi = "Su diller secildi: ";
        for (String dil : set) {
            yazi += dil + " ";

        }
        dillerAlani.setText(yazi);

    }
}
