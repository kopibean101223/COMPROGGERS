import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class TEACHERLIST_PAGE {
    public static String pgcnchkr;

    public static void main(String[] args) {
        JFrame f = new JFrame("TMC'S LIBRARY MANAGEMENT SYSTEM");
        f.getContentPane().setLayout(null);

        // HEADER
        JLabel label1 = new JLabel(" WELCOME TO TMC'S LIBRARY MANAGEMENT SYSTEM");
        JLabel label2 = new JLabel("");
        f.add(label1);
        f.add(label2);
        label2.setBounds(0, 0, 1440, 169);
        label1.setBounds(100, 0, 1440, 169);

        Font fonttitle = new Font("BAHNSCHRIFT", Font.BOLD, 48);
        Font fontop = new Font("CANDARA", Font.BOLD, 24);
        label1.setFont(fonttitle);
        label1.setOpaque(true);
        Color customColor = new Color(255, 204, 51); 
        label1.setForeground(customColor);
        Color customColor2 = new Color(16, 28, 78);
        label2.setBackground(customColor2);
        label1.setBackground(customColor2);
        label2.setOpaque(true);

        // FORM
        JLabel label3 = new JLabel("TEACHER BORROWERS");
        f.add(label3);
        label3.setBounds(450, 140, 800, 169);
        label3.setFont(fonttitle);
        label3.setBackground(Color.BLACK);

        // LINE
        JLabel label4 = new JLabel("");
        f.add(label4);
        label4.setBounds(0, 260, 1440, 1);
        label4.setFont(fonttitle);
        label4.setOpaque(true);
        label4.setBackground(Color.BLACK);

        // BACK BUTTON
        JButton c = new JButton("Back ");
        c.setBounds(1100, 800, 180, 50);
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BORROWERLIST_PAGE.main(null);
                f.dispose();
            }
        });
        Font fontbutton = new Font("ARIAL", Font.BOLD, 20);
        c.setFont(fontbutton);
        f.add(c);
        c.setForeground(Color.WHITE);
        c.setBackground(customColor2);

        // JPanel to hold the buttons
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Set layout to BoxLayout for vertical stacking
        panel.setBorder(new EmptyBorder(40, 40, 400, 40));
        panel.setBackground(Color.WHITE);

        try {
            // Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Set up the connection URL
            String url = "jdbc:mysql://localhost:3306/comprog";
            // Connect to the database
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT FIRSTNAME, LASTNAME, ID FROM BORROWER_TABLE WHERE TYPE = 'TEACHER'");

            while (resultSet.next()) {
                String id = resultSet.getString(3);
                JButton label10 = new JButton(id);
                panel.add(label10);
                label10.setFont(fontop);
                label10.setForeground(Color.BLACK);
                label10.setContentAreaFilled(false);
                label10.setBorderPainted(false);
                label10.setHorizontalAlignment(SwingConstants.LEFT);

                label10.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        pgcnchkr = label10.getText();
                        System.out.println(pgcnchkr);
                        TEACHERINFOLIST_PAGE.main(null);
                        f.dispose();
                    }
                });
            }

            resultSet.close();
            statement.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Create a JScrollPane and set the JPanel as its viewport view
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setBounds(80, 270, 1260, 500); // Set bounds for the scroll pane
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Add the JScrollPane to the JFrame
        f.add(scrollPane);

        // CUSTOMIZE FRAME
        f.setSize(1440, 1024);
        f.setVisible(true);
        f.setResizable(false);
    }
}
