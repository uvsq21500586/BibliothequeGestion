package testC;

import connexion.AccesJDBC;
import graphique.AjoutDoc;


public class MainCAjoutDoc {
	static String chaineconnexionJDBC =  "jdbc:sqlserver://DESKTOP-RRKJRL7\\SQLEXPRESS; databaseName=Pgi"+
	" user =sa; mdp = 1234";
	
	String url="jdbc:sqlserver://DESKTOP-RRKJRL7\\SQLEXPRESS; databaseName=Pgi";
	String user ="sa";
	String mdp = "1234";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccesJDBC.initialiser(chaineconnexionJDBC);
		AjoutDoc.main(null);

	}

}
