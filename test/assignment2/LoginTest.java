/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package assignment2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
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
public class LoginTest {

    @Test
    public void loginShouldBeTrue() throws SQLException {
        JFrame f = new JFrame();
        Login login = new Login(f);
        login.db = new DBManager();
        Statement statement = login.db.conn.createStatement();
        String dbq = "Select * from Player_EDB where PlayerName = 'Shawn' AND Password = 'Shawn123'";
        ResultSet rs = statement.executeQuery(dbq);
        assertTrue(rs.next() == true);
    }

}
