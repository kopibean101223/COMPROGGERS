
	import javax.swing.*;
	import javax.swing.border.TitledBorder;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class ScrollalblePanelExample {
	    public static void main(String[] args) {
	        // Create a new JFrame
	        JFrame frame = new JFrame("Scroll Button Scroll Pane Example");

	        // Set the layout of the frame
	        frame.setLayout(new BorderLayout());

	        // Create a new JButton to scroll the panel
	        JButton scrollButton = new JButton("Scroll");

	        // Add an action listener to the scroll button
	        scrollButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                // Get the scroll pane and panel
	                JScrollPane scrollPane = (JScrollPane) frame.getComponent(1);
	                JPanel panel = (JPanel) scrollPane.getViewport().getView();

	                // Get the current scroll position of the panel
	                int currentScrollPosition = scrollPane.getVerticalScrollBar().getValue();

	                // Calculate the new scroll position
	                int newScrollPosition = currentScrollPosition + 50;

	                // Set the new scroll position
	                scrollPane.getVerticalScrollBar().setValue(newScrollPosition);
	            }
	        });

	        // Add the scroll button to the frame
	        frame.add(scrollButton, BorderLayout.NORTH);

	        // Create a new JPanel and add some components to it
	        JPanel panel = new JPanel();
	        panel.setLayout(new GridLayout(0, 1));
	        panel.setBorder(new TitledBorder("Scrollable Panel"));
	        for (int i = 0; i < 20; i++) {
	            panel.add(new JLabel("Label " + i));
	        }

	        // Create a new JScrollPane and add the panel to it
	        JScrollPane scrollPane = new JScrollPane(panel);

	        // Add the scroll pane to the center of the frame
	        frame.add(scrollPane, BorderLayout.CENTER);

	        // Set the size of the frame
	        frame.setSize(600, 400);

	        // Make the frame visible
	        frame.setVisible(true);

	        // Set the default close operation of the frame
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }}
	