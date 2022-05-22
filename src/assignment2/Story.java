/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author shawn
 */
public class Story {

    JPanel part1Panel;
    JLabel part1Label;
    JLabel option1Label;
    JButton option1Button;

    public Story(JFrame f) {

//      Panel Part1
        part1Panel = new JPanel();
        part1Panel.setBackground(Color.black);

//      Story Part1
        part1Label = new JLabel("<html>" + "<p>" + "You\'re walking in the woods and there is no one around you. Your phone is dead." + "</p>" + "<p>" + "Out of the corner of your eye, you spot him. He\'s following you, about 30 feet back." + "</p>" + "<p>" + " He gets down on all fours and breaks into a sprint. He\'s gaining on you." + "</p>" + "<p>" + "You\'re looking for you car, but you\'re all turned around." + "</p>" + "<p>" + "He\'s almost upon you now, and you can see there\'s blood on his face." + "</p>" + "<p>" + "My god, there\'s blood everywhere! What do you do?" + "</p>" + "</html>");
        part1Label.setFont(new Font("Serif", Font.BOLD, 20));
        part1Label.setBackground(Color.black);
        part1Label.setForeground(Color.white);

//      Option 1
        option1Label = new JLabel();
        option1Button = new JButton();

        part1Panel.add(part1Label);
        f.add(part1Panel);
    }
}
