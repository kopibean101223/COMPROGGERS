import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class NONFICTIONAL_PAGE {
	public static String buttonlbl;
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
JLabel label3 = new JLabel("NON-FICTIONAL BOOKS");
f.add(label3);
label3.setBounds(430, 200,800, 169);
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


//BACK BUTTON
JButton c=new JButton("Back ");
c. setBounds (1100, 830,180, 50);
c.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
BOOKLIST_PAGE.main(null);
f.dispose();
}
}) ;
//BACK BUTTON




//CUSTOMIZE BUTTONS
Font fontbutton = new Font("ARIAL",Font.BOLD, 20);

c.setFont(fontbutton);

f.add(c);

c.setForeground(Color.WHITE);
c.setBackground(customColor2);



Font fontop = new Font("CANDARA", Font.BOLD, 20);


JPanel panel = new JPanel(null);
panel.setBorder(new EmptyBorder(40, 40, 400, 40));
// Add some components to the JPanel


int n = 130;
try {// Load the MySQL driver
Class.forName("com.mysql.cj.jdbc.Driver");

// Set up the connection URL
String url = "jdbc:mysql://localhost:3306/comprog";

// Connect to the database
Connection conn = DriverManager.getConnection(url, "root", "");
Statement statement = conn.createStatement();
ResultSet resultSet = statement.executeQuery("SELECT TITLE FROM BOOK_DETAILS WHERE CATEGORY = 'NONFICTIONAL'");
while (resultSet.next()) {
	JLabel btnjlbl = new JLabel(resultSet.getString(1));
JButton button = new JButton(resultSet.getString(1));
String btnstr = btnjlbl.getText();
FontMetrics metrics = btnjlbl.getFontMetrics(fontop);

panel.add(button);
button.setForeground(Color.BLACK);
button.setContentAreaFilled(false);
button.setBorderPainted(false);
button.setHorizontalAlignment(SwingConstants.LEFT);
button.setBounds(50, n,metrics.stringWidth(btnstr)+34, metrics.getHeight());
button.setFont(fontop);
n+=40;
button.addActionListener(new ActionListener(){
	public void actionPerformed (ActionEvent e){
		buttonlbl = button.getText();
		System.out.println(buttonlbl);
	BOOK_INFONONFICTION.main(null);
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


// Add the JScrollPane to the center of the second JPanel


f.add(panel);

panel.setBounds(80, 220,1260, 700);
panel.setBackground(Color.WHITE);


         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         


//CUSTOMIZE BUTTONS

// CUSTOMIZE FRAME}
f.setSize(1440,1024);
f.setVisible(true);
f.setResizable(false);
// CUSTOMIZE FRAME}
}
}