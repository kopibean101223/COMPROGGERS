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


public class STUDENTBORROW_PAGE {
	public static String nmr,nmrtype;
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
         JLabel lbl=new JLabel ("BORROWER'S TYPE: ");
         lbl.setBounds(350, 350,950, 30);
         f.add(lbl);
         String[] type = {"STUDENT"};
         JComboBox<String> studtype = new JComboBox<String>(type);
         f.add(lbl);
         f.add(studtype);
         studtype.setBounds(350, 380,950, 40);
         //BORROWER TYPE WITH TEXTBOX
         
         
         
         //BORROWER TYPE WITH TEXTBOX

 
         
         JLabel lbl2=new JLabel ("Last Name");
         JTextField lname=new JTextField(30);
         lbl2.setBounds(350, 450,200, 30);
         lname.setBounds(350, 480,250, 30);
         f.add(lbl2);
         f.add(lname);
         
         //BORROWER TYPE WITH TEXTBOX
         
          //BORROWER TYPE WITH TEXTBOX

         JTextField fname;
         
         JLabel lblfname=new JLabel ("First Name");
         fname=new JTextField(15);
         lblfname.setBounds(625, 450,250, 30);
         fname.setBounds(625, 480,250, 30);
         f.add(lblfname);
         f.add(fname);


         
         //BORROWER TYPE WITH TEXTBOX
         
          //BORROWER TYPE WITH TEXTBOX

         JTextField mname;
         
         JLabel lblmname=new JLabel ("Middle Initial");
         mname=new JTextField(1);
         lblmname.setBounds(900, 450,250, 30);
         mname.setBounds(900, 480,250, 30);
         f.add(lblmname);
         f.add(mname);

         

         
         //BORROWER TYPE WITH TEXTBOX
         
                   //BORROWER TYPE WITH TEXTBOX

         JTextField studid;
         
         JLabel lblstudid=new JLabel ("STUDENT ID:");
         studid=new JTextField(15);
         lblstudid.setBounds(350, 530,250, 30);
         studid.setBounds(350, 560,300, 30);
         f.add(lblstudid);
         f.add(studid);
         
         
         

         
         //BORROWER TYPE WITH TEXTBOX
         
         
         //BORROWER TYPE WITH TEXTBOX
         
         String[] yearlevel = {"1", "2", "3","4"};
         JComboBox<String> yrlvl = new JComboBox<String>(yearlevel);
         JLabel lblyrlvl=new JLabel ("YEAR LEVEL: ");
         lblyrlvl.setBounds(1175, 450,125, 30);
         f.add(lblyrlvl);
         f.add(yrlvl);
         yrlvl.setBounds(1175, 480,125, 30);
         Object selectedItem = yrlvl.getSelectedItem();
         String choice = selectedItem.toString();
         JTextField yrlvlchoice = new JTextField(choice) ;
         
         //BORROWER TYPE WITH TEXTBOX
         
         
         
         
         
         
         
         
         
         
         
       //BORROWER TYPE WITH TEXTBOX

         JTextField course;
         
         JLabel lblcrs=new JLabel ("Course");
         course=new JTextField(15);
         lblcrs.setBounds(1000, 530,300, 30);
         course.setBounds(1000, 560,300, 30);
         f.add(lblcrs);
         f.add(course);

         
         //BORROWER TYPE WITH TEXTBOX
         
         
         
         
         
         //BORROWER TYPE WITH TEXTBOX

         JTextField sect;
         
         JLabel lblsect=new JLabel ("Section");
         sect=new JTextField(15);
         lblsect.setBounds(675, 530,300, 30);
         sect.setBounds(675, 560,300, 30);
         f.add(lblsect);
         f.add(sect);

         
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
        	    
        	    
        	    String[] items = {null};
        	    ResultSet resultSet = statement.executeQuery("SELECT TITLE FROM BOOK_DETAILS WHERE STATUS = 'AVAILABLE';");
        	    comboBox = new JComboBox<>(items);
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

         
 	    JLabel ttllbl =new JLabel ();
	    	f.add(ttllbl);
	    	ttllbl.setBounds(675, 640,300, 30);
	    	ttllbl.setOpaque(true);
	    	ttllbl.setBorder(BorderFactory.createLineBorder(new Color(140, 143, 145), 1));
	    	

         
	    	JLabel sttslbl =new JLabel ();
	    	f.add(sttslbl);
	    	sttslbl.setBounds(1000, 640,300, 30);
	    	sttslbl.setOpaque(true);
	    	sttslbl.setBorder(BorderFactory.createLineBorder(new Color(140, 143, 145), 1));
	    	
         
         
	    	

         
         
         
         //BORROWER TYPE WITH TEXTBOX


         
         JLabel lbldateb=new JLabel ("Date Borrowed:");
 
         lbldateb.setBounds(350, 690,300, 30);
         f.add(lbldateb);

         
         JTextField dateTextField;
         dateTextField = new JTextField();
         dateTextField.setEditable(false); // Make it read-only

         // Get today's date
         LocalDate today = LocalDate.now();

         // Format the date as desired
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
         String formattedDate = today.format(formatter);
         dateTextField.setBounds(350, 720,470, 30);
         // Set today's date in the text field
         dateTextField.setText(formattedDate);
         f.add(dateTextField);
         Date Datebor = Date.valueOf(today);
         
         dateTextField.setBorder(BorderFactory.createLineBorder(new Color(140, 143, 145), 1));


         
         //BORROWER TYPE WITH TEXTBOX
         
         //BORROWER TYPE WITH TEXTBOX

         JTextField DueD;

         JLabel lbldued=new JLabel ("DUE DATE:");
         DueD=new JTextField(15);
         lbldued.setBounds(830, 690,470, 30);
         f.add(lbldued);
         f.add(DueD);
         DueD.setBounds(830, 720,470, 30);
         // Set today's date in the text field
         LocalDate outputDate = today.plusDays(3);
         String formattedDate2 = outputDate.format(formatter);
         DueD.setText(formattedDate2);
         DueD.setEditable(false);
         f.add(DueD);
         Date DueDate = Date.valueOf(outputDate);
         DueD.setBorder(BorderFactory.createLineBorder(new Color(140, 143, 145), 1));
         
         //BORROWER TYPE WITH TEXTBOX
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
// BORROW BUTTON
JButton subton=new JButton("Borrow ");
subton.setBounds (350, 800,950, 50);
subton.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
	String selectedItem = (String) comboBox.getSelectedItem();
    if (selectedItem != null) {
    	
    	
    
	String url = "jdbc:mysql://localhost:3306/comprog";
    String user = "root";
    String password = "";

    try {
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement statement = conn.createStatement();
        
       
       
        
        
   String query = ("INSERT INTO BORROWER_TABLE(TYPE, LASTNAME, FIRSTNAME, INITIAL, COURSE, ID, YEARLVL, SECTION, PENALTY)")
   		+ "VALUES ('STUDENT','"+lname.getText()+"', '"+fname.getText()+"', '"+mname.getText()+"', '"+course.getText()+"', '"+studid.getText()+"', '"+yrlvlchoice.getText()+"', '"+sect.getText()+"', '"+0+"');"; 			
   			  String query2 = ("UPDATE BOOK_DETAILS SET STATUS = 'CURRENTLY_BORROWED' WHERE TITLE = '"+ nmr  + "';");
   			   			String query3 = ("UPDATE BOOK_DETAILS SET BORROWER_ID = "+"'"+studid.getText()+"'"+" WHERE TITLE = "+"'"+ nmr  + "';");				
			   					String query4 = ("UPDATE BOOK_DETAILS SET BORROWED_DATE = "+"'"+Datebor+"'"+" WHERE TITLE = "+"'"+ nmr  + "';");
						   				String query5 = ("UPDATE BOOK_DETAILS SET DATE_DUE = "+"'"+DueDate+"'"+" WHERE TITLE = "+"'"+ nmr  + "';");

   				{
   					statement.executeUpdate(query);
	   				statement.executeUpdate(query2);
	   				statement.executeUpdate(query3);
	   				statement.executeUpdate(query4);
	   				statement.executeUpdate(query5);		
	   				JOptionPane.showMessageDialog(f, "You have successfully borrowed " +nmr+"!", " THANK YOU FOR BORROWING!!!", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Inserted successfully!");
        comboBox.removeItem(selectedItem);
   				}
    } catch (SQLException ex) {
    	JOptionPane.showMessageDialog(f, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }else {JOptionPane.showMessageDialog(f, "You must choose a book!\n");}
    
    
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
home.setBounds (50, 220,180, 50);
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
studtype.setBackground(Color.WHITE);
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