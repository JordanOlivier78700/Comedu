package Controleur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Controleur.Questionnaire;

public class DAO_Questionnaires
{

    private String JDBC_driver= "com.mysql.jdbc.Driver";
    private String DB_URL = "jdbc:mysql://192.178.43.33/comedu";
    private String sql_rech_qstaire = "select * from questionnaires";
    private String sql_delete_rep = "delete from reponses_users where num_question = ?";
    private String sql_delete_qst = "delete from questions where num_questionnaire = ?";
    private String sql_delete_qstaire = "delete from questionnaires where id_questionnaire = ?";
    private String sql_insert_qstaire = "insert into questions values(?,?,?)";

    //  Database credentials
    private  String USER = "root";
    private  String PASS = "mdproot";

    private Statement stmt = null;

    public DAO_Questionnaires()
    {
    }

    public Connection connection()
    {


        //Etape 1 : Ajouter le driver JDBC qui permet la connexion entre le code JAVA et la BDD
        try {
            Class.forName(this.JDBC_driver);
            //Etape 2 : Se connecter à la base de données
            System.out.println("Connexion à la base de données...");
            try
            {
                Connection conn = DriverManager.getConnection(this.DB_URL,this.USER,this.PASS);
                return conn;
            }
            catch (SQLException e){e.printStackTrace();return null;}}catch(ClassNotFoundException e) {e.printStackTrace();return null;}
    }

    public Questionnaire recherche (String login)
    {
        //Etape 3 : Recherche du contenu de la table "questionnaires"
        System.out.println();
        System.out.println("Recherche des questionnaires dans la base...");
        try
        {
            Connection conn = this.connection();
            this.stmt = conn.createStatement();
            PreparedStatement pst = conn.prepareStatement(this.sql_rech_qstaire);
            pst.setString(1, login);
            ResultSet rs = pst.executeQuery();

            //Etape 4 : Enregistrer les résultats de la requête
            rs.next();
            Integer id_questionnaire =rs.getInt("id_questionnaire");
            String nom_questionnaire = rs.getString("nom_questionnaire");
            String user_login = rs.getString("user_login");
            rs.close();
            stmt.close();
            return new Questionnaire();
        }
        catch (SQLException e) {e.printStackTrace();return null;}

    }

    public boolean supprimer (Integer id_questionnaire)
    {
        //Etape 3 : Suppression d'un questionnaire de la table "questionnaires"
        System.out.println();
        System.out.println("Suppression du questionnaires dans la base...");
        try
        {
            //Pour supprimer un questionnaire il faut que toutes les questions et réponses soient supprimées au préalable
            Connection conn = this.connection();
            this.stmt = conn.createStatement();
            PreparedStatement pst = conn.prepareStatement(this.sql_delete_qstaire);
            pst.setInt(1, id_questionnaire);
            ResultSet rs = pst.executeQuery();
            return true;
        }
        catch (SQLException e) {e.printStackTrace();return false;}

    }
    public boolean ajouter (Integer id_questionnaire, Integer nom_questionnaire, String user_login)
    {
        //Etape 3 : Ajouter un questionnaire dans la base "questionnaires"
        System.out.println();
        System.out.println("Ajout du questionnaires dans la base...");
        try
        {
            Connection conn = this.connection();
            this.stmt = conn.createStatement();
            PreparedStatement pst = conn.prepareStatement(this.sql_insert_qstaire);
            pst.setInt(1, id_questionnaire);
            pst.setInt(2, nom_questionnaire);
            pst.setString(3, user_login);
            pst.execute();
            return true;
        }
        catch (SQLException e) {e.printStackTrace();return false;}

    }

}