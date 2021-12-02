package graphique;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;

public class AjoutDoc {

	JFrame frame;
	private JTextField txtAuteur;
	private JTextField txtTitre;
	private JTextField txtAnne;
	private JTextField txtTypeDeDocument;
	private JTextField txtGenre;
	private JTextField txtEdition;
	private JTextField txtClassification;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjoutDoc window = new AjoutDoc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AjoutDoc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 248, 255));
		frame.setBounds(100, 100, 1158, 760);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Ajouter un document");
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(61, 37, 204, 62);
		frame.getContentPane().add(btnNewButton);

		JButton btnSupprimerUnDocument = new JButton("Supprimer un document");
		btnSupprimerUnDocument.setForeground(Color.RED);
		btnSupprimerUnDocument.setBackground(Color.LIGHT_GRAY);
		btnSupprimerUnDocument.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSupprimerUnDocument.setBounds(305, 37, 204, 62);
		frame.getContentPane().add(btnSupprimerUnDocument);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 245, 245));
		panel.setForeground(new Color(192, 192, 192));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(20, 109, 877, 559);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		txtAuteur = new JTextField();
		txtAuteur.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		txtAuteur.setBackground(new Color(211, 211, 211));
		txtAuteur.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtAuteur.setBounds(10, 48, 150, 52);
		txtAuteur.setText("Auteur");
		panel.add(txtAuteur);
		txtAuteur.setColumns(15);

		JList list = new JList();
		list.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), null));
		list.setBounds(225, 24, 633, 503);
		panel.add(list);

		txtTitre = new JTextField();
		txtTitre.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		txtTitre.setBackground(new Color(211, 211, 211));
		txtTitre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTitre.setBounds(10, 110, 150, 52);
		txtTitre.setText("Titre");
		txtTitre.setColumns(15);
		panel.add(txtTitre);

		txtAnne = new JTextField();
		txtAnne.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		txtAnne.setBackground(new Color(211, 211, 211));
		txtAnne.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtAnne.setBounds(10, 172, 150, 52);
		txtAnne.setText("Ann\u00E9e de publication");
		txtAnne.setColumns(15);
		panel.add(txtAnne);

		txtEdition = new JTextField();
		txtEdition.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		txtEdition.setBackground(new Color(211, 211, 211));
		txtEdition.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtEdition.setBounds(10, 234, 150, 52);
		txtEdition.setText("Editeur");
		txtEdition.setColumns(15);
		panel.add(txtEdition);

		txtGenre = new JTextField();
		txtGenre.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		txtGenre.setBackground(new Color(211, 211, 211));
		txtGenre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtGenre.setBounds(10, 295, 150, 52);
		txtGenre.setText("Genre");
		txtGenre.setColumns(15);
		panel.add(txtGenre);

		txtTypeDeDocument = new JTextField();
		txtTypeDeDocument.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		txtTypeDeDocument.setBackground(new Color(211, 211, 211));
		txtTypeDeDocument.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTypeDeDocument.setBounds(10, 357, 150, 52);
		txtTypeDeDocument.setText("Type de document");
		txtTypeDeDocument.setColumns(15);
		panel.add(txtTypeDeDocument);

		txtClassification = new JTextField();
		txtClassification.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		txtClassification.setBackground(new Color(211, 211, 211));
		txtClassification.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtClassification.setBounds(10, 423, 150, 52);
		txtClassification.setText("Classification");
		txtClassification.setColumns(15);
		panel.add(txtClassification);
	}
}
