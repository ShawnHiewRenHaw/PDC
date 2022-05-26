/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author shawn
 */
public class Credits {

    JPanel creditsPanel;
    JLabel creditsLabel;
    JPanel returnPanel;
    JButton returnButton;

    public Credits(JFrame f) throws InterruptedException, IOException {

//      Credits Panel
        creditsPanel = new JPanel();
        creditsPanel.setBackground(Color.black);
        creditsPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

//      Credits Label
        creditsLabel = new JLabel("Thank you for playing!");
        creditsLabel.setFont(new Font("Serif", Font.BOLD, 20));
        creditsLabel.setBackground(Color.black);
        creditsLabel.setForeground(Color.white);

//      Return Panel
        returnPanel = new JPanel();
        returnPanel.setBackground(Color.black);

//      Return Button
        returnButton = new JButton("Return");
        returnButton.setBackground(Color.black);
        returnButton.setForeground(Color.white);
        returnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    Thread.sleep(5000);
                    String url_open = "https://www.youtube.com/watch?v=o0u4M6vppCI";
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
                    returnPanel.setVisible(false);
                    creditsPanel.setVisible(false);
                    MainMenu runMainMenu = new MainMenu(f);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Credits.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Credits.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

        creditsPanel.add(creditsLabel);
        returnPanel.add(returnButton);
        f.add(creditsPanel, BorderLayout.CENTER);
        f.add(returnPanel, BorderLayout.SOUTH);

    }
}
