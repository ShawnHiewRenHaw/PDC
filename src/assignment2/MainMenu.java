package assignment2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/**
 *
 * @author shawn
 */
public class MainMenu {

    JPanel mainMenuPanel;
    JButton newGame;
    JButton credits;
    JButton logOut;
    JButton quitGame;
    final int score;

    public MainMenu(JFrame f) {

//      Score
        score = 0;

//      Panel
        mainMenuPanel = new JPanel(new BorderLayout());
        mainMenuPanel.setLayout(new BoxLayout(mainMenuPanel, BoxLayout.Y_AXIS));
        mainMenuPanel.setBackground(Color.black);
        mainMenuPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

//      New Game
        newGame = new JButton("New Game");
        newGame.setFont(new Font("Serif", Font.BOLD, 20));
        newGame.setBackground(Color.black);
        newGame.setForeground(Color.white);
        newGame.setAlignmentX(Component.CENTER_ALIGNMENT);
        newGame.setAlignmentY(Component.CENTER_ALIGNMENT);
        newGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainMenuPanel.setVisible(false);
                StoryPart1 runStory = new StoryPart1(f);
            }
        });

//      Credits
        credits = new JButton("Credits");
        credits.setFont(new Font("Serif", Font.BOLD, 20));
        credits.setBackground(Color.black);
        credits.setForeground(Color.white);
        credits.setAlignmentX(Component.CENTER_ALIGNMENT);
        credits.setAlignmentY(Component.CENTER_ALIGNMENT);
        credits.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    mainMenuPanel.setVisible(false);
                    Credits runCredits = new Credits(f);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

//      Log Out
        logOut = new JButton("Log Out");
        logOut.setFont(new Font("Serif", Font.BOLD, 20));
        logOut.setBackground(Color.black);
        logOut.setForeground(Color.white);
        logOut.setAlignmentX(Component.CENTER_ALIGNMENT);
        logOut.setAlignmentY(Component.CENTER_ALIGNMENT);
        logOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainMenuPanel.setVisible(false);
                Title returnTitle = new Title(f);
            }
        });

//      Quit Game
        quitGame = new JButton("Quit");
        quitGame.setFont(new Font("Serif", Font.BOLD, 20));
        quitGame.setBackground(Color.black);
        quitGame.setForeground(Color.white);
        quitGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        quitGame.setAlignmentX(Component.CENTER_ALIGNMENT);
        quitGame.setAlignmentY(Component.CENTER_ALIGNMENT);

        mainMenuPanel.add(newGame);
        mainMenuPanel.add(credits);
        mainMenuPanel.add(logOut);
        mainMenuPanel.add(quitGame);
        mainMenuPanel.setVisible(true);
        f.add(mainMenuPanel);
    }
}
