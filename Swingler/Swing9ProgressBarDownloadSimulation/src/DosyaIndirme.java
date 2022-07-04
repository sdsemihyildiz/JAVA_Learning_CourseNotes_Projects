import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

public class DosyaIndirme extends JFrame {

	private int say = 0;

	private JPanel dosyaIndirmeSimulasyonu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					DosyaIndirme frame = new DosyaIndirme();
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
	public DosyaIndirme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);

		dosyaIndirmeSimulasyonu = new JPanel();
		dosyaIndirmeSimulasyonu.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(dosyaIndirmeSimulasyonu);
		dosyaIndirmeSimulasyonu.setLayout(null);

		JProgressBar check_progress = new JProgressBar();
		check_progress.setStringPainted(true);
		check_progress.setBounds(40, 159, 300, 34);
		dosyaIndirmeSimulasyonu.add(check_progress);

		JButton dosya_indir_buton = new JButton("Dosya indirmeyi başlat");
		dosya_indir_buton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				javax.swing.Timer timer = new javax.swing.Timer(50, null);

				timer.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						say++;
						check_progress.setValue(say);
						if (check_progress.getValue() == 100) {

							// JOptionPane.showMessageDialog(DosyaIndirme.this, "Dosya indirme
							// tamamlandı...");

							// setVisible(false); // OK tuşuna bastıktan sonra frame i kapatmak için

							timer.stop();
							Sonuc sonuc = new Sonuc();

							setVisible(false);
							sonuc.setVisible(true);

							// System.exit(0);
						}

					}
				});
				timer.start();

			}
		});
		dosya_indir_buton.setBounds(58, 263, 262, 23);
		dosyaIndirmeSimulasyonu.add(dosya_indir_buton);
	}
}
