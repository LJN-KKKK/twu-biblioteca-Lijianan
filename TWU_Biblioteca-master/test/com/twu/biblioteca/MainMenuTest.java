package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainMenuTest {
    ByteArrayOutputStream output;
    @Before
    public void setUp(){
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void showBooksInfoInfoTest() {
        MainMenu mainMenu = new MainMenu();
        mainMenu.showMainMenu();
        assertEquals("1.List of books\r\n"+
                        "2.Checkout books\r\n"+
                        "3.Return books\r\n"+
                        "4.Quit\r\n", output.toString());
    }

    @Test //invalid input test
    public void showInvalidInput() {
        MainMenu mainMenu = new MainMenu();
        mainMenu.showInvalidInput();
        assertEquals("Please select a valid option!\r\n", output.toString());
    }

    @Test //successful checkout test
    public void testSuccessfulCheckOut(){
        MainMenu mainMenu = new MainMenu();
        mainMenu.checkoutBooks(2);
        assertEquals("Thank you! Enjoy the book.\r\n", output.toString());
    }

    @Test //unsuccessful checkout test
    public void testUnsuccessfulCheckOut(){
        MainMenu mainMenu = new MainMenu();
        mainMenu.checkoutBooks(4);
        assertEquals("Sorry,that book is not available!\r\n", output.toString());
    }

    @Test //successful return test
    public void testSuccessfulReturn(){
        MainMenu mainMenu = new MainMenu();
        mainMenu.returnBooks(3);
        assertEquals("Thank you for returning the book.\r\n", output.toString());
    }

    @Test //unsuccessful return  test
    public void testUnsuccessfulReturn(){
        MainMenu mainMenu = new MainMenu();
        mainMenu.returnBooks(4);
        assertEquals("That is not a valid book to return.\r\n", output.toString());
    }

    @Test //quit test
    public void testQuitApp(){
        MainMenu mainMenu = new MainMenu();
        mainMenu.quitApp();
        assertEquals("Goodbye!\r\n", output.toString());
    }
}
