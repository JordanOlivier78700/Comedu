package Controleur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO_Questions
{

    private String JDBC_driver= "com.mysql.jdbc.Driver";
    private String DB_URL = "jdbc:mysql://localhost/comedu";
    private String sql_rech_qst_id = "select * from questions, questionnaires where questions.num_questionnaire = questionnaires.?";
    private String sql_delete_qst = "delete from questions where id_question = ?";
    private String sql_insert_qst = "insert into questions values(?,?,?)";

    //  Database credentials
    private  String USER = "root";
    private  String PASS = "mdproot";

    private Statement stmt = null;


    public DAO_Questions()
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

    public Question recherche_question (int id_questionnaire) {
        //Etape 3 : Recherche du contenu de la table "questions"
        System.out.println();
        System.out.println("Recherche des questions dans la base...");
        try {
            Connection conn = this.connection();
            this.stmt = conn.createStatement();
            PreparedStatement pst = conn.prepareStatement(this.sql_rech_qst_id);
            pst.setInt(1, id_questionnaire);
            ResultSet rs = pst.executeQuery();

            //Etape 4 : Enregistrer les résultats de la requête
            rs.next();
            Integer id_question = rs.getInt("id_question");
            String num_questionnaire = rs.getString("num_questionnaire");
            String question = rs.getString("question");

            // Création de l'objet question
            // Arraylist <Reponse_Questionnaire> list_rep =  recherche_reponse(id_question)
            Question quest = new Question();
            quest.setTitre_question(question);
            quest.setId_question(id_question);
            //quest.setReponses(list_rep);
            rs.close();
            stmt.close();

            return quest;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean supprimer (String login, String password)
    {
        //Etape 7 : Suppression d'une question de la table "questions"
        System.out.println();
        System.out.println("Suppression de la question dans la base...");
        try
        {
            //Pour supprimer une question il faut que toutes les réponses soient supprimées au préalable
            Connection conn = this.connection();
            this.stmt = conn.createStatement();
            PreparedStatement pst = conn.prepareStatement(this.sql_delete_qst);
            ResultSet rs = pst.executeQuery();
            return true;
        }
        catch (SQLException e) {e.printStackTrace();return false;}

    }
    public boolean ajouter (Integer id_question, Integer num_questionnaire, String question)
    {
        //Etape 3 : Suppression d'un questionnaire de la table "questionnaires"
        System.out.println();
        System.out.println("Ajout de la question dans la base...");
        try
        {
            //Pour supprimer un questionnaire il faut que toutes les questions et réponses soient supprimées au préalable
            Connection conn = this.connection();
            this.stmt = conn.createStatement();
            PreparedStatement pst = conn.prepareStatement(this.sql_insert_qst);
            pst.setInt(1, id_question);
            pst.setInt(2, num_questionnaire);
            pst.setString(3, question);
            ResultSet rs = pst.executeQuery();
            return true;
        }
        catch (SQLException e) {e.printStackTrace();return false;}

    }

}