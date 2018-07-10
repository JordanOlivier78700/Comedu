import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO_Affichage {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/comedu";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "mdproot";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connexion à la base de données...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Recherche du contenu de la table "tabletest"
            System.out.println();
            System.out.println("Recherche des étudiants...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT id, nom, prenom, classe FROM tabletest";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                int id  = rs.getInt("id");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                String classe = rs.getString("classe");

                //Display values
                System.out.print("ID: " + id);
                System.out.print(", Nom: " + nom);
                System.out.print(", Prénom: " + prenom);
                System.out.println(", Classe: " + classe);
            }

            //STEP 6: Recherche du contenu de la table "matieres"
            System.out.println();
            System.out.println("Recherche des matières...");
            stmt = conn.createStatement();
            String sql1;
            sql1 = "SELECT matiere, nbheures FROM matieres";
            ResultSet rs1 = stmt.executeQuery(sql1);

            //STEP 7: Extract data from result set
            while(rs1.next()){
                //Retrieve by column name
                String matiere  = rs1.getString("matiere");
                String nbheures = rs1.getString("nbheures");

                //Display values
                System.out.print("Matière: " + matiere);
                System.out.println(", Nombre d'heures: " + nbheures);
            }

            //STEP 8: Clean-up environment
            rs1.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
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