import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Sonuc extends JFrame {

	private JPanel sonuc_sayfasi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Sonuc frame = new Sonuc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Sonuc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 301, 97);
		sonuc_sayfasi = new JPanel();
		sonuc_sayfasi.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(sonuc_sayfasi);
		sonuc_sayfasi.setLayout(null);

		JLabel lblNewLabel = new JLabel("Dosya indirme tamamlandi..");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 11, 173, 30);
		sonuc_sayfasi.add(lblNewLabel);

		JButton cikis_buton = new JButton("Çıkış");
		cikis_buton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				System.exit(0);
			}
		});
		cikis_buton.setBounds(183, 15, 89, 23);
		sonuc_sayfasi.add(cikis_buton);
	}

}
