package assignment2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author shawn
 */
public class SignUp {

    JPanel signUpPanel;
    JLabel nameLabel;
    JTextField name;
    JLabel passwordLabel;
    JTextField password;
    JLabel confirmLabel;
    JTextField confirmPassword;
    JButton signUpButton;
    JPanel returnToTitlePanel;
    JButton returnButton;
    DBManager db;

    public SignUp(JFrame f) {

//  Panel
        signUpPanel = new JPanel(new BorderLayout());
        signUpPanel.setLayout(new BoxLayout(signUpPanel, BoxLayout.Y_AXIS));
        signUpPanel.setBackground(Color.black);
        signUpPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

//  Name
        nameLabel = new JLabel("Username:");
        nameLabel.setFont(new Font("Serif", Font.BOLD, 20));
        nameLabel.setBackground(Color.black);
        nameLabel.setForeground(Color.white);
        name = new JTextField(20);
        name.setPreferredSize(new Dimension(100, 30));
        name.setBackground(Color.black);
        name.setForeground(Color.white);

//      Password
        passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Serif", Font.BOLD, 20));
        passwordLabel.setBackground(Color.black);
        passwordLabel.setForeground(Color.white);
        password = new JTextField(20);
        password.setPreferredSize(new Dimension(100, 30));
        password.setBackground(Color.black);
        password.setForeground(Color.white);

//     Confirm Password
        confirmLabel = new JLabel("Confirm Password:");
        confirmLabel.setFont(new Font("Serif", Font.BOLD, 20));
        confirmLabel.setBackground(Color.black);
        confirmLabel.setForeground(Color.white);
        confirmPassword = new JTextField(20);
        confirmPassword.setPreferredSize(new Dimension(100, 30));
        confirmPassword.setBackground(Color.black);
        confirmPassword.setForeground(Color.white);

//      Log In Button
        signUpButton = new JButton("Sign Up");
        signUpButton.setFont(new Font("Serif", Font.BOLD, 20));
        signUpButton.setBackground(Color.black);
        signUpButton.setForeground(Color.white);
        signUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if (!password.getText().equals(confirmPassword.getText())) {
                        JOptionPane.showMessageDialog(null, "Sign Up Failed, passwords do not match!");
                    } else {
                        db = new DBManager();
                        Statement statement = db.conn.createStatement();
                        String dbq = "INSERT INTO PlayerDB values('" + name.getText() + "' , '" + password.getText() + "' , " + 0 + ")";
                        int x = statement.executeUpdate(dbq);
                        if (password.getText().equals(confirmPassword.getText())) {
                            if (x == 0) {
                                JOptionPane.showMessageDialog(null, "Sign Up Failed");
                            } else {
                                JOptionPane.showMessageDialog(null, "Sign Up Complete");
                                MainMenu runMainMenu = new MainMenu(f);
                                signUpPanel.setVisible(false);
                                returnToTitlePanel.setVisible(false);
                            }
                        }
                    }
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Sign Up Failed, Player already exists!");
                    System.out.println(e);
                }

            }
        }
        );

//  Return to Title Panel
        returnToTitlePanel = new JPanel();

        returnToTitlePanel.setBackground(Color.black);

//  Return to Title Button
        returnButton = new JButton("Back");

        returnButton.setFont(
                new Font("Serif", Font.BOLD, 20));
        returnButton.setBackground(Color.black);

        returnButton.setForeground(Color.white);

        returnButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Title runTitle = new Title(f);
                signUpPanel.setVisible(false);
                returnToTitlePanel.setVisible(false);
            }
        });

        signUpPanel.add(nameLabel);
        signUpPanel.add(name);
        signUpPanel.add(passwordLabel);
        signUpPanel.add(password);
        signUpPanel.add(confirmLabel);
        signUpPanel.add(confirmPassword);
        signUpPanel.add(signUpButton);
        returnToTitlePanel.add(returnButton);
        f.add(signUpPanel, BorderLayout.CENTER);
        f.add(returnToTitlePanel, BorderLayout.SOUTH);
    }
}
