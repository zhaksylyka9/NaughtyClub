import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class MainMenu extends Container {
private JButton teacherButton;
private JButton studentButton;
private JButton exitButton;

    public MainMenu() {
        setSize(600,400);
        setLayout(null);


        teacherButton = new JButton("TEACHER MENU");
        teacherButton.setBackground(new java.awt.Color(148, 148, 153));
        teacherButton.setBounds(130, 80, 300, 30);
        teacherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(false);
                Main.frame.teacherWindow.setVisible(true);
            }
        });

        add(teacherButton);

        studentButton = new JButton("STUDENT MENU");
        studentButton.setBackground(new java.awt.Color(148, 148, 153));
        studentButton.setBounds(130, 120, 300, 30);
        studentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(false);
                Main.frame.studentWindow.setVisible(true);
            }
        });

        add(studentButton);



        exitButton = new JButton("EXIT");
        exitButton.setBackground(new java.awt.Color(231, 105, 105));
        exitButton.setBounds(130, 160, 300, 30);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(exitButton);
    }

}
