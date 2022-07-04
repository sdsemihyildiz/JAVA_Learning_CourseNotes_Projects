import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MenuKullanimi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MenuKullanimi frame = new MenuKullanimi();
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
	public MenuKullanimi() {
		JTextArea yazi_alani = new JTextArea();
		yazi_alani.setBounds(10, 11, 414, 217);
		contentPane.add(yazi_alani);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Dosya");
		menuBar.add(mnNewMenu);

		JMenuItem mnıtmNewMenuItem = new JMenuItem("Dosya Aç");
		mnıtmNewMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();

				int i = fc.showOpenDialog(null);

				if (i == JFileChooser.APPROVE_OPTION) {
					File file = fc.getSelectedFile();
					try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))) {
						String icerik = "";
						while (scanner.hasNextLine()) {

							icerik += scanner.nextLine() + "\n";

						}
						yazi_alani.setText(icerik);

					} catch (FileNotFoundException e2) {

					}

				}

			}
		});
		mnıtmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu.add(mnıtmNewMenuItem);

		JMenuItem mnıtmDosyaKaydet = new JMenuItem("Dosya Kaydet");
		mnıtmDosyaKaydet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				JFileChooser fc = new JFileChooser();

				int cevap = fc.showSaveDialog(null);

				if (cevap == JFileChooser.APPROVE_OPTION) {

					String dosya_yolu = fc.getSelectedFile().getPath();

					try (FileWriter writer = new FileWriter(dosya_yolu)) {

						writer.write(yazi_alani.getText());

					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}

			}
		});
		mnıtmDosyaKaydet.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu.add(mnıtmDosyaKaydet);

		JMenuItem mnıtmk = new JMenuItem("Çıkış");
		mnıtmk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				System.exit(0);
			}
		});
		mnıtmk.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu.add(mnıtmk);

		JMenu mnNewMenu_1 = new JMenu("Düzenle");
		menuBar.add(mnNewMenu_1);

		JMenu mnNewMenu_2 = new JMenu("Renk");
		mnNewMenu_2.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu_1.add(mnNewMenu_2);

		JMenuItem mnıtmNewMenuItem_1 = new JMenuItem("Rengi Değiştir");
		mnıtmNewMenuItem_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				Color color = JColorChooser.showDialog(null, "Select a color", Color.red);

				yazi_alani.setForeground(color);

			}
		});
		mnNewMenu_2.add(mnıtmNewMenuItem_1);

		JMenu mnNewMenu_2_1 = new JMenu("Yazı Tipi");
		mnNewMenu_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu_1.add(mnNewMenu_2_1);

		JMenuItem mnıtmNewMenuItem_2 = new JMenuItem("Arial");
		mnıtmNewMenuItem_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Font font = new Font("Arial", Font.PLAIN, 20);
				yazi_alani.setFont(font);

			}
		});
		mnNewMenu_2_1.add(mnıtmNewMenuItem_2);

		JMenuItem mnıtmNewMenuItem_3 = new JMenuItem("Times New Roman");
		mnıtmNewMenuItem_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Font font = new Font("Times New Roman", Font.PLAIN, 20);
				yazi_alani.setFont(font);
			}
		});
		mnNewMenu_2_1.add(mnıtmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

	}
}
