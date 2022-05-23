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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author shawn
 */
public class StoryPart2 {

    JPanel part2Panel;
    JLabel part2Label;
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

    public StoryPart2(JFrame f) {

//      Part 2 Panel
        part2Panel = new JPanel();
        part2Panel.setBackground(Color.black);

//      Part 2 Label
        part2Label = new JLabel("<html>" + "<p>" + "You\'re running for your life and you see that he\'s brandishing a knife while lurking in the shadows. " + "</p>" + "<p>" + "You can tell that he knows this area well and knows what he\'s doing, like he\'s living in the woods and kills for sport." + "</p>" + "<p>" + "As you\'re running away for your life, you see half-eaten bodies litered all around you. He\'s a cannibal!" + "</p>" + "<p>" + "Now it\'s dark, and you seem to have lost him but you\'re hopelessly lost yourself, stranded with a murderer." + "</p>" + "<p>" + "You creep silently through the underbrush. Aha! In the distance, a small cottage with a light on! Hope!" + "</p>" + "<p>" + "You move stealthily toward it, but your leg! Ah! it\'s caught in a bear trap!" + "</p>" + "<p>" + "What do you do?" + "</p>" + "</html>");
        part2Label.setFont(new Font("Serif", Font.BOLD, 20));
        part2Label.setBackground(Color.black);
        part2Label.setForeground(Color.white);

//      Options
        optionsLabel = new JLabel("<html>" + "<p>" + "Option 1: You shout out in pain and call for help." + "</p>" + "<p>" + "Option 2: You gnaw your leg off." + "</p>" + "<p>" + "Option 3: You know how to dismantle the trap but it would take some time." + "</p>" + "</html>");
        optionsLabel.setFont(new Font("Serif", Font.BOLD, 20));
        optionsLabel.setBackground(Color.black);
        optionsLabel.setForeground(Color.white);

//      Option 1
        option1Button = new JButton("Option 1");
        option1Button.setBackground(Color.black);
        option1Button.setForeground(Color.white);
        option1ResultPanel = new JPanel();
        option1ResultPanel.setBackground(Color.black);
        option1ResultLabel = new JLabel("<html>" + "<p>" + "You scream at the top of your lungs for help. You have just given yourself away and he slowly walks towards you." + "</p>" + "<p>" + "Your screams turn to muffled whimpers, and soon there was naught a sound left from your dead mouth." + "</p>" + "<p>" + "You did not survive the night." + "</p>" + "</html>");
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
                    part2Panel.setVisible(true);
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
                    part2Panel.setVisible(false);
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
                part2Panel.setVisible(false);
                quitPanel.setVisible(false);
                StoryPart3 runStoryPart3 = new StoryPart3(f);
            }
        });

//      Option 3
        option3Button = new JButton("Option 3");
        option3Button.setBackground(Color.black);
        option3Button.setForeground(Color.white);
        option3ResultPanel = new JPanel();
        option3ResultPanel.setBackground(Color.black);
        option3ResultLabel = new JLabel("<html>" + "<p>" + "You begin dismantling the trap." + "</p>" + "<p>" + "Sweat pours down your face as you spent what felt like an eternity getting yourself free." + "</p>" + "<p>" + "You finally manage to free your leg from the bear trap, but as you look up there he is right infront of you." + "</p>" + "<p>" + " He strangles the life out of you." + "</p>" + "<p>" + "You did not survive the night." + "</p>" + "</html>");
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
                    part2Panel.setVisible(true);
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
                f.add(option3ResultPanel);
                part2Panel.setVisible(false);
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
                part2Panel.setVisible(false);
                MainMenu runMainMenu = new MainMenu(f);
            }
        });

        part2Panel.add(part2Label);
        part2Panel.add(optionsLabel);
        part2Panel.add(option1Button);
        part2Panel.add(option2Button);
        part2Panel.add(option3Button);
        f.add(part2Panel);
        f.add(quitPanel, BorderLayout.SOUTH);
    }
}
