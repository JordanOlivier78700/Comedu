import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DAO_Ajout {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/comedu";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "mdproot";
    static String sql_ajout = "insert into users VALUES (?,?,?,?,?,?) ";


    @SuppressWarnings("null")
    public static void main(String[] args) {
        Connection conn = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connexion à la base de données...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Insérer du contenu dans la table "users"
            System.out.println();
            PreparedStatement pst = conn.prepareStatement(sql_ajout);
            pst.setString(1, "dupontj")
            pst.setString(2, "passwordjean")
            pst.setInt(3, 0)
            pst.setString(4, "Jean");
            pst.setString(5, "DUPONT");
            pst.setString(6, "L3 M2I G3");
            pst.execute();

            //ResultSet sql2 =  statement.executeUpdate(sql);
            System.out.println("Insertion dans la table réussie");

            //STEP 8: Clean-up environment
            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println();
        System.out.println("Goodbye!");


    }
}