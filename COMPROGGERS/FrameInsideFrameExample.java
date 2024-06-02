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

public class FrameInsideFrameExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Frame Inside Frame Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        // Create a JDesktopPane
        JDesktopPane desktop = new JDesktopPane();

        // Create a JInternalFrame
        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.setSize(300, 200);
        desktop.setBounds(100, 100,300,200);
        // Add the JInternalFrame to the JDesktopPane
        desktop.add(internalFrame);
        // Add the JDesktopPane to the JFrame
        frame.add(desktop);

        
        JPanel panel = new JPanel(new GridLayout(100, 10));
        panel.setBorder(new EmptyBorder(40, 40, 400, 40));

        // Add some components to the JPanel
        internalFrame.add(panel);
        desktop.add(panel);
        
        
        
        
        
        
        
        
        
        
        
        
        

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
frame.dispose();
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
        internalFrame.add(scrollPane, BorderLayout.CENTER);
        desktop.add(scrollPane, BorderLayout.CENTER);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // Set the size of the JFrame and make it visible
        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}