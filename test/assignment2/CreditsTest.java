/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package assignment2;

import java.io.IOException;
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
public class CreditsTest {

    @Test
    public void urlShouldOpen() throws IOException {
        String url_open = "https://www.youtube.com/watch?v=o0u4M6vppCI";
        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
    }
}
