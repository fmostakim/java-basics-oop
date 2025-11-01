import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI {
    public static void main(String[] args) {
        // Create the main frame [cite: 204]
        JFrame frame = new JFrame("My App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // [cite: 207]
        frame.setSize(300, 300); // [cite: 208]

        // Use a 2x2 GridLayout for the buttons
        frame.setLayout(new GridLayout(2, 2));

        // Create four buttons
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");

        // Add buttons to the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.setVisible(true);
    }
}