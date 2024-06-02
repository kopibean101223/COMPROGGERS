import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class HOMEPAGE {
public static void main (String[] args) {
JFrame homepageframe=new JFrame("TMC'S LIBRARY MANAGEMENT SYSTEM");
homepageframe. getContentPane(). setLayout(null);


//HEADER{
JLabel label1 = new JLabel(" WELCOME TO TMC'S LIBRARY MANAGEMENT SYSTEM");
JLabel label2 = new JLabel("");
homepageframe.add(label1);
homepageframe.add(label2);
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





// BOOK LIST BUTTON
JButton b=new JButton("BOOK LIST");
b. setBounds (350, 200,680, 109);
b.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
BOOKLIST_PAGE.main(null);
homepageframe.dispose();
}
}) ;
// BOOK LIST BUTTON

// BORROWER LIST BUTTON
JButton c=new JButton("BORROWER LIST");
c. setBounds (350, 320,680, 109);
c.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
BORROWERLIST_PAGE.main(null);
homepageframe.dispose();
}
}) ;
// BORROWER LIST BUTTON

// BORROW LIST BUTTON
JButton a=new JButton("BORROW BOOK");
a.setBounds (350, 440,680, 109);
a.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
BORROWERSELECTION_PAGE.main(null);
homepageframe.dispose();
}
}) ;
// BORROW LIST BUTTON

// RETURN BOOK BUTTON
JButton d=new JButton("RETURN BOOK");
d.setBounds (350, 560,680, 109);
d.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
RETURNBOOK_PAGE.main(null);
homepageframe.dispose();
}
}) ;
// RETURN BOOK BUTTON

// PAY PENALTY BUTTON
JButton e=new JButton("PAY PENALTY");
e.setBounds (350, 680,680, 109);
e.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
PENALTYFORM_PAGE.main(null);
homepageframe.dispose();
}
}) ;
// PAY PENALTY BUTTON


// BUTTON CUSTOMIZE
Font fontbutton = new Font("ARIAL",Font.PLAIN, 40);
a.setFont(fontbutton);
b.setFont(fontbutton);
c.setFont(fontbutton);
d.setFont(fontbutton);
e.setFont(fontbutton);
a.setBackground(Color.WHITE);
b.setBackground(Color.WHITE);
c.setBackground(Color.WHITE);
d.setBackground(Color.WHITE);
e.setBackground(Color.WHITE);
homepageframe. getContentPane() .add (b);
homepageframe. getContentPane() .add(c);
homepageframe. getContentPane() .add(a);
homepageframe. getContentPane() .add(d);
homepageframe. getContentPane() .add(e);
// BUTTON CUSTOMIZE


// CUSTOMIZE FRAME
homepageframe.setSize(1440,1024);
homepageframe.setVisible(true);
homepageframe.setResizable(false);
// CUSTOMIZE FRAME

}
}