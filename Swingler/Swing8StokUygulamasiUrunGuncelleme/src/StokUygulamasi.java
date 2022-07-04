import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class StokUygulamasi extends JFrame {

	private JPanel contentPane;
	private JTextField tf_urun_ismi;
	private JTextField tf_fiyat;
	private JTable urun_tablosu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					StokUygulamasi frame = new StokUygulamasi();
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
	public StokUygulamasi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lb_urun_ismi = new JLabel("Ürün ismi:");
		lb_urun_ismi.setBounds(71, 59, 81, 14);
		contentPane.add(lb_urun_ismi);

		JLabel lb_kategori = new JLabel("Kategori:");
		lb_kategori.setBounds(71, 100, 81, 14);
		contentPane.add(lb_kategori);

		JLabel lb_fiyat = new JLabel("Fiyat:");
		lb_fiyat.setBounds(71, 144, 81, 14);
		contentPane.add(lb_fiyat);

		tf_urun_ismi = new JTextField();
		tf_urun_ismi.setBounds(162, 56, 189, 20);
		contentPane.add(tf_urun_ismi);
		tf_urun_ismi.setColumns(10);

		JComboBox cb_kategori = new JComboBox();
		cb_kategori.setModel(new DefaultComboBoxModel(new String[] { "Kültür-Sanat", "Yemek", "Elektronik" }));
		cb_kategori.setBounds(162, 96, 189, 22);
		contentPane.add(cb_kategori);

		tf_fiyat = new JTextField();
		tf_fiyat.setBounds(162, 141, 189, 20);
		contentPane.add(tf_fiyat);
		tf_fiyat.setColumns(10);

		JLabel mesaj_yazisi = new JLabel("");
		mesaj_yazisi.setForeground(Color.RED);
		mesaj_yazisi.setBounds(48, 187, 419, 29);
		contentPane.add(mesaj_yazisi);

		JButton ekle_butonu = new JButton("Ürün Ekle");
		ekle_butonu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mesaj_yazisi.setText("");
				DefaultTableModel model = (DefaultTableModel) urun_tablosu.getModel();
				if (tf_urun_ismi.getText().trim().equals("")) {
					mesaj_yazisi.setText("Ürün ismi boş bırakılamaz...");

				} else {
					Object[] eklenecek = { tf_urun_ismi.getText(), cb_kategori.getSelectedItem().toString(),
							tf_fiyat.getText() };
					model.addRow(eklenecek);

				}
			}
		});
		ekle_butonu.setBounds(361, 55, 89, 23);
		contentPane.add(ekle_butonu);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(102, 237, 364, 143);
		contentPane.add(scrollPane);

		urun_tablosu = new JTable();
		urun_tablosu.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "\u00DCr\u00FCn \u0130smi", "Kategori", "Fiyat" }));
		scrollPane.setViewportView(urun_tablosu);

		JButton guncelle_butonu = new JButton("Ürün Güncelle");
		guncelle_butonu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mesaj_yazisi.setText("");
				DefaultTableModel model = (DefaultTableModel) urun_tablosu.getModel();
				int secili_row = urun_tablosu.getSelectedRow();
				if (secili_row == -1) {
					if (urun_tablosu.getRowCount() == 0) {
						mesaj_yazisi.setText("Ürün Tablosu şu anda boş...");
					} else {
						mesaj_yazisi.setText("Lütfen güncellenecek bir ürün seçin.");

					}

				} else {
					model.setValueAt(tf_urun_ismi.getText(), secili_row, 0);
					model.setValueAt(cb_kategori.getSelectedItem().toString(), secili_row, 1);
					model.setValueAt(tf_fiyat.getText(), secili_row, 2);
					mesaj_yazisi.setText("Ürün başarıyla güncellendi.");
				}

			}
		});
		guncelle_butonu.setBounds(361, 96, 106, 23);
		contentPane.add(guncelle_butonu);
	}

}
