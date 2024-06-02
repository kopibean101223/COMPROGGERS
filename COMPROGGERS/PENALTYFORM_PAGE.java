import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PENALTYFORM_PAGE {
	private static double pnlty;
	private static double amtinput;
	private static String nmr;
	public static JComboBox<String> comboBox = new JComboBox<>();
	public static JTextField label10 = new JTextField();
	public static JTextField label11 = new JTextField();
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
JLabel label3 = new JLabel("PAY PENALTY FORM");
f.add(label3);
label3.setBounds(600, 200,800, 169);
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

JLabel lbl2=new JLabel ("STUDENTID");
idchecker=new JTextField(15);
lbl2.setBounds(350, 290,300, 30);
idchecker.setBounds(350, 320,950, 30);
f.add(lbl2);
f.add(idchecker);


Color customColor3 = new Color(224, 228, 230);












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
            	   Connection connc = DriverManager.getConnection(url, "root", "");
            	  Statement statements = connc.createStatement();
            	    

                	    ResultSet resultSet2 = statements.executeQuery("SELECT CATEGORY FROM BOOK_DETAILS WHERE TITLE = " + "'" + selectedItem+ "';");
                	    while (resultSet2.next()) {
                	    	JTextField ttl =new JTextField (resultSet2.getString(1));
                	    	f.add(ttl);
                	    	ttl.setBounds(675, 640,300, 30);
                	    	ttl.setOpaque(true);
                	    	ttl.setEditable(false);


                	    }
                	    
                	    ResultSet resultSet3 = statements.executeQuery("SELECT STATUS FROM BOOK_DETAILS WHERE TITLE = " + "'" + selectedItem+ "';");
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

Font fontop = new Font("BAHNSCHRIFT", Font.BOLD, 24);	








f.add(label10);
label10.setOpaque(true);
label10.setBounds(350, 440,950, 30);
label10.setFont(fontop);
label10.setForeground(Color.BLACK);
label10.setBackground(customColor3);
label10.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
label10.setEditable(false);

f.add(label11);
label11.setOpaque(true);
label11.setBounds(350, 560,950, 30);
label11.setFont(fontop);
label11.setForeground(Color.BLACK);
label11.setBackground(customColor3);
label11.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
label11.setEditable(false);








			JButton chckbtn=new JButton("Check For Balance ");
			chckbtn.setBounds (602, 370,450, 40);
			chckbtn.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				String value = idchecker.getText().trim();
                if (value.isEmpty()) {
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
				    ResultSet resultSetss = statement.executeQuery("SELECT LASTNAME, FIRSTNAME, INITIAL FROM BORROWER_TABLE WHERE ID = "+"'"+idchecker.getText()+"';");
				    
				    
				    if (resultSetss.next()) {
				    	ResultSet resultSet = statement.executeQuery("SELECT LASTNAME, FIRSTNAME, INITIAL FROM BORROWER_TABLE WHERE ID = "+"'"+idchecker.getText()+"';");
                    while (resultSet.next()) {
				    	label10.setText((resultSet.getString(1))+", "+(resultSet.getString(2))+" "+(resultSet.getString(3))+".");


				    }
			    	
				    
				    
				    ResultSet resultSets = statement.executeQuery("SELECT PENALTY FROM BORROWER_TABLE WHERE ID = "+"'"+idchecker.getText()+"';");
				    while (resultSets.next()) {
				    	pnlty = Double.parseDouble((resultSets.getString(1)));
				    	String pnltystring = Double.toString(pnlty);
				    	label11.setText(pnltystring);

				    }

				    } else {
                        JOptionPane.showMessageDialog(f, "The ID you entered does not exist!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                    }
				    
				    resultSetss.close();
					    statement.close();
					    } catch (ClassNotFoundException ex) {
					    	JOptionPane.showMessageDialog(f, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				    } catch (SQLException ex) {
				    	JOptionPane.showMessageDialog(f, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				   }
				
				
						
				
			}
			
			});

			
			f.add(chckbtn);
			 
				



JLabel yn =new JLabel ("YOUR NAME:");
yn.setBounds(350, 410,300, 30);
f.add(yn);




         
        
         
         //BORROWER TYPE WITH TEXTBOX


         
         JLabel amtpdlbl=new JLabel ("AMOUNT PAYABLE:");
         amtpdlbl.setBounds(350, 530,300, 30);
         f.add(amtpdlbl);


         
         //BORROWER TYPE WITH TEXTBOX
         
         //BORROWER TYPE WITH TEXTBOX
         JTextField inptamt;
         
         JLabel chngelbl=new JLabel ("INPUT AMOUNT:");
         inptamt=new JTextField();
         
         chngelbl.setBounds(350, 650,300, 30);
         inptamt.setBounds(350, 680,950, 30);
         f.add(chngelbl);
         f.add(inptamt);

         
         //BORROWER TYPE WITH TEXTBOX
         
        
         
        
         
         
         

         
// HOME BUTTON
JButton subton=new JButton("PAY ");
subton.setBounds (350, 800,950, 50);
subton.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
	String values = inptamt.getText();
	 if (values.matches("[-+]?\\d*(\\.\\d+)?")) {
						 	if (values.isEmpty()) {
				        JOptionPane.showMessageDialog(f, "Please enter a value in the 'INPUT AMOUNT' Field	.", "Error", JOptionPane.ERROR_MESSAGE);
						 }
						 else {	amtinput = Double.parseDouble(inptamt.getText()); 
									double chnge=amtinput-pnlty;
				
									if (pnlty==0) {JOptionPane.showMessageDialog(f, "You Do not neet to pay\n"+"You have no unpaid balance,Good Job!");
				
								}
								else if (pnlty>amtinput) {JOptionPane.showMessageDialog(f, "Insufficient Amount Inputted!\n"+"Enter Another Amount!");
								}
								else if (amtinput>pnlty) {JOptionPane.showMessageDialog(f, "Thank You!,\n Your Change is PHP " + chnge);
								pnlty=0;}
								else if (amtinput==pnlty) {JOptionPane.showMessageDialog(f, "Thank You!,\n Your Change is PHP " + chnge);
								pnlty=0;}
								else {JOptionPane.showMessageDialog(f, "Invalid Input!");
								}
								
								
								
								
								
								
								
								if (pnlty==0) {
									String url = "jdbc:mysql://localhost:3306/comprog";
								    String user = "root";
								    String password = "";
				
								    try {
								        Connection conn = DriverManager.getConnection(url, user, password);
								        Statement statement = conn.createStatement();
								        
								        
								        
								        
								        
								   String query = ("UPDATE BORROWER_TABLE") + (" SET PENALTY = "+ 0) + (" WHERE ID = "+ "'"+idchecker.getText()+"';") ;
								   				statement.executeUpdate(query);
								        
				
								        System.out.println("Deleted successfully!");
								    } catch (SQLException ex) {
								        System.out.println("Error: " + ex.getMessage());
								    }}
								}
									
								
								
								
								
								
	 } else {
		 JOptionPane.showMessageDialog(f, "Invalid input!");
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
chckbtn.setFont(fontbutton);
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

