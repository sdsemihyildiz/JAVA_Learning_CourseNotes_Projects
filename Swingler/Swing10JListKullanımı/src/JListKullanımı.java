import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class JListKullanımı extends JFrame {

	DefaultListModel model = new DefaultListModel();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					JListKullanımı frame = new JListKullanımı();
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
	public JListKullanımı() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 114, 310, 121);
		contentPane.add(scrollPane);
		JList kullanici_listesi = new JList();
		scrollPane.setViewportView(kullanici_listesi);
		kullanici_listesi.setModel(model);

		kullanici_listesi.setModel(new AbstractListModel() {
			String[] values = new String[] {};

			@Override
			public int getSize() {
				return values.length;
			}

			@Override
			public Object getElementAt(int index) {
				return values[index];
			}
		});

		JLabel lblNewLabel = new JLabel("Kullanıcılar");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(59, 89, 92, 14);
		contentPane.add(lblNewLabel);

		JLabel mesaj_yazisi = new JLabel("");
		mesaj_yazisi.setForeground(Color.RED);
		mesaj_yazisi.setBounds(60, 64, 310, 14);
		contentPane.add(mesaj_yazisi);

		JButton ekle_buton = new JButton("Kullanıcı Ekle");
		ekle_buton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				mesaj_yazisi.setText("");
				String cevap = JOptionPane.showInputDialog("Kullanıcı ismi");
				if (cevap != null) {
					if (cevap.trim().equals("")) {
						mesaj_yazisi.setText("Boş bir kullanıcı ismi girdiniz...");

					} else {

						model.addElement(cevap);
						mesaj_yazisi.setText("Kullanıcı başarılı bir şekilde eklendi...");

					}

				} else {
					mesaj_yazisi.setText("İşlem iptal edildi.");
				}

			}
		});
		ekle_buton.setBounds(60, 11, 117, 23);
		contentPane.add(ekle_buton);

		JButton sil_buton = new JButton("Kullanıcı Sil");
		sil_buton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mesaj_yazisi.setText("");

				int selectedindex = kullanici_listesi.getSelectedIndex();
				if (selectedindex == -1) {

					if (model.getSize() == 0) {
						mesaj_yazisi.setText("Liste şu anda boş...");
					} else {

						mesaj_yazisi.setText("Lütfen silinecek bir kullanıcı seçin...");
					}
				} else {
					Object silinecek = model.getElementAt(selectedindex);

					model.removeElement(silinecek);

				}

			}
		});
		sil_buton.setBounds(253, 11, 117, 23);
		contentPane.add(sil_buton);
	}
}
