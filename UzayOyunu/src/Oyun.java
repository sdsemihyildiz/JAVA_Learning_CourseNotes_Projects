import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


class Ates {
    private int x;
    private int y;

    public Ates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Oyun extends JPanel implements KeyListener, ActionListener {
    Timer timer = new Timer(10, this);


    private int gecen_sure = 0;

    private int harcanan_ates = 0;

    private BufferedImage image;

    private ArrayList<Ates> atesler = new ArrayList<Ates>();

    private int atesdirY = 1; //mermiler yukarı gidece
    private int topX = 0; //topun sağa ve sola gitmesi için
    private int topdirx = 2; //sürekli topx e ekleyeceğiz ve sağda belli bir limite çarptığında sola dönecek
    private int uzayGemisiX = 0; //uzay gemisi sol altta başlasın diye
    private int dirUzayX = 20; //klavyede sağa basılınca 20 birim sağa kaysın diye ya da sola

    public Oyun() {


        try {
            image = ImageIO.read(new FileImageInputStream(new File("uzaygemisi.png")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        setBackground(Color.BLACK);

        timer.start();


    }

    public boolean kontrolEt() { //ateş ile toplar kesişirse diye yazdığımız metod

        for (Ates ates : atesler) {

            if (new Rectangle(ates.getX(), ates.getY(), 10, 20).intersects
                    (new Rectangle(topX, 0, 20, 20))) {
                return true;

            }

        }
        return false;

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        gecen_sure += 5;

        g.setColor(Color.red);

        g.fillOval(topX, 0, 20, 20); //topun başlayacağı yeri seçtik


        g.drawImage(image, uzayGemisiX, 490, image.getWidth() / 10, image.getHeight() / 10, this);

        for (Ates ates : atesler) {
            if (ates.getY() < 0) { //ateş jframden çıktıysa silmek için
                atesler.remove(ates);

            }


        }

        g.setColor(Color.BLUE);

        for (Ates ates : atesler) {

            g.fillRect(ates.getX(), ates.getY(), 10, 20);


        }
        if (kontrolEt()) {
            timer.stop();
            String message = "Kazandiniz...\n" + "Harcanan Ates: " + harcanan_ates
                    + "\n Gecen sure: " + gecen_sure / 1000.0+" saniye";

            JOptionPane.showMessageDialog(this, message);
            System.exit(0);



        }


    }

    @Override
    public void repaint() {
        super.repaint();


    }

    @Override
    public void keyTyped(KeyEvent e) {


    }

    @Override
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode(); //sola bastığımız zaman key code sola basılmış değeri dönecek

        if (c == KeyEvent.VK_LEFT) {
            if (uzayGemisiX <= 0) {
                uzayGemisiX = 0;

            } else {
                uzayGemisiX -= dirUzayX;

            }

        } else if (c == KeyEvent.VK_RIGHT) {
            if (uzayGemisiX >= 720) {
                uzayGemisiX = 720;

            } else {
                uzayGemisiX += dirUzayX;

            }

        } else if (c == KeyEvent.VK_CONTROL) {

            atesler.add(new Ates(uzayGemisiX + 15, 470));
            //Uzay gemisinin ucundan ateş atıyor +15 komutu onun için

            harcanan_ates++; //sıkılan mermi sayısı artıyor sürekli


        }


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (Ates ates : atesler) {
            ates.setY(ates.getY() - atesdirY); //her ateş atıldığında ateşin kordinatının değişmesi için

        }

        topX += topdirx;

        //Top sınırıa ulaştığında öbür tarafa sekmesi için

        if (topX >= 750) {
            topdirx = -topdirx;


        }
        if (topX <= 0) {
            topdirx = -topdirx;


        }

        repaint();


    }
}
