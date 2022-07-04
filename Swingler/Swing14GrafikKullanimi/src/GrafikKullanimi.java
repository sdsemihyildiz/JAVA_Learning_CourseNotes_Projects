
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Semih Yıldız
 */
public class GrafikKullanimi extends JPanel{

    public GrafikKullanimi() {
        
        setBackground(Color.BLACK);
        
        
        
        
        
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        g.setColor(Color.RED); //ALTINDAKİLERİN RENGİNİ DEĞİŞİR
        
        g.drawRect(100, 10, 30, 40); //içi boş çiziyor
        g.fillRect(200, 100, 30, 40); //içi dolu çiziyor
        
        g.setColor(Color.BLUE);
        
        g.drawOval(200, 200, 60, 30);
        
        g.fillOval(300, 300, 40, 40);
        
        g.setColor(Color.yellow);
        
        g.drawLine(100, 100, 300, 300);
        
        
        
    }
    
    
    
}
