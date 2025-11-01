import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test4 {
    static int clickCount = 0;

    public static void main(String[] args) {
        JFrame fr = new JFrame("Run");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(250,100);

        JLabel label = new JLabel();
        JButton button = new JButton("CLICK!");
        fr.setLayout(new FlowLayout());
        fr.add(label);
        fr.add(button);
//        button.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent e){
//
//            }
//        });

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;

                if(clickCount == 1){
                    label.setText("3...");
                } else if (clickCount == 2) {
                    label.setText("2...");
                } else if (clickCount == 3) {
                    label.setText("1...");
                } else if (clickCount == 4) {
                    label.setText("GO!");
                    clickCount = 0;
                }
            }
        });

        fr.setVisible(true);
    }
}
