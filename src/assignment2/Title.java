/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author shawn
 */
public class Title {

    final JLabel title;
    JPanel titleScreenPanel;
    JPanel buttonPanel;
    JButton login;
    JButton signUp;

    public Title(JFrame f) {

//     Title Screen
        titleScreenPanel = new JPanel(new BorderLayout());
        titleScreenPanel.setBackground(Color.black);
        titleScreenPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        title = new JLabel("Survive The Night", JLabel.CENTER);
        title.setFont(new Font("Serif", Font.BOLD, 50));
        title.setForeground(Color.red);

//     Button Panel
        buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.BLACK);

//     Login Button
        login = new JButton("Log In");
        login.setFont(new Font("Serif", Font.BOLD, 30));
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Login login = new Login(f);
                titleScreenPanel.setVisible(false);
                buttonPanel.setVisible(false);
            }
        });

//      Sign Up Button
        signUp = new JButton("Sign Up");
        signUp.setFont(new Font("Serif", Font.BOLD, 30));
        signUp.setBackground(Color.black);
        signUp.setForeground(Color.white);
        signUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SignUp signUpStart = new SignUp(f);
                titleScreenPanel.setVisible(false);
                buttonPanel.setVisible(false);
            }
        });

        titleScreenPanel.add(title);
        buttonPanel.add(login);
        buttonPanel.add(signUp);
        f.add(titleScreenPanel, BorderLayout.CENTER);
        f.add(buttonPanel, BorderLayout.SOUTH);
    }
}
