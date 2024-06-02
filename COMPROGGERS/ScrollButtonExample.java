import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollButtonExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel with a GridLayout
        JPanel panel = new JPanel(new GridLayout(100, 10));
        panel.setBorder(new EmptyBorder(40, 40, 400, 40));

        // Add some components to the JPanel

        
        
        
        
        
        
        
        
        
        
        
        
        
        

try {// Load the MySQL driver
    Class.forName("com.mysql.cj.jdbc.Driver");

    // Set up the connection URL
    String url = "jdbc:mysql://localhost:3306/MYDATABASE";

    // Connect to the database
    Connection conn = DriverManager.getConnection(url, "root", "");
    Statement statement = conn.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT TITLE FROM BOOK_DETAILS WHERE CATEGORY = 'ACADEMIC'");
    while (resultSet.next()) {
    	JLabel button1 = new JLabel((resultSet.getString(1)));
    	JButton button = new JButton((resultSet.getString(1)));
    	panel.add(button1);
    	panel.add(button);
    	button.setForeground(Color.BLACK);
    	button.setContentAreaFilled(false);
    	button.setBorderPainted(false);
    	button.setHorizontalAlignment(SwingConstants.LEFT);
    	button.addActionListener(new ActionListener(){
    		public void actionPerformed (ActionEvent e){
    			String buttonlbl = button.getText();
    			System.out.println(buttonlbl);
    		BOOK_INFOACADEMIC.main(null);
    		f.dispose();
    		}
    		}) ;
    }

    resultSet.close();
    statement.close();
    } catch (ClassNotFoundException e) {
        System.out.print("");
        e.printStackTrace();
    } catch (SQLException e) {
        System.out.print("");
        e.printStackTrace();
        
   }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
            
 

        // Create a JScrollPane and set the JPanel as its viewport view
        JScrollPane scrollPane = new JScrollPane(panel);

        // Add the JScrollPane to the JFrame
        f.add(scrollPane, BorderLayout.CENTER);

        // Set the JFrame size and make it visible
        f.setSize(800, 800);
        f.setVisible(true);
    }
}




