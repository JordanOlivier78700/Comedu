package Controleur;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO_Utilisateurs
{

    private String JDBC_driver= "com.mysql.jdbc.Driver";
    private String DB_URL = "jdbc:mysql://localhost/comedu";
    private String sql_affichage = "select * from users where login = ?";

    //Identifiants de la base de données
    private  String USER = "root";
    private  String PASS = "mdproot";
    private Statement stmt = null;

    public DAO_Utilisateurs()
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


    public UtilisateurCo recherche(String login)
    {
        //STEP 4: Recherche du contenu de la table "users"
        System.out.println();
        System.out.println("Recherche de l'utilisateur dans la base...");
        try
        {
            Connection conn = this.connection();
            this.stmt = conn.createStatement();
            PreparedStatement pst = conn.prepareStatement(this.sql_affichage);
            pst.setString(1, login);
            ResultSet rs = pst.executeQuery();

            //STEP 5:
            rs.next();
            String login2 =rs.getString("login");
            String password2 = rs.getString("password");
            boolean adm = rs.getBoolean("adm");
            String nom2 =rs.getString("nom");
            String prenom2 = rs.getString("prenom");
            String classe2 = rs.getString("classe");


            rs.close();
            stmt.close();
            conn.close();

            if(adm)
                return new CompteAdmin(login2,password2,nom2,prenom2,classe2);
            else
                return new Etudiant(login2,password2,nom2,prenom2,classe2);
        }
        catch (SQLException e) {e.printStackTrace();return null;}


    }
}



