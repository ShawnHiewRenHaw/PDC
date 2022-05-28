/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author shawn
 */
public class StoryFinish {

    JPanel finishPanel;
    JLabel finishLabel;
    JButton finishButton;
    JLabel scoreLabel;

    public StoryFinish(JFrame f, int score) {

//      Finish Panel
        finishPanel = new JPanel();
        finishPanel.setBackground(Color.black);

//      Finish Label
        finishLabel = new JLabel("<html>" + "<p>" + "His Head topples to the floor, expressionless. You fall to your knees and catch your breath." + "</p>" + "<p>" + "You\'re finally safe... from Shia LaBeouf." + "</p>" + "<p>" + "You have survived the night." + "</p>" + "</html>");
        finishLabel.setFont(new Font("Serif", Font.BOLD, 20));
        finishLabel.setBackground(Color.black);
        finishLabel.setForeground(Color.white);

//      Score Label
        scoreLabel = new JLabel("Your score is " + score);
        scoreLabel.setFont(new Font("Serif", Font.BOLD, 20));
        scoreLabel.setBackground(Color.black);
        scoreLabel.setForeground(Color.white);

//      Finish Button
        finishButton = new JButton("Finish");
        finishButton.setBackground(Color.black);
        finishButton.setForeground(Color.white);
        finishButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    finishPanel.setVisible(false);
                    MainMenu runMainMenu = new MainMenu(f);
                } catch (HeadlessException e) {
                    System.out.println(e);
                }

            }
        });

        finishPanel.add(finishLabel);
        finishPanel.add(finishButton);
        f.add(finishPanel);
    }
}
