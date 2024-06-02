import java.awt.event.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class RETURNBOOK_PAGE {
	public static String nmr;
	public static JComboBox<String> comboBox = new JComboBox<>();
	public static String selectedItem;
	public static long daysBetween;
public static void main (String[] args) {

JFrame f=new JFrame("TMC'S LIBRARY MANAGEMENT SYSTEM");
f. getContentPane(). setLayout(null);

String[] items = {null};
comboBox = new JComboBox<>(items);
comboBox.setOpaque(true);
comboBox.setVisible(true);
comboBox.setBounds(350, 485,300, 30);
f.add(comboBox);

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
JLabel label3 = new JLabel("BOOK RETURNING FORM");
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

JTextField idchecker;

JLabel idchkerlbl =new JLabel ("STUDENTID");
idchecker=new JTextField(15);
idchkerlbl.setBounds(350, 290,300, 30);
idchecker.setBounds(350, 320,950, 30);
f.add(idchkerlbl);
f.add(idchecker);


JLabel brdtlbl = new JLabel("Date Borrowed: ");
f.add(brdtlbl);
brdtlbl.setBounds(350, 560,300, 30);
JLabel dtdulbl = new JLabel("Due Date: ");
	f.add(dtdulbl);
	dtdulbl.setBounds(675, 560,300, 30);
	
	Color customColor3 = new Color(224, 228, 230);

	
	JTextField ttl =new JTextField ();
	f.add(ttl);
 	ttl.setBounds(675, 485,300, 30);
 	ttl.setOpaque(true);
 	ttl.setEditable(false);
 	ttl.setBackground(customColor3);
 	ttl.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
 	ttl.setForeground(customColor3);
 	
 	JTextField stts =new JTextField ();
 	f.add(stts);
 	stts.setBounds(1000, 485,300, 30);
 	stts.setOpaque(true);
 	stts.setEditable(false);
 	stts.setBackground(customColor3);
 	stts.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
 	stts.setForeground(customColor3);
	
 	JTextField brdt =new JTextField ();
	f.add(brdt);
	brdt.setBounds(350, 590,300, 30);
	brdt.setOpaque(true);
	brdt.setEditable(false);
	brdt.setBackground(customColor3);
	brdt.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
	brdt.setForeground(customColor3);
	
	JTextField dtdu =new JTextField ();
 	f.add(dtdu);
 	dtdu.setBounds(675, 590,300, 30);
 	dtdu.setOpaque(true);
 	dtdu.setEditable(false);
 	dtdu.setBackground(customColor3);
 	dtdu.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
 	dtdu.setForeground(customColor3);
 	

 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	comboBox.addItemListener(new ItemListener() {
	        @Override
	        public void itemStateChanged(ItemEvent ex) {
	            if (ex.getStateChange() == ItemEvent.SELECTED) {
	               selectedItem = (String) ex.getItem();
	              
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
                 	    	JTextField ttls =new JTextField (resultSet2.getString(1));
                 	    	f.add(ttls);
                 	    	
                 	    	ttls.setBounds(675, 485,300, 30);
                 	    	ttls.setOpaque(true);
                 	    	ttls.setEditable(false);
                 	    	ttls.setBackground(customColor3);
                 	    	ttls.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
                 	    	ttls.setBackground(customColor3);
                 	    }
                 	    
                 	    ResultSet resultSet3 = statement.executeQuery("SELECT STATUS FROM BOOK_DETAILS WHERE TITLE = " + "'" + selectedItem+ "';");
                 	    while (resultSet3.next()) {
                 	    	JTextField sttss =new JTextField (resultSet3.getString(1));
                 	    	f.add(sttss);
                 	    	
                 	    	sttss.setBounds(1000, 485,300, 30);
                 	    	sttss.setOpaque(true);
                 	    	sttss.setEditable(false);
                 	    	sttss.setBackground(customColor3);
                 	    	sttss.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
                 	    	sttss.setBackground(customColor3);
                 	    }
                 	    
                 	   ResultSet resultSet4 = statement.executeQuery("SELECT BORROWED_DATE FROM BOOK_DETAILS WHERE TITLE = " + "'" + selectedItem+ "';");
                	    while (resultSet4.next()) {
                	    	JTextField brdts =new JTextField (resultSet4.getString(1));
                	    	f.add(brdts);
                	    	
                	    	brdts.setBounds(350, 590,300, 30);
                	    	brdts.setOpaque(true);
                	    	brdts.setEditable(false);
                	    	brdts.setBackground(customColor3);
                	    	brdts.setForeground(Color.BLACK);
                	    	brdts.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
                	    }
                	    
                	    ResultSet resultSet5 = statement.executeQuery("SELECT DATE_DUE FROM BOOK_DETAILS WHERE TITLE = " + "'" + selectedItem+ "';");
                 	    while (resultSet5.next()) {
                 	    	JTextField dtdus =new JTextField (resultSet5.getString(1));
                 	    	f.add(dtdus);
                 	    	
                 	    	dtdus.setBounds(675, 590,300, 30);
                 	    	dtdus.setOpaque(true);
                 	    	dtdus.setEditable(false);
                 	    	dtdus.setBackground(customColor3);
                 	    	dtdus.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
                 	    }
                 	    
                 	    
                 	    

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
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
JButton chckbtn=new JButton("Check For Record");
chckbtn.setBounds (602, 370,450, 40);
chckbtn.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
	String values = idchecker.getText().trim();
    if (values.isEmpty()) {
        JOptionPane.showMessageDialog(f, "Please enter a value in the text field.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
   
										try {// Load the MySQL driver
									 	    Class.forName("com.mysql.cj.jdbc.Driver");
									
									 	    // Set up the connection URL
									 	    String url = "jdbc:mysql://localhost:3306/comprog";
									
									
									 	    // Connect to the database
									 	    Connection conn = DriverManager.getConnection(url, "root", "");
									 	    Statement statement = conn.createStatement();
									 	    
									 	 //COMBO BOX AND DISPLAY 	    
									 	   comboBox.removeAllItems();
									 	  comboBox.addItem(null);
									 	 
									 	 
									 	   ResultSet resultSetss = statement.executeQuery("SELECT LASTNAME, FIRSTNAME, INITIAL,PENALTY FROM BORROWER_TABLE WHERE ID = "+"'"+idchecker.getText()+"';");
									 	   
									 	  if (resultSetss.next()) {
									 		  if(resultSetss.getInt(4)!=0) {JOptionPane.showMessageDialog(f, "You have unpaid balance!");
									 		  return;}
									 		  else {
									 	    ResultSet resultSet = statement.executeQuery("SELECT TITLE FROM BOOK_DETAILS WHERE BORROWER_ID =" +"'" +idchecker.getText()+"';");
									 	    while (resultSet.next()) {
									 	    	
									 	    	String value = resultSet.getString(1);
									 	    	comboBox.addItem(value);
									 	    }
									 	    
									 	    
									 		  }
 	 //COMBO BOX AND DISPLAY				
										    } else {
						                        JOptionPane.showMessageDialog(f, "The ID you entered does not exist!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
										    }
 	    
 	    resultSetss.close();
 	    statement.close();
 	    } catch (ClassNotFoundException ef) {
 	        System.out.print("");
 	        ef.printStackTrace();
 	    } catch (SQLException ef) {
 	        System.out.print("");
 	        ef.printStackTrace();
 	   }
}
});


f.add(chckbtn);
 


         
         //BORROWER TYPE WITH TEXTBOX

         
         //BORROWER TYPE WITH TEXTBOX
         
         
         //BORROWER TYPE WITH TEXTBOX


         JLabel lbl6=new JLabel ("Borrowed Books: ");
         lbl6.setBounds(350, 455,300, 30);
         f.add(lbl6);
         f.add(lbl6);
         


         //BORROWER TYPE WITH TEXTBOX
         

         
         
         
         
         
         
     
         
// HOME BUTTON
JButton subton=new JButton("Return Book ");
subton. setBounds (350, 800,950, 50);
subton.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
	String values = idchecker.getText().trim();
    if (values.isEmpty()) {
        JOptionPane.showMessageDialog(f, "Please enter a value in the text field.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
	
	
	

        
        try {// Load the MySQL driver
		    Class.forName("com.mysql.cj.jdbc.Driver");

		    // Set up the connection URL
		    String url = "jdbc:mysql://localhost:3306/comprog";

		    // Connect to the database
		    Connection conn = DriverManager.getConnection(url, "root", "");
		    Statement statement = conn.createStatement();
		    ResultSet resultSetss = statement.executeQuery("SELECT DATE_DUE FROM BOOK_DETAILS WHERE TITLE = "+"'"+selectedItem+"';");
            while (resultSetss.next()) {
            	LocalDate duedatez = resultSetss.getDate(1).toLocalDate();
            	System.out.print(duedatez);
            	LocalDate today = LocalDate.now();
            	System.out.print(today);
            	daysBetween = ChronoUnit.DAYS.between(duedatez, today);
		    }
		    resultSetss.close();
			    statement.close();
			    } catch (ClassNotFoundException ex) {
			    	JOptionPane.showMessageDialog(f, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		    } catch (SQLException ex) {
		    	JOptionPane.showMessageDialog(f, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		   }
		
	
	
	
	
	
	
	
	
	if( daysBetween >0) {
		daysBetween = daysBetween*20;
		
		
		
		
	} else 
    	
	{}
	String url = "jdbc:mysql://localhost:3306/comprog";
    String user = "root";
    String password = "";

    try {
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement statement = conn.createStatement();
        
       

        
   String query = ("UPDATE BOOK_DETAILS SET STATUS ='AVAILABLE' WHERE TITLE = '"+selectedItem+"'");
   			  String query2 = ("UPDATE BOOK_DETAILS SET BORROWER_ID = NULL WHERE TITLE = '"+selectedItem+"'");
   			   			String query3 = ("UPDATE BOOK_DETAILS SET BORROWED_DATE = NULL WHERE TITLE = '"+selectedItem  + "'");				
			   					String query4 = ("UPDATE BOOK_DETAILS SET DATE_DUE = NULL TITLE = '"+selectedItem  + "'");
						   			
			   					{
   					statement.execute(query);
	   				statement.execute(query2);
	   				statement.execute(query3);
	   				statement.execute(query4);
			   					}
	   		        
             	    statement.close();
    } catch (SQLException ex) {

    	JOptionPane.showMessageDialog(f, "You have successfully Returned " +selectedItem+"!", " THANK YOU FOR RETURNING!!!", JOptionPane.INFORMATION_MESSAGE);
	        System.out.println("Inserted successfully!");
	        comboBox.removeItem(selectedItem);
	   }
    
	
    

}
}) ;
// HOME BUTTON     
         
         
// BACK BUTTON
JButton c=new JButton("Back ");
c. setBounds (50, 280,180, 50);
c.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
HOMEPAGE.main(null);
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
chckbtn.setFont(fontbutton);
subton.setBackground(customColor2);
subton.setForeground(Color.WHITE);
f.add(home);
f.add(c);
f.add(subton);
c.setForeground(Color.WHITE);
c.setBackground(customColor2);
home.setForeground(Color.WHITE);
home.setBackground(customColor2);
chckbtn.setBackground(customColor2);
chckbtn.setForeground(Color.WHITE);

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