package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JLabel lblNaziv;
	private JTextField textFieldSifra;
	private JLabel lblProdajniKurs;
	private JLabel lblKupovniKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField textFieldNaziv;
	private JTextField textFieldSrednji;
	private JTextField textFieldKupovni;
	private JTextField textFieldProdajni;
	private JTextField textFieldSknaziv;
	private JButton btnDodaj;
	private JButton btnOdustani;
	private JLabel lblSrednjiKurs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKursGUI frame = new DodajKursGUI(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param gp 
	 */
	public DodajKursGUI(MenjacnicaGUI gp) {
		setTitle("Menjacnica");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DodajKursGUI.class.getResource("/icons/euro-1159947_960_720.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 270, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getTextFieldSifra());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getTextFieldNaziv());
		contentPane.add(getTextFieldSrednji());
		contentPane.add(getTextFieldKupovni());
		contentPane.add(getTextFieldProdajni());
		contentPane.add(getTextFieldSknaziv());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());
		contentPane.add(getLblSrednjiKurs());
	}

	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBounds(10, 10, 120, 14);
			lblSifra.setPreferredSize(new Dimension(120, 14));
		}
		return lblSifra;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(137, 10, 120, 14);
			lblNaziv.setPreferredSize(new Dimension(120, 14));
		}
		return lblNaziv;
	}
	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setBounds(10, 29, 117, 20);
			textFieldSifra.setPreferredSize(new Dimension(120, 20));
			textFieldSifra.setColumns(10);
		}
		return textFieldSifra;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setPreferredSize(new Dimension(120, 14));
			lblProdajniKurs.setBounds(137, 65, 117, 14);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(10, 65, 102, 14);
		}
		return lblKupovniKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(137, 121, 109, 14);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setPreferredSize(new Dimension(120, 20));
			textFieldNaziv.setColumns(10);
			textFieldNaziv.setBounds(137, 29, 117, 20);
		}
		return textFieldNaziv;
	}
	private JTextField getTextFieldSrednji() {
		if (textFieldSrednji == null) {
			textFieldSrednji = new JTextField();
			textFieldSrednji.setPreferredSize(new Dimension(120, 20));
			textFieldSrednji.setColumns(10);
			textFieldSrednji.setBounds(10, 146, 117, 20);
		}
		return textFieldSrednji;
	}
	private JTextField getTextFieldKupovni() {
		if (textFieldKupovni == null) {
			textFieldKupovni = new JTextField();
			textFieldKupovni.setPreferredSize(new Dimension(120, 20));
			textFieldKupovni.setColumns(10);
			textFieldKupovni.setBounds(10, 90, 117, 20);
		}
		return textFieldKupovni;
	}
	private JTextField getTextFieldProdajni() {
		if (textFieldProdajni == null) {
			textFieldProdajni = new JTextField();
			textFieldProdajni.setPreferredSize(new Dimension(120, 20));
			textFieldProdajni.setColumns(10);
			textFieldProdajni.setBounds(137, 90, 117, 20);
		}
		return textFieldProdajni;
	}
	private JTextField getTextFieldSknaziv() {
		if (textFieldSknaziv == null) {
			textFieldSknaziv = new JTextField();
			textFieldSknaziv.setPreferredSize(new Dimension(120, 20));
			textFieldSknaziv.setColumns(10);
			textFieldSknaziv.setBounds(137, 146, 117, 20);
		}
		return textFieldSknaziv;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String a = MenjacnicaGUI.textPane.getText()+"\nNova valuta --> Naziv: "+textFieldNaziv.getText()+
							" Skraceni naziv:"+textFieldSknaziv.getText()+
							" Kupovni-Srednji-Prodajni: "+textFieldKupovni.getText()+"-"
							+textFieldSrednji.getText()+"-"+textFieldProdajni.getText();
					
					MenjacnicaGUI.textPane.setText(a);
					dispose();
				}
			});
			btnDodaj.setBounds(10, 188, 117, 23);
		}
		return btnDodaj;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setBounds(137, 188, 117, 23);
		}
		return btnOdustani;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(10, 121, 102, 14);
		}
		return lblSrednjiKurs;
	}
}
