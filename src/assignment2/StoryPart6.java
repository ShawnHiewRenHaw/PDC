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
public class StoryPart6 {

    JPanel part6Panel;
    JLabel part6Label;
    JButton continueButton;
    JPanel quitPanel;
    JButton quitButton;

    public StoryPart6(JFrame f, int score) {

//      Part 6 Panel
        part6Panel = new JPanel();
        part6Panel.setBackground(Color.black);

//      Part 6 Label
        part6Label = new JLabel("<html>" + "<p>" + "You can do jiu jitsu and you body slam him into the ground" + "</p>" + "<p>" + "sending the gun flying off into the night." + "</p>" + "You try to swing your axe at him but blood is draining fast from your stump leg." + "</p>" + "<p>" + "He\'s dodging every swipe and parries to the left. You counter to the right, you catch him in the neck." + "</p>" + "<p>" + "You\'re chopping off his head now. You have just decapitated him." + "</p>" + "</html>");
        part6Label.setFont(new Font("Serif", Font.BOLD, 20));
        part6Label.setBackground(Color.black);
        part6Label.setForeground(Color.white);

//      Continue Button
        continueButton = new JButton("Coninue");
        continueButton.setBackground(Color.black);
        continueButton.setForeground(Color.white);
        continueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    part6Panel.setVisible(false);
                    quitPanel.setVisible(false);
                    StoryFinish runStoryFinish = new StoryFinish(f, score);
                } catch (HeadlessException e) {
                    System.out.println(e);
                }

            }
        });

//      Quit
        quitPanel = new JPanel();
        quitPanel.setBackground(Color.black);
        quitButton = new JButton("Return to main menu");
        quitButton.setFont(new Font("Serif", Font.BOLD, 20));
        quitButton.setBackground(Color.black);
        quitButton.setForeground(Color.white);
        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quitPanel.setVisible(false);
                part6Panel.setVisible(false);
                MainMenu runMainMenu = new MainMenu(f);
            }
        });

        part6Panel.add(part6Label);
        part6Panel.add(continueButton);
        f.add(part6Panel);
    }
}
