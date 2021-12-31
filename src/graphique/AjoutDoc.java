package graphique;
import connexion.AccesJDBC;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AjoutDoc {

	JFrame frame;
	private JTextField textRecherche;
	private JButton btnAfficher;
	public JTable table;
	private JTextField prenom;
	private JTextField dateDeces;
	private JTextField dateNaissance;
	private JTextField nom;
	private JLabel lblNewLabel_2;
	private JTextField sousTitre;
	private JTextField titre;
	private JTextField codeReference;
	private JTextField dateEdition;
	private JTextField typeDocument;
	private JLabel lblNewLabel_3;
	private JTextField nomEditeur;
	private JTextField prenomEditeur;
	private JTextField adresse;
	private JTextField siteWeb;
	private JTextField telephone;
	private JLabel lblNewLabel_4;
	private JTextField theme;

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
		afficher();
	
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 248, 255));
		frame.setBounds(100, 100, 1250, 820);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnAjouterDoc = new JButton("Ajouter un document");
		btnAjouterDoc.setBounds(60, 10, 204, 62);
		btnAjouterDoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {							 
			ajouter();		
				
			}
		});
		frame.getContentPane().setLayout(null);
		btnAjouterDoc.setForeground(Color.GREEN);
		btnAjouterDoc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.getContentPane().add(btnAjouterDoc);
		
		JButton btnSupprimerDoc = new JButton("Supprimer un document");
		btnSupprimerDoc.setBounds(305, 10, 204, 62);
		btnSupprimerDoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				supprimer();
		
			}
		});
		btnSupprimerDoc.setForeground(Color.RED);
		btnSupprimerDoc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.getContentPane().add(btnSupprimerDoc);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 82, 1206, 691);
		panel.setBackground(new Color(245, 245, 245));
		panel.setForeground(new Color(192, 192, 192));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Recherche :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(555, 3, 137, 37);
		panel.add(lblNewLabel);
		
		textRecherche = new JTextField();	
		textRecherche.setBounds(702, 10, 292, 28);
		panel.add(textRecherche);
		textRecherche.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(464, 48, 732, 633);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		
		prenom = new JTextField();
		prenom.setFont(new Font("Tahoma", Font.PLAIN, 18));
		prenom.setBounds(119, 81, 298, 28);
		panel.add(prenom);
		prenom.setColumns(10);
		
		dateDeces = new JTextField();
		dateDeces.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dateDeces.setColumns(10);
		dateDeces.setBounds(314, 121, 103, 28);
		panel.add(dateDeces);
		
		dateNaissance = new JTextField();
		dateNaissance.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dateNaissance.setColumns(10);
		dateNaissance.setBounds(117, 119, 103, 28);
		panel.add(dateNaissance);
		
		nom = new JTextField();
		nom.setFont(new Font("Tahoma", Font.PLAIN, 18));
		nom.setColumns(10);
		nom.setBounds(119, 43, 298, 28);
		panel.add(nom);
		
		JLabel lblNewLabel_1 = new JLabel("Auteur");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(209, -2, 103, 43);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Document");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(197, 155, 115, 43);
		panel.add(lblNewLabel_2);
		
		sousTitre = new JTextField();
		sousTitre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		sousTitre.setColumns(10);
		sousTitre.setBounds(127, 246, 290, 28);
		panel.add(sousTitre);
		
		titre = new JTextField();
		titre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		titre.setColumns(10);
		titre.setBounds(127, 208, 290, 28);
		panel.add(titre);
		
		codeReference = new JTextField();
		codeReference.setFont(new Font("Tahoma", Font.PLAIN, 18));
		codeReference.setColumns(10);
		codeReference.setBounds(127, 322, 290, 28);
		panel.add(codeReference);
		
		dateEdition = new JTextField();
		dateEdition.setFont(new Font("Tahoma", Font.PLAIN, 18));
		dateEdition.setColumns(10);
		dateEdition.setBounds(127, 284, 290, 28);
		panel.add(dateEdition);
		
		typeDocument = new JTextField();
		typeDocument.setFont(new Font("Tahoma", Font.PLAIN, 18));
		typeDocument.setColumns(10);
		typeDocument.setBounds(127, 363, 290, 28);
		panel.add(typeDocument);
		
		lblNewLabel_3 = new JLabel("Editeur");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(209, 401, 96, 37);
		panel.add(lblNewLabel_3);
		
		nomEditeur = new JTextField();
		nomEditeur.setFont(new Font("Tahoma", Font.PLAIN, 18));
		nomEditeur.setColumns(10);
		nomEditeur.setBounds(127, 437, 290, 28);
		panel.add(nomEditeur);
		
		prenomEditeur = new JTextField();
		prenomEditeur.setFont(new Font("Tahoma", Font.PLAIN, 18));
		prenomEditeur.setColumns(10);
		prenomEditeur.setBounds(127, 475, 290, 28);
		panel.add(prenomEditeur);
		
		adresse = new JTextField();
		adresse.setFont(new Font("Tahoma", Font.PLAIN, 18));
		adresse.setColumns(10);
		adresse.setBounds(127, 513, 290, 28);
		panel.add(adresse);
		
		siteWeb = new JTextField();
		siteWeb.setFont(new Font("Tahoma", Font.PLAIN, 18));
		siteWeb.setColumns(10);
		siteWeb.setBounds(127, 551, 290, 28);
		panel.add(siteWeb);
		
		telephone = new JTextField();
		telephone.addKeyListener(new KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent e) {
			
	     char c = e.getKeyChar();
		    if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
		    { e.consume(); 
		    
		    JOptionPane.showMessageDialog(null, "Numéros seulement", "Numéros"
		    		, JOptionPane.INFORMATION_MESSAGE);
		   telephone.setText("");
		    } 
			          
			}
		});
		telephone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		telephone.setColumns(10);
		telephone.setBounds(127, 589, 290, 28);
		panel.add(telephone);
		
		lblNewLabel_4 = new JLabel("Th\u00E8me");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(209, 613, 115, 43);
		panel.add(lblNewLabel_4);
		
		theme = new JTextField();
		theme.setFont(new Font("Tahoma", Font.PLAIN, 18));
		theme.setColumns(10);
		theme.setBounds(127, 653, 290, 28);
		panel.add(theme);
		
		JLabel lblNewLabel_5 = new JLabel("Nom th\u00E8me");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5.setBounds(14, 650, 103, 31);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("T\u00E9l\u00E9phone");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_1.setBounds(14, 584, 103, 31);
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Site Web");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_2.setBounds(14, 543, 103, 31);
		panel.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("Adresse");
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_3.setBounds(14, 508, 103, 31);
		panel.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_4 = new JLabel("Pr\u00E9nom");
		lblNewLabel_5_4.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_4.setBounds(14, 470, 103, 31);
		panel.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_5_5 = new JLabel("Nom");
		lblNewLabel_5_5.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5.setBounds(14, 432, 103, 31);
		panel.add(lblNewLabel_5_5);
		
		JLabel lblNewLabel_5_5_1 = new JLabel("Titre");
		lblNewLabel_5_5_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1.setBounds(14, 203, 103, 31);
		panel.add(lblNewLabel_5_5_1);
		
		JLabel lblNewLabel_5_4_1 = new JLabel("Sous-Titre");
		lblNewLabel_5_4_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_4_1.setBounds(14, 241, 103, 31);
		panel.add(lblNewLabel_5_4_1);
		
		JLabel lblNewLabel_5_3_1 = new JLabel("Date \u00E9dition");
		lblNewLabel_5_3_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_3_1.setBounds(14, 281, 103, 31);
		panel.add(lblNewLabel_5_3_1);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("Code Ref");
		lblNewLabel_5_2_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_2_1.setBounds(14, 317, 103, 31);
		panel.add(lblNewLabel_5_2_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Type Doc");
		lblNewLabel_5_1_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_1_1.setBounds(14, 358, 103, 31);
		panel.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_5_1_1 = new JLabel("N\u00E9(e) le");
		lblNewLabel_5_5_1_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_1.setBounds(14, 119, 103, 31);
		panel.add(lblNewLabel_5_5_1_1);
		
		JLabel lblNewLabel_5_5_1_2 = new JLabel("Nom");
		lblNewLabel_5_5_1_2.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_2.setBounds(14, 38, 103, 31);
		panel.add(lblNewLabel_5_5_1_2);
		
		JLabel lblNewLabel_5_5_1_1_1 = new JLabel("Dec\u00E8s");
		lblNewLabel_5_5_1_1_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_1_1.setBounds(240, 117, 72, 28);
		panel.add(lblNewLabel_5_5_1_1_1);
		
		JLabel lblNewLabel_5_5_1_2_1 = new JLabel("Pr\u00E9nom");
		lblNewLabel_5_5_1_2_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_5_5_1_2_1.setBounds(14, 78, 103, 31);
		panel.add(lblNewLabel_5_5_1_2_1);
		
		btnAfficher = new JButton("Afficher *\r\n");
		btnAfficher.setBounds(552, 10, 204, 62);
		btnAfficher.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				afficher();
			
			}
		});
		btnAfficher.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.getContentPane().add(btnAfficher);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modifier();
			}
			
		});
		btnModifier.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnModifier.setBounds(788, 10, 204, 62);
		frame.getContentPane().add(btnModifier);
	}
	private void modifier() {
			
		
        String id = table.getValueAt(table.getSelectedRow(), 0).toString();
	   		
		
		try { 
			
				String sql = "Update Auteurs set nom ="+ nom.getText().toString()+ "', prenom ='"
	                    + prenom.getText().toString() + "', dateNaissance'" + dateNaissance.getText().toString() + "', dateDecès'"
	                    + dateDeces.getText().toString() +  "' where id = '" +id +"'";
				
				String sql1 = "Update Documents set titre= "+ titre.getText().toString() + "', sousTitre'"
	                    + sousTitre.getText().toString() + "', dateEdition='" + dateEdition.getText().toString() + "', codeReference='"
	                    + codeReference.getText().toString() + "', typeDocument='" + "'" + typeDocument.getText().toString()
	                    +  "' where id = '" +id +"'";
	                    
				String sql2 = "Update Editeurs set nom= " + nom.getText().toString() + "', prenom='"
	                    + prenom.getText().toString() + "', adresse='" + adresse.getText().toString() + "', siteweb='"
	                    + siteWeb.getText().toString() + "', telephone=" + telephone.getText().toString() +  "' where id = '" +id +"'";
	                     
				String sql3 = "Update Themes set  nom = " + nom.getText().toString() +"";
				
					AccesJDBC.modifierDocumentAjout(sql,sql1,sql2,sql3);
					
			
	/*		Connection con = DriverManager.getConnection(url,user,mdp);
			String sql= "Update Auteurs set nom=?,prenom=?,dateNaissance=?,dateDeces=? where id = '" +id +"'";	
			String sql1 ="Update Documents set titre=?,sousTitre=?,dateEdition=?,codeReference=?,typeDocument=? where id = '" +id +"'";
			String sql2= "Update Editeurs set nom=?,prenom=?,adresse=?,siteWeb=?,telephone=? where id = '" +id +"'";
			String sql3="Update Themes set nom=? where id = '" +id +"'";
			PreparedStatement stm = con.prepareStatement(sql);	
			PreparedStatement stm1 = con.prepareStatement(sql1);
			PreparedStatement stm2 = con.prepareStatement(sql2);
			PreparedStatement stm3 = con.prepareStatement(sql3);
			
			// DBO AUTEURS
			stm.setString(1, nom.getText());
			stm.setString(2, prenom.getText());
			stm.setString(3, dateNaissance.getText());
			stm.setString(4, dateDeces.getText());
			
			//DBO DOCUMENTS
			stm1.setString(1,titre.getText());
			stm1.setString(2, sousTitre.getText());					
			stm1.setString(3, dateEdition.getText());					
			stm1.setString(4, codeReference.getText());
			stm1.setString(5, typeDocument.getText());	
			//DBO EDITEURS 
			stm2.setString(1,nomEditeur.getText());
			stm2.setString(2,prenomEditeur.getText());
			stm2.setString(3,adresse.getText());
			stm2.setString(4,siteWeb.getText());
			stm2.setString(5,telephone.getText());
			
			// DBO THEMES
			stm3.setString(1, theme.getText());
			stm.executeUpdate();stm1.executeUpdate();stm2.executeUpdate();stm3.executeUpdate();
			con.close();    */
			afficher();
		}
				
		catch (Exception e1)
         {
 e1.printStackTrace();
 } 
	}
	
	public void ajouter() {
		
		try {
			String sql = "insert into Auteurs (nom,prenom,dateNaissance,dateDeces)  values ('" + nom.getText() + "','"
                    + prenom.getText() + "','" + dateNaissance.getText().toString() + "','"
                    + dateDeces.getText().toString() + "')";
			
			String sql1 = "insert into Documents (titre,soustitre,dateEdition,codeReference,typeDocument) values ('" + titre.getText().toString()
					+ "','" + sousTitre.getText().toString() + "','" + dateEdition.getText().toString() + "','"
                    + codeReference.getText().toString() + "'," + "'" + typeDocument.getText()
                    + "')";
			String sql2 = "insert into Editeurs(nom,prenom,adresse,siteWeb,telephone) values ('" + nom.getText() + "','"
                    + prenom.getText() + "','" + adresse.getText().toString() + "','"
                    + siteWeb.getText().toString() + "'," + "'" + telephone.getText().toString()
                    + "')";
			String sql3 = "insert into Themes (nom) values ('" + nom.getText() + "')";
			
			
				AccesJDBC.ajouterDocumentAjout(sql,sql1,sql2,sql3);

/*			Connection con = DriverManager.getConnection(url,user,mdp);
			String sql= "insert into Auteurs (nom,prenom,dateNaissance,dateDeces)values(?,?,?,?)";	
			String sql1 ="insert into Documents(titre,sousTitre,dateEdition,codeReference,typeDocument)values(?,?,?,?,?)";
			String sql2= "insert into Editeurs(nom,prenom,adresse,siteWeb,telephone)values(?,?,?,?,?)";
			String sql3="insert into Themes(nom)values(?)";
			PreparedStatement stm = con.prepareStatement(sql);	
			PreparedStatement stm1 = con.prepareStatement(sql1);
			PreparedStatement stm2 = con.prepareStatement(sql2);
			PreparedStatement stm3 = con.prepareStatement(sql3);
			
			// DBO AUTEURS
			stm.setString(1, nom.getText());
			stm.setString(2, prenom.getText());
			stm.setString(3, dateNaissance.getText());
			stm.setString(4, dateDeces.getText());
			
			//DBO DOCUMENTS
			stm1.setString(1,titre.getText());
			stm1.setString(2, sousTitre.getText());					
			stm1.setString(3, dateEdition.getText());					
			stm1.setString(4, codeReference.getText());
			stm1.setString(5, typeDocument.getText());	
			//DBO EDITEURS 
			stm2.setString(1,nomEditeur.getText());
			stm2.setString(2,prenomEditeur.getText());
			stm2.setString(3,adresse.getText());
			stm2.setString(4,siteWeb.getText());
			stm2.setString(5,telephone.getText());
			
			// DBO THEMES
			stm3.setString(1, theme.getText());
			stm.executeUpdate();stm1.executeUpdate();stm2.executeUpdate();stm3.executeUpdate();
			con.close();
			*/
			afficher();
		}
				
		catch (Exception e1)
         {
 e1.printStackTrace();
 } 
	}
		public void supprimer() {
						        
				    String id = table.getValueAt(table.getSelectedRow(), 0).toString();
					String query = "delete from Documents where id = '" + id + "'";
								
			        AccesJDBC.SupprimerDoc(query);
					
					afficher();
				 }

		public void afficher() {

			String sql ="SELECT * FROM [Pgi].[dbo].[Documents]";
			 AccesJDBC.afficherDocumentAjout(sql, this);
						
			}
		
	}

