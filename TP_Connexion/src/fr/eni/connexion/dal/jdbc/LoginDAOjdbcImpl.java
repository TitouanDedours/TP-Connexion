package fr.eni.connexion.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import fr.eni.connexion.dal.JdbcTools;

public class LoginDAOjdbcImpl {
	
	private static final String SQL_INSERT = "insert into UTILISATEURS(nom, prenom, email, mot_de_passe) " + " values(?, ?, ?, ?)";
	private static final String SQL_SELECT_BY_LOGIN = "select nom, prenom " + "from UTILISATEURS where email=?, mot_de_passe=?";
	private static final String SQL_SELECT_ALL = "select no_utilisateur, nom, prenom, email, mot_de_passe " + "from UTILISATEURS";
	
	private static final String SQL_DELETE = "delect from UTILISATEURS where no_utilisateur=?";
	
	public void insert () {
		
		try {
			Connection uneConnection = JdbcTools.getConnection();
			PreparedStatement pStmt = uneConnection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);{
				
			pStmt.setString(1, "Dedours");
			pStmt.setString(2, "Titouan");
			pStmt.setString(3, "titdedours@gmail.com");
			pStmt.setString(4, "123456789");
			
			pStmt.executeUpdate();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
