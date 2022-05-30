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
public class StoryPart3 {

    JPanel part3Panel;
    JLabel part3Label;
    JLabel optionsLabel;
    JButton option1Button;
    JButton option2Button;
    JButton option3Button;
    JPanel option2ResultPanel;
    JLabel option2ResultLabel;
    JButton option2ResultBackButton;
    JPanel option3ResultPanel;
    JLabel option3ResultLabel;
    JButton option3ResultBackButton;
    JPanel quitPanel;
    JButton quitButton;

    public StoryPart3(JFrame f) {

//      Part 3 Panel
        part3Panel = new JPanel();
        part3Panel.setBackground(Color.black);

//      Part 3 Label
        part3Label = new JLabel("<html>" + "<p>" + "You gnaw off your leg through muffled screams. You then limp towards the cottage quietly." + "</p>" + "<p>" + "Now you\'re on the doorstep, sitting inside he\'s sharpening an axe. What do you do?" + "</p>" + "</html>");
        part3Label.setFont(new Font("Serif", Font.BOLD, 20));
        part3Label.setBackground(Color.black);
        part3Label.setForeground(Color.white);

//      Options
        optionsLabel = new JLabel("<html>" + "<p>" + "Option 1: You sneak up behind him and strangle him." + "</p>" + "<p>" + "Option 2: You limp backwards slowly, away from the cottage." + "</p>" + "<p>" + "Option 3: You keep watching." + "</p>" + "</html>");
        optionsLabel.setFont(new Font("Serif", Font.BOLD, 20));
        optionsLabel.setBackground(Color.black);
        optionsLabel.setForeground(Color.white);

//      Option 1
        option1Button = new JButton("Option 1");
        option1Button.setBackground(Color.black);
        option1Button.setForeground(Color.white);
        option1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                part3Panel.setVisible(false);
                quitPanel.setVisible(false);
                StoryPart4 runStoryPart4 = new StoryPart4(f);
            }
        });

//      Option 2
        option2Button = new JButton("Option 2");
        option2Button.setBackground(Color.black);
        option2Button.setForeground(Color.white);
        option2ResultPanel = new JPanel();
        option2ResultPanel.setBackground(Color.black);
        option2ResultLabel = new JLabel("<html>" + "<p>" + "You limp backwards slowly, away from the cottage. Suddenly a pang of pain on your one good leg!" + "</p>" + "<p>" + "Ah! Your leg, it\'s caught in another bear trap!" + "</p>" + "<p>" + "He hears the trap go off and emerges from the cottage brandishing his axe." + "</p>" + "<p>" + "He uses the axe and starts chopping away at you." + "</p>" + "<p>" + "You did not survive the night." + "</p>" + "</html>");
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
                    part3Panel.setVisible(true);
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
                    part3Panel.setVisible(false);
                    option2ResultPanel.setVisible(true);
                } catch (HeadlessException e) {
                    System.out.println(e);
                }

            }
        });

//      Option 3
        option3Button = new JButton("Option 3");
        option3Button.setBackground(Color.black);
        option3Button.setForeground(Color.white);
        option3ResultPanel = new JPanel();
        option3ResultPanel.setBackground(Color.black);
        option3ResultLabel = new JLabel("<html>" + "<p>" + "You decided to wait and observe a little longer." + "</p>" + "<p>" + "Your breathe starts becoming heavier and your anxiety starts building every time he sharpens his axe." + "</p>" + "<p>" + "You start getting dizzy and drowsy. You have lost too much blood." + "</p>" + "<p>" + "You slowly pass out, not knowing that you're never going to wake up again." + "</p>" + "<p>" + "You did not survive the night." + "</p>" + "</html>");
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
                    part3Panel.setVisible(true);
                } catch (HeadlessException e) {
                    System.out.println(e);
                }

            }
        });
        option3ResultPanel.add(option3ResultLabel);
        option3ResultPanel.add(option3ResultBackButton);
        option3ResultPanel.setVisible(false);
        option3Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    f.add(option3ResultPanel);
                    option3ResultPanel.setVisible(true);
                    part3Panel.setVisible(false);
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
                part3Panel.setVisible(false);
                MainMenu runMainMenu = new MainMenu(f);
            }
        });

        part3Panel.add(part3Label);
        part3Panel.add(optionsLabel);
        part3Panel.add(option1Button);
        part3Panel.add(option2Button);
        part3Panel.add(option3Button);
        f.add(part3Panel);
    }
}
