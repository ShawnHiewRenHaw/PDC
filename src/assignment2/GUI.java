/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author shawn
 */
public class GUI {

    JFrame f;

    public GUI() {
//      Frame
        f = new JFrame();
        f.setSize(1000 , 800);
        f.setLocation(600, 150);
        f.getContentPane().setBackground(Color.BLACK);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);

        Title guiTitle = new Title(f);
    }
}
