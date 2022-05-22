package assignment2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author shawn
 */
public class Login {

    JPanel loginPanel;
    JLabel loginLabel;
    JTextField login;
    JLabel passwordLabel;
    JTextField password;
    JButton loginButton;
    JPanel returnToTitlePanel;
    JButton returnButton;
    DBManager db;

    public Login(JFrame f) {

//      Panel
        loginPanel = new JPanel();
        loginPanel.setBackground(Color.black);

//      Login
        loginLabel = new JLabel("Login:");
        loginLabel.setFont(new Font("Serif", Font.BOLD, 20));
        loginLabel.setBackground(Color.black);
        loginLabel.setForeground(Color.white);
        login = new JTextField(10);
        login.setPreferredSize(new Dimension(100, 30));
        login.setBackground(Color.black);
        login.setForeground(Color.white);

//      Password
        passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Serif", Font.BOLD, 20));
        passwordLabel.setBackground(Color.black);
        passwordLabel.setForeground(Color.white);
        password = new JTextField(10);
        password.setPreferredSize(new Dimension(100, 30));
        password.setBackground(Color.black);
        password.setForeground(Color.white);

//      Log In Button
        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Serif", Font.BOLD, 20));
        loginButton.setBackground(Color.black);
        loginButton.setForeground(Color.white);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    db = new DBManager();
                    Statement statement = db.conn.createStatement();
                    String dbq = "Select * from PlayerDB where PlayerName = '" + login.getText() + "' AND Password = '" + password.getText() + "'";
                    ResultSet rs = statement.executeQuery(dbq);
                    if (rs.next()) {
                        MainMenu runMainMenu = new MainMenu(f);
                        loginPanel.setVisible(false);
                        returnToTitlePanel.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Login Failed");
                    }
                } catch (HeadlessException | SQLException e) {
                    System.out.println(e);
                }

            }
        });

//      Return to Title Panel
        returnToTitlePanel = new JPanel();
        returnToTitlePanel.setBackground(Color.black);

//      Return Button
        returnButton = new JButton("Back");
        returnButton.setFont(new Font("Serif", Font.BOLD, 20));
        returnButton.setBackground(Color.black);
        returnButton.setForeground(Color.white);
        returnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Title runTitle = new Title(f);
                loginPanel.setVisible(false);
                returnToTitlePanel.setVisible(false);
            }
        });

        loginPanel.add(loginLabel);
        loginPanel.add(login);
        loginPanel.add(passwordLabel);
        loginPanel.add(password);
        loginPanel.add(loginButton);
        returnToTitlePanel.add(returnButton);
        f.add(loginPanel, BorderLayout.CENTER);
        f.add(returnToTitlePanel, BorderLayout.SOUTH);
    }
}
