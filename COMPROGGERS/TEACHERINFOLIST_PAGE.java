
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import java.awt.*;

public class TEACHERINFOLIST_PAGE {
public static void main (String[] args) {

JFrame f=new JFrame("TMC'S LIBRARY MANAGEMENT SYSTEM");
f. getContentPane(). setLayout(null);


//HEADER{
JLabel label1 = new JLabel(" WELCOME TO TMC'S LIBRARY MANAGEMENT SYSTEM");
JLabel label2 = new JLabel("");
f.add(label1);
f.add(label2);
label2.setBounds(0, 0,1440, 169);
label1.setBounds(100, 0,1440, 169);

Font fonttitle = new Font("BAHNSCHRIFT", Font.BOLD, 48);
label1.setFont(fonttitle);
label1.setOpaque(true);
Color customColor = new Color(255, 204, 51);
label1.setForeground(customColor);
Color customColor2 = new Color(16, 28, 78);
label2.setBackground(customColor2);
label1.setBackground(customColor2);
label2.setOpaque(true);
//}

//FORM
JLabel label3 = new JLabel("TEACHER INFORMATION");
f.add(label3);
label3.setBounds(500, 200,800, 169);
label3.setFont(fonttitle);
label3.setBackground(Color.BLACK);
//FORM

//LINE
JLabel label4 = new JLabel("");
f.add(label4);
label4.setBounds(100, 320,1220, 1);
label4.setFont(fonttitle);
label4.setOpaque(true);
label4.setBackground(Color.BLACK);
//LINE


Font fontotpt = new Font("CANDARA", Font.BOLD, 26);






         
         
try {// Load the MySQL driver
    Class.forName("com.mysql.cj.jdbc.Driver");

    // Set up the connection URL
    String url = "jdbc:mysql://localhost:3306/comprog";


    // Connect to the database
    Connection conn = DriverManager.getConnection(url, "root", "");
    Statement statement = conn.createStatement();
    
    
    
    ResultSet resultSet = statement.executeQuery("SELECT LASTNAME,FIRSTNAME,INITIAL FROM BORROWER_TABLE WHERE ID = "+"'"+ TEACHERLIST_PAGE.pgcnchkr+"';");
    while (resultSet.next()) {
    	JLabel RSlbl = new JLabel("NAME:     "+(resultSet.getString(1))+" "+(resultSet.getString(2))+" "+(resultSet.getString(3)));
    	f.add(RSlbl);
    	RSlbl.setBounds(200, 340,1000, 60);
    	RSlbl.setFont(fontotpt);
    	RSlbl.setForeground(Color.BLACK);
    	RSlbl.setHorizontalAlignment(SwingConstants.LEFT);

    	
    }
    
    
    

    resultSet = statement.executeQuery("SELECT DEPARTMENT FROM BORROWER_TABLE WHERE ID = "+"'"+ TEACHERLIST_PAGE.pgcnchkr+"';");
    while (resultSet.next()) {
    	JLabel RSlbl = new JLabel("DEPARTMENT:     "+(resultSet.getString(1)));
    	f.add(RSlbl);
    	RSlbl.setBounds(200, 400,1000, 60);
    	RSlbl.setFont(fontotpt);
    	RSlbl.setForeground(Color.BLACK);
    	RSlbl.setHorizontalAlignment(SwingConstants.LEFT);

    	
    }
    

    resultSet = statement.executeQuery("SELECT TITLE FROM BOOK_DETAILS WHERE ID = "+"'"+ TEACHERLIST_PAGE.pgcnchkr+"';");
    while (resultSet.next()) {
    	JLabel RSlbl = new JLabel("BORROWED BOOKS:     "+(resultSet.getString(1)));
    	f.add(RSlbl);
    	RSlbl.setBounds(200, 460,1000, 60);
    	RSlbl.setFont(fontotpt);
    	RSlbl.setForeground(Color.BLACK);
    	RSlbl.setHorizontalAlignment(SwingConstants.LEFT);
    	
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


         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         

         
// BACK BUTTON
JButton c=new JButton("Back ");
c. setBounds (1100, 830,180, 50);
c.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
TEACHERLIST_PAGE.main(null);
f.dispose();
}
}) ;
// BACK BUTTON




//CUSTOMIZE BUTTONS
Font fontbutton = new Font("ARIAL",Font.BOLD, 20);

c.setFont(fontbutton);

f.add(c);

c.setForeground(Color.WHITE);
c.setBackground(customColor2);
//CUSTOMIZE BUTTONS

JLabel bg = new JLabel("");
f.add(bg);
bg.setBounds(80, 220,1260, 700);

bg.setBackground(Color.WHITE);
bg.setOpaque(true);

// CUSTOMIZE FRAME}
f.setSize(1440,1024);
f.setVisible(true);
f.setResizable(false);
// CUSTOMIZE FRAME}
}
}



