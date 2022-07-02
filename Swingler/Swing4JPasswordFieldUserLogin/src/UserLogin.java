import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLogin extends JFrame {
    private JButton giris;
    private JPanel panel1;
    private JTextField kullanici_adi_alani;
    private JPasswordField parola_alani;

    public UserLogin() {
        add(panel1);
        setTitle("User Login Program");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        giris.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kullanici_adi = kullanici_adi_alani.getText();
                String parola = new String(parola_alani.getPassword());
                String message;
                if (kullanici_adi.equals("Semih Yildiz")&&parola.equals("12345")){
                    message="Hosgeldiniz, "+kullanici_adi;

                }else if (!kullanici_adi.equals("Semih Yildiz")&&parola.equals("12345")){
                    message="Kullanici adi hatali.";

                }else if (kullanici_adi.equals("Semih Yildiz")&& !parola.equals("12345")) {
                    message = "Parola hatali.";
                }else {
                    message="Kullanici adi ve parola hatali.";
                }
                if (message.equals("Hoşgeldiniz, " + kullanici_adi)){


                    JOptionPane.showMessageDialog(null, message);
                    System.exit(0);




                }
                else {
                    JOptionPane.showMessageDialog(null, message);
                }

                kullanici_adi_alani.setText("");
                parola_alani.setText("");




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
                UserLogin userLogin = new UserLogin();
                userLogin.setVisible(true);
            }
        });

    }
}
