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
public class StoryPart4 {

    JPanel part4Panel;
    JLabel part4Label;
    JLabel optionsLabel;
    JButton option1Button;
    JButton option2Button;
    JButton option3Button;
    JPanel option1ResultPanel;
    JLabel option1ResultLabel;
    JButton option1ResultBackButton;
    JPanel option3ResultPanel;
    JLabel option3ResultLabel;
    JButton option3ResultBackButton;
    JPanel quitPanel;
    JButton quitButton;

    public StoryPart4(JFrame f) {

//      Part 4 Panel
        part4Panel = new JPanel();
        part4Panel.setBackground(Color.black);

//      Part 4Label
        part4Label = new JLabel("<html>" + "<p>" + "You sneak up behind him stealthily and put your arms around his neck and strangle him." + "</p>" + "<p>" + "You are fighting for you life as he is putting up more of a fight than you though he would." + "</p>" + "<p>" + "You see him reaching for a knife from the floor." + "</p>" + "<p>" + "What do you do?\n" + "</p>" + "</html>");
        part4Label.setFont(new Font("Serif", Font.BOLD, 20));
        part4Label.setBackground(Color.black);
        part4Label.setForeground(Color.white);

//      Options
        optionsLabel = new JLabel("<html>" + "<p>" + "Option 1: You continue strangling him." + "</p>" + "<p>" + "Option 2: You wrestle the knife from him." + "</p>" + "<p>" + "Option 3: You succumb to your blood loss." + "</p>" + "</html>");
        optionsLabel.setFont(new Font("Serif", Font.BOLD, 20));
        optionsLabel.setBackground(Color.black);
        optionsLabel.setForeground(Color.white);

//      Option 1
        option1Button = new JButton("Option 1");
        option1Button.setBackground(Color.black);
        option1Button.setForeground(Color.white);
        option1ResultPanel = new JPanel();
        option1ResultPanel.setBackground(Color.black);
        option1ResultLabel = new JLabel("<html>" + "<p>" + "You put even more force into your arms around his neck." + "</p>" + "<p>" + "He slowly stops moving as you feel the life squeezing out of him." + "</p>" + "<p>" + "You let go and lie, relief washing over you." + "</p>" + "<p>" + "You suddenly feel a wet and warm feeling around your neck. " + "</p>" + "<p>" + "As you face to your right you see him holding a bloodied knife. You realise that he has slit your throat." + "</p>" + "<p>" + "You did not survive the night." + "</p>" + "</html>");
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
                    part4Panel.setVisible(true);
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
                    part4Panel.setVisible(false);
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
        option2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                part4Panel.setVisible(false);
                quitPanel.setVisible(false);
                StoryPart5 runStoryPart5 = new StoryPart5(f);
            }
        });

//      Option 3
        option3Button = new JButton("Option 3");
        option3Button.setBackground(Color.black);
        option3Button.setForeground(Color.white);
        option3ResultPanel = new JPanel();
        option3ResultPanel.setBackground(Color.black);
        option3ResultLabel = new JLabel("<html>" + "<p>" + "You start feeling dizzy and lose all strength. He takes this oppurtunity and breaks free from your choke hold." + "</p>" + "<p>" + "He towers above you as he took his knife and stabs is into you, over and over and over again." + "</p>" + "<p>" + "You did not survive the night." + "</p>" + "</html>");
        option3ResultLabel.setFont(new Font("Serif", Font.BOLD, 20));
        option3ResultLabel.setBackground(Color.black);
        option3ResultLabel.setForeground(Color.white);
        option3ResultBackButton = new JButton("Back");
        option3ResultBackButton.setBackground(Color.black);
        option3ResultBackButton.setForeground(Color.white);
        option3ResultBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    option3ResultPanel.setVisible(false);
                    part4Panel.setVisible(true);
                } catch (HeadlessException e) {
                    System.out.println(e);
                }

            }
        });
        option3ResultPanel.add(option3ResultLabel);
        option3ResultPanel.add(option3ResultBackButton);
        option3ResultPanel.setVisible(false);
        option3Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                part4Panel.setVisible(false);
                f.add(option3ResultPanel);
                option3ResultPanel.setVisible(true);
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
                part4Panel.setVisible(false);
                MainMenu runMainMenu = new MainMenu(f);
            }
        });

        part4Panel.add(part4Label);
        part4Panel.add(optionsLabel);
        part4Panel.add(option1Button);
        part4Panel.add(option2Button);
        part4Panel.add(option3Button);
        f.add(part4Panel);
    }
}
