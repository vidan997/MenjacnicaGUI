package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.Action;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel label;
	private JLabel label_1;
	private JTextField textFieldSifra;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JTextField textFieldNaziv;
	private JTextField textFieldSrednji;
	private JTextField textFieldKupovni;
	private JTextField textFieldProdajni;
	private JTextField textFieldSknaziv;
	private JButton btnObrisi;
	private JButton button_1;
	private JLabel label_5;
	private JRadioButton rdbtnZaistaObrisiKurs;
	private Action action;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiKursGUI frame = new ObrisiKursGUI(null);
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
	public ObrisiKursGUI(MenjacnicaGUI gp) {
		setTitle("Obrisi kurs");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ObrisiKursGUI.class.getResource("/icons/euro-1159947_960_720.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 283, 288);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new EmptyBorder(5, 5, 5, 5));
			panel.setBounds(0, 0, 264, 249);
			panel.add(getLabel());
			panel.add(getLabel_1());
			panel.add(getTextFieldSifra());
			panel.add(getLabel_2());
			panel.add(getLabel_3());
			panel.add(getLabel_4());
			panel.add(getTextFieldNaziv());
			panel.add(getTextFieldSrednji());
			panel.add(getTextFieldKupovni());
			panel.add(getTextFieldProdajni());
			panel.add(getTextFieldSknaziv());
			panel.add(getBtnObrisi());
			panel.add(getButton_1());
			panel.add(getLabel_5());
			panel.add(getRdbtnZaistaObrisiKurs());
		}
		return panel;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Sifra");
			label.setPreferredSize(new Dimension(120, 14));
			label.setBounds(10, 10, 120, 14);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Naziv");
			label_1.setPreferredSize(new Dimension(120, 14));
			label_1.setBounds(137, 10, 120, 14);
		}
		return label_1;
	}
	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setPreferredSize(new Dimension(120, 20));
			textFieldSifra.setColumns(10);
			textFieldSifra.setBounds(10, 29, 117, 20);
		}
		return textFieldSifra;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("Prodajni kurs");
			label_2.setPreferredSize(new Dimension(120, 14));
			label_2.setBounds(137, 65, 117, 14);
		}
		return label_2;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("Kupovni kurs");
			label_3.setBounds(10, 65, 102, 14);
		}
		return label_3;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("Skraceni naziv");
			label_4.setBounds(137, 121, 109, 14);
		}
		return label_4;
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
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String a = MenjacnicaGUI.textPane.getText()+"\nObrisana valuta --> Naziv: "+textFieldNaziv.getText()+
							" Skraceni naziv:"+textFieldSknaziv.getText()+
							" Kupovni-Srednji-Prodajni: "+textFieldKupovni.getText()+"-"
							+textFieldSrednji.getText()+"-"+textFieldProdajni.getText();
					
					MenjacnicaGUI.textPane.setText(a);
					dispose();
				}
			});
			btnObrisi.setEnabled(false);
			btnObrisi.setBounds(10, 197, 117, 23);
		}
		return btnObrisi;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("Odustani");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			button_1.setBounds(137, 197, 117, 23);
		}
		return button_1;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("Srednji kurs");
			label_5.setBounds(10, 121, 102, 14);
		}
		return label_5;
	}
	private JRadioButton getRdbtnZaistaObrisiKurs() {
		if (rdbtnZaistaObrisiKurs == null) {
			rdbtnZaistaObrisiKurs = new JRadioButton("Zaista obrisi kurs");
			rdbtnZaistaObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(rdbtnZaistaObrisiKurs.isSelected()) {
						btnObrisi.setEnabled(true);
					}else btnObrisi.setEnabled(false);
						
				}
			});
			rdbtnZaistaObrisiKurs.setBounds(10, 167, 198, 23);
		}
		return rdbtnZaistaObrisiKurs;
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private Action getAction() {
		if (action == null) {
			action = new SwingAction();
		}
		return action;
	}
}
