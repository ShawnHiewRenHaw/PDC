/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package assignment2;

import java.io.IOException;
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
public class MainMenuTest {

    @Test

    public void buttonsWork() throws InterruptedException, IOException {
        GUI gui = new GUI();
        MainMenu mainMenu = new MainMenu(gui.f);

//      Tests New Game Button
        if (mainMenu.newGame.getModel().isPressed()) {
            StoryPart1 sp1 = new StoryPart1(gui.f);
            assertTrue(sp1.part1Panel.isVisible() == true);
        }

//     Tests Credits Button
        if (mainMenu.credits.getModel().isPressed()) {
            Credits credit = new Credits(gui.f);
            assertTrue(credit.creditsPanel.isVisible() == true);
        }

//     Tests Log out button
        if (mainMenu.logOut.getModel().isPressed()) {
            Title title = new Title(gui.f);
            assertTrue(title.titleScreenPanel.isVisible() == true);
        }
    }
}
