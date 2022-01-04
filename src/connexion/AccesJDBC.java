package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import graphique.AjoutDoc;
import graphique.Catalogue;
import net.proteanit.sql.DbUtils;

public class AccesJDBC {
	public static Connection con;
	public static Statement stm;
	/*
	 * cryptage String cryptedPassword = "";
	 * 
	 * try { cryptedPassword = Crypteur.encrypt(passwordString,
	 * Crypteur.createSecretKey(passwordField.getPassword())); } catch
	 * (UnsupportedEncodingException | GeneralSecurityException e1) { // TODO
	 * Auto-generated catch block e1.printStackTrace(); }
	 */

	public static void initialiser(String chaineConnexionJDBC) {
	
		con = null;
		try {
			con = DriverManager.getConnection(chaineConnexionJDBC);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		stm = null;
		try {
			stm = con.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public static void afficherDocument(String query) {
		try {
			ResultSet rs = stm.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();

			if (rs.next()) {
				rs = stm.executeQuery(query);
				Catalogue.tableDocuments.setModel(DbUtils.resultSetToTableModel(rs));
				Catalogue.tableDocumentsVide = false;
			} else {
				// tableau vide
				String tabColumn[] = new String[rsmd.getColumnCount()];
				for (int i = 0; i < rsmd.getColumnCount(); i++) {
					tabColumn[i] = rsmd.getColumnName(i + 1);
				}
				DefaultTableModel model = new DefaultTableModel(tabColumn, 0);
				Catalogue.tableDocuments.setModel(model);
				Catalogue.tableDocumentsVide = true;
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block

			e1.printStackTrace();
		} catch (NullPointerException e1) {
			System.out.println("Aucun document");
		}

	}

	public static int compter(String query) {
		// fonctionne pour des requêtes qui donnent un nombre entier
		try {
			ResultSet rs = stm.executeQuery(query);
			// ResultSetMetaData rsmd = rs.getMetaData();
			JTable resultat = new JTable();
			resultat.setModel(DbUtils.resultSetToTableModel(rs));
			System.out.println("rs: " + resultat.getValueAt(0, 0));
			return Integer.parseInt(resultat.getValueAt(0, 0).toString());

		} catch (SQLException e1) {
			// TODO Auto-generated catch block

			e1.printStackTrace();
			return -1;
		}
	}

	public static String trouverNom(String query) {
		// fonctionne pour des requêtes qui donnent un nombre entier
		try {
			ResultSet rs = stm.executeQuery(query);
			// ResultSetMetaData rsmd = rs.getMetaData();
			JTable resultat = new JTable();
			resultat.setModel(DbUtils.resultSetToTableModel(rs));
			System.out.println("rs: " + resultat.getValueAt(0, 0));
			return resultat.getValueAt(0, 0).toString();

		} catch (SQLException e1) {
			// TODO Auto-generated catch block

			e1.printStackTrace();
			return null;
		}
	}

	public static int[] rechercheTheme(String query) {
		try {
			ResultSet rs = stm.executeQuery(query);

			if (rs.next()) {
				rs = stm.executeQuery(query);
				JTable listeIdThemes = new JTable();
				listeIdThemes.setModel(DbUtils.resultSetToTableModel(rs));

				int tabColumn[] = new int[listeIdThemes.getRowCount()];
				for (int i = 0; i < listeIdThemes.getRowCount(); i++) {
					tabColumn[i] = Integer.parseInt(listeIdThemes.getValueAt(i, 0).toString());
				}
				return tabColumn;
			} else {
				// tableau vide
				return null;
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		} catch (NullPointerException e1) {
			System.out.println("Aucun document");
			return null;
		}

	}
	
	public static void afficherDocumentAjout(String query, AjoutDoc Afficher) {
		try {
			ResultSet rs = stm.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();

			if (rs.next()) {
				rs = stm.executeQuery(query);
				Afficher.table.setModel(DbUtils.resultSetToTableModel(rs));
			
			} else {
				// tableau vide
				String tabColumn[] = new String[rsmd.getColumnCount()];
				for (int i = 0; i < rsmd.getColumnCount(); i++) {
					tabColumn[i] = rsmd.getColumnName(i + 1);
				}
				DefaultTableModel model = new DefaultTableModel(tabColumn, 0);
				Afficher.table.setModel(model);
			
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block

			e1.printStackTrace();
		} catch (NullPointerException e1) {
			System.out.println("Aucun document");
		}

	}
	public static void ajouterDocumentAjout(String sql,String sql1,String sql2,String sql3) {
		System.out.println(sql);
		try {
			stm.executeQuery(sql);
			stm.executeQuery(sql1);
			stm.executeQuery(sql2);
			stm.executeQuery(sql3);

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	


	public static void SupprimerDoc(String query,String query1) {
		// fonctionne pour des requêtes qui donnent un nombre entier
		System.out.println(query);
		try {
			stm.executeQuery(query);stm.executeQuery(query1);

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public static void modifierDocumentAjout(String sql, String sql1, String sql2, String sql3) {
		// TODO Auto-generated method stub
		System.out.println(sql);
		try {
			stm.executeQuery(sql);
			stm.executeQuery(sql1);
			stm.executeQuery(sql2);
			stm.executeQuery(sql3);

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}


	}

	

	




