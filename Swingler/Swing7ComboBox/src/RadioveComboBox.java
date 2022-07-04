import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashSet;
import java.util.Set;

public class RadioveComboBox extends JFrame {

    Set<String> diller = new LinkedHashSet<String>();


    private JPanel panel1;
    private JRadioButton java_radio;
    private JRadioButton php_radio;
    private JRadioButton python_radio;
    private JButton dil_goster;
    private JComboBox cb_diller;


    public RadioveComboBox() {
        add(panel1);
        setSize(400, 400);
        setTitle("Radio ve Combo Box");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);



        dil_goster.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message ="Su dil secildi: "+cb_diller.getSelectedItem();

                JOptionPane.showMessageDialog(null,message);





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

        RadioveComboBox rcb = new RadioveComboBox();
        rcb.setVisible(true);


    }


}
