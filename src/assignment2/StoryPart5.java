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
public class StoryPart5 {

    JPanel part5Panel;
    JLabel part5Label;
    JLabel optionsLabel;
    JButton option1Button;
    JButton option2Button;
    JButton option3Button;
    JPanel option1ResultPanel;
    JLabel option1ResultLabel;
    JButton option1ResultBackButton;
    JPanel option2ResultPanel;
    JLabel option2ResultLabel;
    JButton option2ResultBackButton;
    JPanel quitPanel;
    JButton quitButton;

    public StoryPart5(JFrame f) {

//      Part 5 Panel
        part5Panel = new JPanel();
        part5Panel.setBackground(Color.black);

//      Part 5 Label
        part5Label = new JLabel("<html>" + "<p>" + "You wrestle the knife from him and stab it in his kidney." + "</p>" + "<p>" + "He falls onto the floor. twitching. You stand up and leave the cabin, safe at last." + "</p>" + "<p>" + "You limp into the dark woods, blood oozing from your stump leg. You\'ve beaten him." + "</p>" + "<p>" + "Wait! He isn\'t dead! Suprise! There\'s a gun to your head, and death in his eyes." + "</p>" + "<p>" + "What do you do?" + "</p>" + "</html>");
        part5Label.setFont(new Font("Serif", Font.BOLD, 20));
        part5Label.setBackground(Color.black);
        part5Label.setForeground(Color.white);

//      Options
        optionsLabel = new JLabel("<html>" + "<p>" + "Option 1: You dodge the bullets." + "</p>" + "<p>" + "Option 2: You beg for your life." + "</p>" + "<p>" + "Option 3: You know jiu jitsu and you body slam him." + "</p>" + "</html>");
        optionsLabel.setFont(new Font("Serif", Font.BOLD, 20));
        optionsLabel.setBackground(Color.black);
        optionsLabel.setForeground(Color.white);

//      Option 1
        option1Button = new JButton("Option 1");
        option1Button.setBackground(Color.black);
        option1Button.setForeground(Color.white);
        option1ResultPanel = new JPanel();
        option1ResultPanel.setBackground(Color.black);
        option1ResultLabel = new JLabel("<html>" + "<p>" + "You attempt to dodge the bullets like Neo from the movie you\'ve seen \'The Matrix\'." + "</p>" + "<p>" + "You get hit by every single bullet." + "</p>" + "<p>" + "You did not survive the night." + "</p>" + "</html>");
        option1ResultLabel.setFont(new Font("Serif", Font.BOLD, 20));
        option1ResultLabel.setBackground(Color.black);
        option1ResultLabel.setForeground(Color.white);
        option1ResultBackButton = new JButton("Back");
        option1ResultBackButton.setBackground(Color.black);
        option1ResultBackButton.setForeground(Color.white);
        option1ResultBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    option1ResultPanel.setVisible(false);
                    part5Panel.setVisible(true);
                } catch (HeadlessException e) {
                    System.out.println(e);
                }

            }
        });
        option1ResultPanel.add(option1ResultLabel);
        option1ResultPanel.add(option1ResultBackButton);
        option1ResultPanel.setVisible(false);
        option1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    f.add(option1ResultPanel);
                    part5Panel.setVisible(false);
                    option1ResultPanel.setVisible(true);
                } catch (HeadlessException e) {
                    System.out.println(e);
                }

            }
        });

//      Option 2
        option2Button = new JButton("Option 2");
        option2Button.setBackground(Color.black);
        option2Button.setForeground(Color.white);
        option2ResultPanel = new JPanel();
        option2ResultPanel.setBackground(Color.black);
        option2ResultLabel = new JLabel("<html>" + "<p>" + "You get down on your knees, pleading for your pathetic life" + "</p>" + "He ignores you and fires a bullet into your skull." + "</p>" + "<p>" + "You did not survive the night." + "</p>" + "</html>");
        option2ResultLabel.setFont(new Font("Serif", Font.BOLD, 20));
        option2ResultLabel.setBackground(Color.black);
        option2ResultLabel.setForeground(Color.white);
        option2ResultBackButton = new JButton("Back");
        option2ResultBackButton.setBackground(Color.black);
        option2ResultBackButton.setForeground(Color.white);
        option2ResultBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    option2ResultPanel.setVisible(false);
                    part5Panel.setVisible(true);
                } catch (HeadlessException e) {
                    System.out.println(e);
                }

            }
        });
        option2ResultPanel.add(option2ResultLabel);
        option2ResultPanel.add(option2ResultBackButton);
        option2ResultPanel.setVisible(false);
        option2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    f.add(option2ResultPanel);
                    part5Panel.setVisible(false);
                    option2ResultPanel.setVisible(true);
                } catch (HeadlessException e) {
                    System.out.println(e);
                }

            }
        });

//      Option 3
        option3Button = new JButton("Option 2");
        option3Button.setBackground(Color.black);
        option3Button.setForeground(Color.white);
        option3Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                part5Panel.setVisible(false);
                StoryPart6 runStoryPart6 = new StoryPart6(f);
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
                part5Panel.setVisible(false);
                MainMenu runMainMenu = new MainMenu(f);
            }
        });

        part5Panel.add(part5Label);
        part5Panel.add(optionsLabel);
        part5Panel.add(option1Button);
        part5Panel.add(option2Button);
        part5Panel.add(option3Button);
        f.add(part5Panel);
    }
}
