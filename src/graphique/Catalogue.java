package graphique;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

public class Catalogue {

	private JFrame frameCatalogue;
	private JTable table;
	private JButton buttonAjoutFiltre;
	private JButton buttonRetour;
	private JPanel panelFiltres;
	private JPanel panelTri;
	private JButton buttonAjoutTri;
	private JButton buttonEmprunter;
	private JButton buttonModifier;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Catalogue window = new Catalogue();
					window.frameCatalogue.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Catalogue() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameCatalogue = new JFrame();
		frameCatalogue.getContentPane().setBackground(new Color(135, 206, 250));
		frameCatalogue.getContentPane().setLayout(null);

		JLabel labelListeDocuments = new JLabel("Liste des documents");
		labelListeDocuments.setBounds(400, 10, 259, 13);
		frameCatalogue.getContentPane().add(labelListeDocuments);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(400, 33, 259, 251);
		frameCatalogue.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		buttonRetour = new JButton("Retour");
		buttonRetour.setBounds(10, 263, 120, 21);
		frameCatalogue.getContentPane().add(buttonRetour);
		ImageIcon image = new ImageIcon((new ImageIcon("images/retour.png")).getImage()
				.getScaledInstance(buttonRetour.getHeight(), buttonRetour.getHeight(), Image.SCALE_DEFAULT));
		buttonRetour.setIcon(image);

		panelFiltres = new JPanel();
		panelFiltres.setBackground(new Color(100, 149, 237));
		panelFiltres.setBorder(new TitledBorder(null, "Filtres", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelFiltres.setBounds(10, 10, 151, 243);
		frameCatalogue.getContentPane().add(panelFiltres);
		panelFiltres.setLayout(null);

		buttonAjoutFiltre = new JButton("Ajouter un filtre");
		buttonAjoutFiltre.setBounds(10, 22, 118, 21);
		panelFiltres.add(buttonAjoutFiltre);

		panelTri = new JPanel();
		panelTri.setBackground(new Color(100, 149, 237));
		panelTri.setBorder(new TitledBorder(null, "Tris", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelTri.setBounds(171, 10, 213, 243);
		frameCatalogue.getContentPane().add(panelTri);
		panelTri.setLayout(null);

		buttonAjoutTri = new JButton("Ajouter un tri");
		buttonAjoutTri.setBounds(43, 21, 135, 21);
		panelTri.add(buttonAjoutTri);

		buttonEmprunter = new JButton("Emprunter");
		buttonEmprunter.setBounds(266, 263, 120, 21);
		frameCatalogue.getContentPane().add(buttonEmprunter);

		buttonModifier = new JButton("Modifier");
		buttonModifier.setBounds(136, 263, 120, 21);
		frameCatalogue.getContentPane().add(buttonModifier);
		image = new ImageIcon((new ImageIcon("images/modifier.png")).getImage()
				.getScaledInstance(buttonModifier.getHeight(), buttonModifier.getHeight(), Image.SCALE_DEFAULT));
		buttonModifier.setIcon(image);

		frameCatalogue.setTitle("Catalogue");
		frameCatalogue.setBounds(100, 100, 700, 331);
		frameCatalogue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}