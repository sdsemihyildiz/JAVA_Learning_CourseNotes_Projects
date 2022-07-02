import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 extends JFrame {

    private JTextField textField1;
    private JTextField textField2;
    private JButton devamButton;
    private JPanel panel1;
    private JButton temizleButton;

    public form1(){

        add(panel1);

        setSize(400,200); //formun yükseklik ve genişliğini belirledik
        setTitle("First Swing Form"); //formun adını koyduk

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Formu kapattığımızda kapanmasını sağlıyor



        //mouse ile butona tıkladığımızda yapacağımız işlemleri alttaki kısma yazıyoruz.

        devamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String ad,soyad;
                ad=textField1.getText();
                soyad=textField2.getText();
                System.out.println(ad+" "+soyad);

            }
        });
    }


}
