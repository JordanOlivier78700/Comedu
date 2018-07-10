package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DAO_Suppr {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/comedu";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "mdproot";
    static String sql_suppr = "DELETE FROM users WHERE id = ?; ";


    @SuppressWarnings("null")
    public static void main(String[] args) {
        Connection conn = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Ouvrir une connexion
            System.out.println("Connexion à la base de données...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Supprimer du contenu dans la table "users"
            System.out.println();
            Statement stmt = conn.createStatement();
            PreparedStatement pst = conn.prepareStatement(sql_suppr);
            pst.setInt(1, 4);
            pst.execute();

            //ResultSet sql2 =  statement.executeUpdate(sql);
            System.out.println("Suppression dans la table réussie");

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