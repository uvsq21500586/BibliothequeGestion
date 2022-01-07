package graphique.pannels;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ModifierCatalogue  {

	public JFrame frame;
	private JTextField nom1;
	private JTextField prenom1;
	private JTextField dateNaissance1;
	private JTextField dateDeces1;
	private JTextField nom2;
	private JTextField prenom2;
	private JTextField dateNaissance2;
	private JTextField dateDeces2;
	private JTextField nom3;
	private JTextField dateNaissance3;
	private JTextField textField_10;
	private JTextField dateDeces3;
	private JTextField nom4;
	private JTextField prenom4;
	private JTextField dateNaissance4;
	private JTextField dateDeces4;
	private JTextField nom5;
	private JTextField prenom5;
	private JTextField dateNaissance5;
	private JTextField dateDeces5;
	private JTextField dateNaissance6;
	private JTextField dateDeces6;
	private JTextField prenom6;
	private JTextField nom6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifierCatalogue Mc = new ModifierCatalogue();
					Mc.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ModifierCatalogue() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 944, 712);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Fenêtre d'ajout d'auteur(s) supplémentaires");
		
		JLabel lblNewLabel_1 = new JLabel("Auteur1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(215, 41, 103, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_5_5_1_2 = new JLabel("Nom");
		lblNewLabel_5_5_1_2.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_2.setBounds(20, 81, 103, 31);
		frame.getContentPane().add(lblNewLabel_5_5_1_2);
		
		nom1 = new JTextField();
		nom1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		nom1.setColumns(10);
		nom1.setBounds(125, 86, 298, 28);
		frame.getContentPane().add(nom1);
		
		prenom1 = new JTextField();
		prenom1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		prenom1.setColumns(10);
		prenom1.setBounds(125, 124, 298, 28);
		frame.getContentPane().add(prenom1);
		
		JLabel lblNewLabel_5_5_1_2_1 = new JLabel("Pr\u00E9nom");
		lblNewLabel_5_5_1_2_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_2_1.setBounds(20, 121, 103, 31);
		frame.getContentPane().add(lblNewLabel_5_5_1_2_1);
		
		JLabel lblNewLabel_5_5_1_1 = new JLabel("N\u00E9(e) le");
		lblNewLabel_5_5_1_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_1.setBounds(20, 162, 103, 31);
		frame.getContentPane().add(lblNewLabel_5_5_1_1);
		
		dateNaissance1 = new JTextField();
		dateNaissance1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dateNaissance1.setColumns(10);
		dateNaissance1.setBounds(123, 162, 103, 28);
		frame.getContentPane().add(dateNaissance1);
		
		dateDeces1 = new JTextField();
		dateDeces1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dateDeces1.setColumns(10);
		dateDeces1.setBounds(320, 164, 103, 28);
		frame.getContentPane().add(dateDeces1);
		
		JLabel lblNewLabel_5_5_1_1_1 = new JLabel("Dec\u00E8s");
		lblNewLabel_5_5_1_1_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_1_1.setBounds(246, 160, 72, 28);
		frame.getContentPane().add(lblNewLabel_5_5_1_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Auteur2");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(681, 41, 103, 43);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_5_5_1_2_2 = new JLabel("Nom");
		lblNewLabel_5_5_1_2_2.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_2_2.setBounds(486, 81, 103, 31);
		frame.getContentPane().add(lblNewLabel_5_5_1_2_2);
		
		nom2 = new JTextField();
		nom2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		nom2.setColumns(10);
		nom2.setBounds(591, 86, 298, 28);
		frame.getContentPane().add(nom2);
		
		prenom2 = new JTextField();
		prenom2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		prenom2.setColumns(10);
		prenom2.setBounds(591, 124, 298, 28);
		frame.getContentPane().add(prenom2);
		
		JLabel lblNewLabel_5_5_1_2_1_1 = new JLabel("Pr\u00E9nom");
		lblNewLabel_5_5_1_2_1_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_2_1_1.setBounds(486, 121, 103, 31);
		frame.getContentPane().add(lblNewLabel_5_5_1_2_1_1);
		
		JLabel lblNewLabel_5_5_1_1_2 = new JLabel("N\u00E9(e) le");
		lblNewLabel_5_5_1_1_2.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_1_2.setBounds(486, 162, 103, 31);
		frame.getContentPane().add(lblNewLabel_5_5_1_1_2);
		
		dateNaissance2 = new JTextField();
		dateNaissance2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dateNaissance2.setColumns(10);
		dateNaissance2.setBounds(589, 162, 103, 28);
		frame.getContentPane().add(dateNaissance2);
		
		dateDeces2 = new JTextField();
		dateDeces2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dateDeces2.setColumns(10);
		dateDeces2.setBounds(786, 164, 103, 28);
		frame.getContentPane().add(dateDeces2);
		
		JLabel lblNewLabel_5_5_1_1_1_1 = new JLabel("Dec\u00E8s");
		lblNewLabel_5_5_1_1_1_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_1_1_1.setBounds(712, 160, 72, 28);
		frame.getContentPane().add(lblNewLabel_5_5_1_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Auteur3");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(215, 243, 103, 43);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_5_5_1_2_3 = new JLabel("Nom");
		lblNewLabel_5_5_1_2_3.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_2_3.setBounds(20, 283, 103, 31);
		frame.getContentPane().add(lblNewLabel_5_5_1_2_3);
		
		nom3 = new JTextField();
		nom3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		nom3.setColumns(10);
		nom3.setBounds(125, 288, 298, 28);
		frame.getContentPane().add(nom3);
		
		dateNaissance3 = new JTextField();
		dateNaissance3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		dateNaissance3.setColumns(10);
		dateNaissance3.setBounds(125, 326, 298, 28);
		frame.getContentPane().add(dateNaissance3);
		
		JLabel lblNewLabel_5_5_1_2_1_2 = new JLabel("Pr\u00E9nom");
		lblNewLabel_5_5_1_2_1_2.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_2_1_2.setBounds(20, 323, 103, 31);
		frame.getContentPane().add(lblNewLabel_5_5_1_2_1_2);
		
		JLabel lblNewLabel_5_5_1_1_3 = new JLabel("N\u00E9(e) le");
		lblNewLabel_5_5_1_1_3.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_1_3.setBounds(20, 364, 103, 31);
		frame.getContentPane().add(lblNewLabel_5_5_1_1_3);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField_10.setColumns(10);
		textField_10.setBounds(123, 364, 103, 28);
		frame.getContentPane().add(textField_10);
		
		dateDeces3 = new JTextField();
		dateDeces3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dateDeces3.setColumns(10);
		dateDeces3.setBounds(320, 366, 103, 28);
		frame.getContentPane().add(dateDeces3);
		
		JLabel lblNewLabel_5_5_1_1_1_2 = new JLabel("Dec\u00E8s");
		lblNewLabel_5_5_1_1_1_2.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_1_1_2.setBounds(246, 362, 72, 28);
		frame.getContentPane().add(lblNewLabel_5_5_1_1_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Auteur4");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(681, 243, 103, 43);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_5_5_1_2_4 = new JLabel("Nom");
		lblNewLabel_5_5_1_2_4.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_2_4.setBounds(486, 283, 103, 31);
		frame.getContentPane().add(lblNewLabel_5_5_1_2_4);
		
		nom4 = new JTextField();
		nom4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		nom4.setColumns(10);
		nom4.setBounds(591, 288, 298, 28);
		frame.getContentPane().add(nom4);
		
		prenom4 = new JTextField();
		prenom4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		prenom4.setColumns(10);
		prenom4.setBounds(591, 326, 298, 28);
		frame.getContentPane().add(prenom4);
		
		JLabel lblNewLabel_5_5_1_2_1_3 = new JLabel("Pr\u00E9nom");
		lblNewLabel_5_5_1_2_1_3.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_2_1_3.setBounds(486, 323, 103, 31);
		frame.getContentPane().add(lblNewLabel_5_5_1_2_1_3);
		
		JLabel lblNewLabel_5_5_1_1_4 = new JLabel("N\u00E9(e) le");
		lblNewLabel_5_5_1_1_4.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_1_4.setBounds(486, 364, 103, 31);
		frame.getContentPane().add(lblNewLabel_5_5_1_1_4);
		
		dateNaissance4 = new JTextField();
		dateNaissance4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dateNaissance4.setColumns(10);
		dateNaissance4.setBounds(589, 364, 103, 28);
		frame.getContentPane().add(dateNaissance4);
		
		dateDeces4 = new JTextField();
		dateDeces4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dateDeces4.setColumns(10);
		dateDeces4.setBounds(786, 366, 103, 28);
		frame.getContentPane().add(dateDeces4);
		
		JLabel lblNewLabel_5_5_1_1_1_3 = new JLabel("Dec\u00E8s");
		lblNewLabel_5_5_1_1_1_3.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_1_1_3.setBounds(712, 362, 72, 28);
		frame.getContentPane().add(lblNewLabel_5_5_1_1_1_3);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Auteur5");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_1.setBounds(215, 425, 103, 43);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_5_5_1_2_3_1 = new JLabel("Nom");
		lblNewLabel_5_5_1_2_3_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_2_3_1.setBounds(20, 465, 103, 31);
		frame.getContentPane().add(lblNewLabel_5_5_1_2_3_1);
		
		nom5 = new JTextField();
		nom5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		nom5.setColumns(10);
		nom5.setBounds(125, 470, 298, 28);
		frame.getContentPane().add(nom5);
		
		prenom5 = new JTextField();
		prenom5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		prenom5.setColumns(10);
		prenom5.setBounds(125, 508, 298, 28);
		frame.getContentPane().add(prenom5);
		
		JLabel lblNewLabel_5_5_1_2_1_2_1 = new JLabel("Pr\u00E9nom");
		lblNewLabel_5_5_1_2_1_2_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_2_1_2_1.setBounds(20, 505, 103, 31);
		frame.getContentPane().add(lblNewLabel_5_5_1_2_1_2_1);
		
		JLabel lblNewLabel_5_5_1_1_3_1 = new JLabel("N\u00E9(e) le");
		lblNewLabel_5_5_1_1_3_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_1_3_1.setBounds(20, 546, 103, 31);
		frame.getContentPane().add(lblNewLabel_5_5_1_1_3_1);
		
		dateNaissance5 = new JTextField();
		dateNaissance5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dateNaissance5.setColumns(10);
		dateNaissance5.setBounds(123, 546, 103, 28);
		frame.getContentPane().add(dateNaissance5);
		
		JLabel lblNewLabel_5_5_1_1_1_2_1 = new JLabel("Dec\u00E8s");
		lblNewLabel_5_5_1_1_1_2_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_1_1_2_1.setBounds(246, 544, 72, 28);
		frame.getContentPane().add(lblNewLabel_5_5_1_1_1_2_1);
		
		dateDeces5 = new JTextField();
		dateDeces5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dateDeces5.setColumns(10);
		dateDeces5.setBounds(320, 548, 103, 28);
		frame.getContentPane().add(dateDeces5);
		
		JLabel lblNewLabel_5_5_1_1_4_1 = new JLabel("N\u00E9(e) le");
		lblNewLabel_5_5_1_1_4_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_1_4_1.setBounds(486, 546, 103, 31);
		frame.getContentPane().add(lblNewLabel_5_5_1_1_4_1);
		
		dateNaissance6 = new JTextField();
		dateNaissance6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dateNaissance6.setColumns(10);
		dateNaissance6.setBounds(589, 546, 103, 28);
		frame.getContentPane().add(dateNaissance6);
		
		JLabel lblNewLabel_5_5_1_1_1_3_1 = new JLabel("Dec\u00E8s");
		lblNewLabel_5_5_1_1_1_3_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_1_1_3_1.setBounds(712, 544, 72, 28);
		frame.getContentPane().add(lblNewLabel_5_5_1_1_1_3_1);
		
		dateDeces6 = new JTextField();
		dateDeces6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dateDeces6.setColumns(10);
		dateDeces6.setBounds(786, 548, 103, 28);
		frame.getContentPane().add(dateDeces6);
		
		prenom6 = new JTextField();
		prenom6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		prenom6.setColumns(10);
		prenom6.setBounds(591, 508, 298, 28);
		frame.getContentPane().add(prenom6);
		
		nom6 = new JTextField();
		nom6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		nom6.setColumns(10);
		nom6.setBounds(591, 470, 298, 28);
		frame.getContentPane().add(nom6);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Auteur6");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3_1.setBounds(681, 425, 103, 43);
		frame.getContentPane().add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_5_5_1_2_4_1 = new JLabel("Nom");
		lblNewLabel_5_5_1_2_4_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_2_4_1.setBounds(486, 465, 103, 31);
		frame.getContentPane().add(lblNewLabel_5_5_1_2_4_1);
		
		JLabel lblNewLabel_5_5_1_2_1_3_1 = new JLabel("Pr\u00E9nom");
		lblNewLabel_5_5_1_2_1_3_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_2_1_3_1.setBounds(486, 505, 103, 31);
		frame.getContentPane().add(lblNewLabel_5_5_1_2_1_3_1);
		frame.setVisible(true);
	}
}
