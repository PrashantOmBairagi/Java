package CoreJava.LambdaExpression;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambdaInWindow {
    //This is called Java Swing

    static void main() {
        // Create frame
        JFrame frame = new JFrame("Lambda Implentation By PRASHANT");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setVisible(true);

        //Buttons
        JButton button = new JButton("Click Me");
        JButton button2 = new JButton("Don't Click Me");
        frame.add(button);
        frame.add(button2);

        button.addActionListener(new ActionListener() {
        // Used Anonymous function to implement actionListner
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button1 clicked");
                JOptionPane.showMessageDialog(frame, "Button1 clicked");
            }
        });
        button2.addActionListener((ActionEvent e) -> {
        // Used Lambda Expression to implement actionListner
            System.out.println("Button2 clicked");
            frame.dispose();
        });

    }
}
