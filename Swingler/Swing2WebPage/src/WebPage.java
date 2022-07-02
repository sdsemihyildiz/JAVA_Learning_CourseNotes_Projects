import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class WebPage extends JFrame{
    private int say=0;

    private JButton tiklaButton;
    private JPanel panel1;
    private JTextField webSayfasi;

    public WebPage() {
        add(panel1);
        setTitle("WebPage");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        tiklaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String internet_sayfasi= webSayfasi.getText();
                Desktop d = Desktop.getDesktop();
                try {
                    d.browse(new URI(internet_sayfasi));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } catch (URISyntaxException ex) {
                    throw new RuntimeException(ex);
                }








               /*
               say++;
               System.out.println("Butona: "+say+ " kere tiklandi.");

                */





            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                WebPage web =new WebPage();
                web.setVisible(true);

            }
        });

    }
}
