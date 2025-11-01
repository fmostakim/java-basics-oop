import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test7 {
    public static void main(String[] args) {
        JFrame fr = new JFrame("Mostakim");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300,300);
        fr.setLayout(new FlowLayout());

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");

        fr.add(button1);
        fr.add(button2);
        fr.add(button3);
        fr.add(button4);

        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                button2.setText("4");
                button4.setText("2");
            }
        });

        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                button2.setText("2");
                button4.setText("4");
            }
        });



        fr.setVisible(true);


    }
}
