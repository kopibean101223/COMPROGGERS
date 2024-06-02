import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import java.awt.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TEACHERBORROW_PAGE {
	public static String nmr;
	public static JComboBox<String> comboBox = new JComboBox<>();
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
JLabel label3 = new JLabel("BOOK BORROWING FORM");
f.add(label3);
label3.setBounds(500, 200,800, 169);
label3.setFont(fonttitle);
label3.setBackground(Color.BLACK);
//FORM

//LINE
JLabel label4 = new JLabel("");
f.add(label4);
label4.setBounds(350, 320,950, 1);
label4.setFont(fonttitle);
label4.setOpaque(true);
label4.setBackground(Color.BLACK);
//LINE









			//BORROWER TYPE WITH TEXTBOX
			String[] items = {"Teacher"};
			JComboBox<String> teachtype = new JComboBox<String>(items);
         JLabel lbl=new JLabel ("BORROWER'S TYPE: ");
         lbl.setBounds(350, 350,950, 30);
         f.add(lbl);
         f.add(lbl);
         f.add(teachtype);
         teachtype.setBounds(350, 380,950, 40);
         //BORROWER TYPE WITH TEXTBOX
         
         
         
         //BORROWER TYPE WITH TEXTBOX

         JTextField teachlname;
         
         JLabel teachlblname=new JLabel ("Last Name");
         teachlname=new JTextField(15);
         teachlblname.setBounds(350, 450,300, 30);
         teachlname.setBounds(350, 480,300, 30);
         f.add(teachlblname);
         f.add(teachlname);


         //BORROWER TYPE WITH TEXTBOX
         
          //BORROWER TYPE WITH TEXTBOX

         JTextField teachfname;
         
         JLabel teachlblfname=new JLabel ("First Name");
         teachfname=new JTextField(1);
         teachlblfname.setBounds(675, 450,300, 30);
         teachfname.setBounds(675, 480,300, 30);
         f.add(teachlblfname);
         f.add(teachfname);

         
         //BORROWER TYPE WITH TEXTBOX
         
          //BORROWER TYPE WITH TEXTBOX

         JTextField teachmname;
         
         JLabel lblmname=new JLabel ("Middle Name");
         teachmname=new JTextField(15);
         lblmname.setBounds(1000, 450,300, 30);
         teachmname.setBounds(1000, 480,300, 30);
         f.add(lblmname);
         f.add(teachmname);

         
         //BORROWER TYPE WITH TEXTBOX
         
                   //BORROWER TYPE WITH TEXTBOX

         JTextField employeeid;
         
         JLabel lblempid=new JLabel ("EMPLOYEE ID:");
         employeeid=new JTextField(15);
         lblempid.setBounds(350, 530,300, 30);
         employeeid.setBounds(350, 560,470, 30);
         f.add(lblempid);
         f.add(employeeid);

         
         //BORROWER TYPE WITH TEXTBOX
         
         
         //BORROWER TYPE WITH TEXTBOX
         
         String[] cllg = {"CHK", "CCIS", "CBFS","CTHM" };
         JComboBox<String> department = new JComboBox<String>(cllg);
         JLabel lbl6=new JLabel ("DEPARTMENT: ");
         lbl6.setBounds(830, 530,300, 30);
         f.add(lbl6);
         f.add(lbl6);
         f.add(department);
         department.setBounds(830, 560,470, 30);
         Object selectedItem = department.getSelectedItem();
         String teachchoice = selectedItem.toString();
         JTextField teachdepartment = new JTextField(teachchoice) ;
         //BORROWER TYPE WITH TEXTBOX
         
         
         JLabel avlblbooks =new JLabel ("BOOK TO BE BORROWED: ");
         avlblbooks.setBounds(350, 610,250, 30);
         f.add(avlblbooks);
         
         JLabel ctgrybks =new JLabel ("CATEGORY: ");
         ctgrybks.setBounds(675, 610,250, 30);
         f.add(ctgrybks);
         
         JLabel sttsbks =new JLabel ("STATUS: ");
         sttsbks.setBounds(1000, 610,250, 30);
         f.add(sttsbks);
         
         
         
         
         try {// Load the MySQL driver
     	    Class.forName("com.mysql.cj.jdbc.Driver");

     	    // Set up the connection URL
     	    String url = "jdbc:mysql://localhost:3306/comprog";


     	    // Connect to the database
     	    Connection conn = DriverManager.getConnection(url, "root", "");
     	    Statement statement = conn.createStatement();
     	    
     	    
     	    String[] itemss = {null};
     	    ResultSet resultSet = statement.executeQuery("SELECT TITLE FROM BOOK_DETAILS WHERE STATUS = 'AVAILABLE';");
     	   comboBox = new JComboBox<>(itemss);
     	    while (resultSet.next()) {
     	    	String value = resultSet.getString(1);
     	    	comboBox.addItem(value);
     	    	f.add(comboBox);
     	    	comboBox.setBounds(350, 640,300, 30);
     	    }
     	    
     	    
     	    
     	    
     	    comboBox.addItemListener(new ItemListener() {
     	        @Override
     	        public void itemStateChanged(ItemEvent ex) {
     	            if (ex.getStateChange() == ItemEvent.SELECTED) {
     	               String selectedItem = (String) ex.getItem();
     	                nmr = selectedItem;
     	                System.out.println("Selected item: " + selectedItem);
     	                try {// Load the MySQL driver
                     	    Class.forName("com.mysql.cj.jdbc.Driver");

                     	    // Set up the connection URL
                     	  String  url = "jdbc:mysql://localhost:3306/comprog";


                     	    // Connect to the database
                     	   Connection conn = DriverManager.getConnection(url, "root", "");
                     	  Statement statement = conn.createStatement();
                     	    

                         	    ResultSet resultSet2 = statement.executeQuery("SELECT CATEGORY FROM BOOK_DETAILS WHERE TITLE = " + "'" + selectedItem+ "';");
                         	    while (resultSet2.next()) {
                         	    	JTextField ttl =new JTextField (resultSet2.getString(1));
                         	    	f.add(ttl);
                         	    	ttl.setBounds(675, 640,300, 30);
                         	    	ttl.setOpaque(true);
                         	    	ttl.setEditable(false);


                         	    }
                         	    
                         	    ResultSet resultSet3 = statement.executeQuery("SELECT STATUS FROM BOOK_DETAILS WHERE TITLE = " + "'" + selectedItem+ "';");
                         	    while (resultSet3.next()) {
                         	    	JTextField stts =new JTextField (resultSet3.getString(1));
                         	    	f.add(stts);
                         	    	stts.setBounds(1000, 640,300, 30);
                         	    	stts.setOpaque(true);
                         	    	stts.setEditable(false);
                         	    }
                         	    
                         	    resultSet.close();
                         	    statement.close();
                         	    } catch (ClassNotFoundException e) {
                         	        System.out.print("");
                         	        e.printStackTrace();
                         	    } catch (SQLException e) {
                         	        System.out.print("");
                         	        e.printStackTrace();
                         	        JOptionPane.showMessageDialog(f, "Error!");
                         	        
                         	   }
     	            }
     	        }
     	    });
     	    

     	    

 
     	    
     	    
     	    
     	    
     	    
     	    
     	    
     	    resultSet.close();
     	    statement.close();
     	    } catch (ClassNotFoundException e) {
     	        System.out.print("");
     	        e.printStackTrace();
     	    } catch (SQLException e) {
     	        System.out.print("");
     	        e.printStackTrace();
     	   }
         
         
         
         
         
         
         
         
    
         
         //BORROWER TYPE WITH TEXTBOX

         JTextField datebor;
         
         JLabel lbl2=new JLabel ("Date Borrowed:");
         datebor=new JTextField(15);
         lbl2.setBounds(350, 690,300, 30);
         datebor.setBounds(350, 720,470, 30);
         f.add(lbl2);

         datebor.setEditable(false); // Make it read-only

         // Get today's date
         LocalDate today = LocalDate.now();

         // Format the date as desired
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
         String formattedDate = today.format(formatter);
         datebor.setBounds(350, 720,470, 30);
         // Set today's date in the text field
         datebor.setText(formattedDate);
         f.add(datebor);
         Date Datebor = Date.valueOf(today);
         
         //BORROWER TYPE WITH TEXTBOX
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
// HOME BUTTON
JButton subton=new JButton("Borrow ");
subton. setBounds (350, 800,950, 50);
subton.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
	String selectedItem = (String) comboBox.getSelectedItem();
    if (selectedItem != null) {
        comboBox.removeItem(selectedItem);
    }
	String url = "jdbc:mysql://localhost:3306/comprog";
    String user = "root";
    String password = "";

    try {
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement statement = conn.createStatement();
        
        
        
        
        
   String query = ("INSERT INTO BORROWER_TABLE(TYPE, LASTNAME, FIRSTNAME, INITIAL, ID, DEPARTMENT)")
   		+ "VALUES ('TEACHER','"+teachlname.getText()+"', '"+teachfname.getText()+"', '"+teachmname.getText()+"', '"+employeeid.getText()+"', '"+teachdepartment.getText()+"');";  
   				
   			  String query2 = ("UPDATE BOOK_DETAILS SET STATUS = 'CURRENTLY_BORROWED' WHERE TITLE = '"+ nmr  + "';");
	   				
	   				
	   			String query3 = ("UPDATE BOOK_DETAILS SET BORROWER_ID = "+"'"+employeeid.getText()+"'"+" WHERE TITLE = "+"'"+ nmr  + "';");
 				
	   				
 				String query4 = ("UPDATE BOOK_DETAILS SET BORROWED_DATE = "+"'"+Datebor+"'"+" WHERE TITLE = "+"'"+ nmr  + "';");
 				{
 				statement.executeUpdate(query4);	
 				statement.executeUpdate(query);
 				statement.executeUpdate(query3);
 				statement.executeUpdate(query2);
        System.out.println("Inserted successfully!");
        JOptionPane.showMessageDialog(f, "You have successfully borrowed: " + nmr, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
    }
    } catch (SQLException ex) {
    	JOptionPane.showMessageDialog(f, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
}) ;
// HOME BUTTON     
         
         
// BACK BUTTON
JButton c=new JButton("Back ");
c. setBounds (50, 280,180, 50);
c.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
BORROWERSELECTION_PAGE.main(null);
f.dispose();
}
}) ;
// BACK BUTTON

// HOME BUTTON
JButton home=new JButton("Home");
home. setBounds (50, 220,180, 50);
home.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
HOMEPAGE.main(null);
f.dispose();
}
}) ;
// HOME BUTTON


//CUSTOMIZE BUTTONS
Font fontbutton = new Font("ARIAL",Font.BOLD, 20);
home.setFont(fontbutton);
c.setFont(fontbutton);
subton.setFont(fontbutton);
subton.setBackground(customColor2);
subton.setForeground(Color.WHITE);
f.add(home);
f.add(c);
f.add(subton);
c.setForeground(Color.WHITE);
c.setBackground(customColor2);
home.setForeground(Color.WHITE);
home.setBackground(customColor2);
teachtype.setBackground(Color.WHITE);
//CUSTOMIZE BUTTONS

JLabel bg = new JLabel("");
f.add(bg);
bg.setBounds(300, 220,1050, 700);

bg.setBackground(Color.WHITE);
bg.setOpaque(true);

// CUSTOMIZE FRAME}
f.setSize(1440,1024);
f.setVisible(true);
f.setResizable(false);
// CUSTOMIZE FRAME}
}
}