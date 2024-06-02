import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class BOOKLIST_PAGE {
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


//FICTIONAL BUTTON
JButton b=new JButton("FICTIONAL");
b. setBounds (350, 200,680, 109);
b.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
FICTIONAL_PAGE.main(null);
f.dispose();
}
}) ;
//FICTIONAL BUTTON

//NON-FICTIONAL BUTTON
JButton c=new JButton("NON-FICTIONAL");
c. setBounds (350, 320,680, 109);
c.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
NONFICTIONAL_PAGE.main(null);
f.dispose();
}
}) ;
//FICTIONAL BUTTON

//ACADEMIC BUTTON
JButton a=new JButton("ACADEMIC");
a.setBounds (350, 440,680, 109);
a.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
ACADEMIC_PAGE.main(null);
f.dispose();
}
}) ;
//ACADEMIC BUTTON

//BACK BUTTON
JButton backbut=new JButton("Back ");
backbut.setBounds (350, 560,680, 109);
backbut.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
HOMEPAGE.main(null);
f.dispose();
}
}) ;
//BACK BUTTON

//BUTTON CUSTOMIZE
Font fontbutton = new Font("ARIAL",Font.PLAIN, 40);

a.setFont(fontbutton);
b.setFont(fontbutton);
c.setFont(fontbutton);
a.setBackground(Color.WHITE);
b.setBackground(Color.WHITE);
c.setBackground(Color.WHITE);
f. getContentPane() .add (b);
f. getContentPane() .add(c);
f. getContentPane() .add(a);
f. getContentPane() .add(backbut);
backbut.setFont(fontbutton);
backbut.setBackground(customColor2);
backbut.setForeground(Color.WHITE);
//BUTTON CUSTOMIZE

// CUSTOMIZE FRAME
f.setSize(1440,1024);
f.setVisible(true);
f.setResizable(false);
// CUSTOMIZE FRAME

}
}