/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package assignment2;

import java.sql.SQLException;
import java.sql.Statement;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shawn
 */
public class SignUpTest {

    @Test
    public void signUpWorks() throws SQLException {
        GUI gui = new GUI();
        SignUp signUp = new SignUp(gui.f);
        if (signUp.signUpButton.getModel().isPressed()) {
            signUp.db = new DBManager();
            Statement statement = signUp.db.conn.createStatement();
            String dbq = "INSERT INTO Player_EDB values('" + signUp.name.getText() + "' , '" + signUp.password.getText() + "')";
            int x = statement.executeUpdate(dbq);
        }
    }
}
