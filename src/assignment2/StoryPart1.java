/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shawn
 */
public class StoryPart1 {

    JPanel part1Panel;
    JLabel part1Label;
    JLabel optionsLabel;
    JButton option1Button;
    JButton option2Button;
    JButton option3Button;
    JPanel quitPanel;
    JButton quitButton;
    JPanel option2ResultPanel;
    JLabel option2ResultLabel;
    JButton option2ResultBackButton;
    JPanel option3ResultPanel;
    JLabel option3ResultLabel;
    JButton option3ResultBackButton;

    public StoryPart1(JFrame f, int score) {

        int newScore = score;

//      Part 1 Panel
        part1Panel = new JPanel();
        part1Panel.setBackground(Color.black);

//      Part 1 Label
        part1Label = new JLabel("<html>" + "<p>" + "You\'re walking in the woods and there is no one around you. Your phone is dead." + "</p>" + "<p>" + "Out of the corner of your eye, you spot him. He\'s following you, about 30 feet back." + "</p>" + "<p>" + " He gets down on all fours and breaks into a sprint. He\'s gaining on you." + "</p>" + "<p>" + "You\'re looking for you car, but you\'re all turned around." + "</p>" + "<p>" + "He\'s almost upon you now, and you can see there\'s blood on his face." + "</p>" + "<p>" + "My god, there\'s blood everywhere! What do you do?" + "</p>" + "</html>");
        part1Label.setFont(new Font("Serif", Font.BOLD, 20));
        part1Label.setBackground(Color.black);
        part1Label.setForeground(Color.white);

//      Options
        optionsLabel = new JLabel("<html>" + "<p>" + "Option 1: You run for your Life." + "</p>" + "<p>" + "Option 2: You confront him diplomatically." + "</p>" + "<p>" + "Option 3: You pick up a stick and strike at him." + "</p>" + "</html>");
        optionsLabel.setFont(new Font("Serif", Font.BOLD, 20));
        optionsLabel.setBackground(Color.black);
        optionsLabel.setForeground(Color.white);

//      Option 1
        option1Button = new JButton("Option 1");
        option1Button.setBackground(Color.black);
        option1Button.setForeground(Color.white);
        option1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                part1Panel.setVisible(false);
                quitPanel.setVisible(false);
                StoryPart2 runPart2 = new StoryPart2(f, newScore);
            }
        });

//      Option 2
        option2Button = new JButton("Option 2");
        option2Button.setBackground(Color.black);
        option2Button.setForeground(Color.white);
        option2ResultPanel = new JPanel();
        option2ResultPanel.setBackground(Color.black);
        option2ResultLabel = new JLabel("<html>" + "<p>" + "You raise both your hands up to show diplomacy and goodwill." + "</p>" + "<p>" + " He doesn\'t even slow his pace and lunges at you, ripping your face off." + "</p>" + "<p>" + " You did not survive the night." + "</p>" + "</html>");
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
                    part1Panel.setVisible(true);
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
                    part1Panel.setVisible(false);
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
        option3ResultLabel = new JLabel("<html>" + "<p>" + "You grab a stick from the ground and swing it at him." + "</p>" + "<p>" + " He dodges it easily and lunges at you with his teeth bared." + "</p>" + "<p>" + " He rips of the flesh off your neck." + "</p>" + "<p>" + " You did not survive the night." + "</p>" + "</html>");
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
                    part1Panel.setVisible(true);
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
                    part1Panel.setVisible(false);
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
                part1Panel.setVisible(false);
                MainMenu runMainMenu = new MainMenu(f);
            }
        });

        part1Panel.add(part1Label);
        part1Panel.add(optionsLabel);
        part1Panel.add(option1Button);
        part1Panel.add(option2Button);
        part1Panel.add(option3Button);
        quitPanel.add(quitButton);
        f.add(part1Panel);
        f.add(quitPanel, BorderLayout.SOUTH);
    }
}
