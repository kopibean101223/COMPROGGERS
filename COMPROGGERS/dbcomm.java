import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbcomm {
    public static void BORROWER() {
            
    	 try {// Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Set up the connection URL
            String url = "jdbc:mysql://localhost:3306/MYDATABASE";

            // Connect to the database
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT FIRSTNAME FROM PERSONALFORM");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
            
            resultSet.close();
            statement.close();
    	 } catch (ClassNotFoundException e) {
             System.out.println("MySQL driver not found.");
             e.printStackTrace();
         } catch (SQLException e) {
             System.out.println("Connection failed.");
             e.printStackTrace();
             
    }
}
    public void RETURNER() {
        
   	 try {// Load the MySQL driver
           Class.forName("com.mysql.cj.jdbc.Driver");

           // Set up the connection URL
           String url = "jdbc:mysql://localhost:3306/MYDATABASE";

           // Connect to the database
           Connection conn = DriverManager.getConnection(url, "root", "");
           Statement statement = conn.createStatement();
           ResultSet resultSet = statement.executeQuery("SELECT FIRSTNAME FROM PERSONALFORM");
           while (resultSet.next()) {
               System.out.println(resultSet.getString(1));
           }
           
           resultSet.close();
           statement.close();
   	 } catch (ClassNotFoundException e) {
            System.out.println("MySQL driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
            
   }
}
}