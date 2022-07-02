import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {
    private int say = 0;


    private JButton tiklaButton;
    private JPanel panel1;
    private JButton arti;
    private JTextField birinciSayiAlani;
    private JTextField ikinciSayiAlani;
    private JTextField sonucAlani;
    private JButton eksi;
    private JButton carpma;
    private JButton bolme;
    private JLabel sayi1Label;
    private JLabel sayi2Label;
    private JLabel sonucLabel;

    public SimpleCalculator() {


        add(panel1);
        setTitle("Hesap Makinesi");

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

/*
        tiklaButton.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
/*
                say++;
                yazi_alani.setText("Butona " + say + " kere tiklandi.");




            }
        });
        */
        arti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int birinci_sayi = Integer.valueOf(birinciSayiAlani.getText());
                int ikinci_sayi = Integer.valueOf(ikinciSayiAlani.getText());
                sonucAlani.setText(String.valueOf(birinci_sayi + ikinci_sayi));
            }
        });
        eksi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int birinci_sayi = Integer.valueOf(birinciSayiAlani.getText());
                int ikinci_sayi = Integer.valueOf(ikinciSayiAlani.getText());
                sonucAlani.setText(String.valueOf(birinci_sayi - ikinci_sayi));

            }
        });
        carpma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int birinci_sayi = Integer.valueOf(birinciSayiAlani.getText());
                int ikinci_sayi = Integer.valueOf(ikinciSayiAlani.getText());
                sonucAlani.setText(String.valueOf(birinci_sayi * ikinci_sayi));
            }
        });
        bolme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int birinci_sayi = Integer.valueOf(birinciSayiAlani.getText());
                int ikinci_sayi = Integer.valueOf(ikinciSayiAlani.getText());
                sonucAlani.setText(String.valueOf((double) birinci_sayi / ikinci_sayi));
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleCalculator simpleCalculator = new SimpleCalculator();
                simpleCalculator.setVisible(true);

            }
        });


    }
}
