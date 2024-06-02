import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class BORROWERLIST_PAGE {
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

// STUDENT BUTTON
JButton b=new JButton("STUDENT");
b. setBounds (350, 200,680, 109);
b.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
STUDENTLIST_PAGE.main(null);
f.dispose();
}
}) ;
// STUDENT BUTTON

// TEACHER BUTTON
JButton c=new JButton("TEACHER");
c. setBounds (350, 320,680, 109);
c.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
TEACHERLIST_PAGE.main(null);
f.dispose();
}
}) ;
// TEACHER BUTTON


// BACK BUTTON
JButton g=new JButton("Back ");
g.setBounds (350, 440,680, 109);
g.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
HOMEPAGE.main(null);
f.dispose();
}
}) ;
//BACK BUTTON



// CUSTOMIZE BUTTON
Font fontbutton = new Font("ARIAL",Font.PLAIN, 40);
b.setFont(fontbutton);
c.setFont(fontbutton);
b.setBackground(Color.WHITE);
c.setBackground(Color.WHITE);
f.add (b);
f.add(c);
f.add(g);
g.setFont(fontbutton);
g.setBackground(customColor2);
g.setForeground(Color.WHITE);
g.setFont(fontbutton);
// CUSTOMIZE BUTTON


// CUSTOMIZE FRAME}
f.setSize(1440,1024);
f.setVisible(true);
f.setResizable(false);
// CUSTOMIZE FRAME}
}
}