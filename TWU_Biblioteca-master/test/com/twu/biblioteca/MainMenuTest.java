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
                        "4.List of movies\r\n"+
                        "5.Checkout movies\r\n"+
                        "6.Return movies\r\n"+
                        "7.Quit\r\n", output.toString());
    }

    @Test //invalid input test
    public void showInvalidInput() {
        MainMenu mainMenu = new MainMenu();
        mainMenu.showInvalidInput();
        assertEquals("Please select a valid option!\r\n", output.toString());
    }

    @Test //successful book checkout test
    public void testSuccessfulBookCheckOut(){
        MainMenu mainMenu = new MainMenu();
        mainMenu.checkoutBooks(2);
        assertEquals("Thank you! Enjoy the book.\r\n", output.toString());
    }

    @Test //unsuccessful book checkout test
    public void testUnsuccessfulBookCheckOut(){
        MainMenu mainMenu = new MainMenu();
        mainMenu.checkoutBooks(4);
        assertEquals("Sorry,that book is not available!\r\n", output.toString());
    }

    @Test //successful book return test
    public void testSuccessfulBookReturn(){
        MainMenu mainMenu = new MainMenu();
        mainMenu.returnBooks(3);
        assertEquals("Thank you for returning the book.\r\n", output.toString());
    }

    @Test //unsuccessful book return test
    public void testUnsuccessfulBookReturn(){
        MainMenu mainMenu = new MainMenu();
        mainMenu.returnBooks(4);
        assertEquals("That is not a valid book to return.\r\n", output.toString());
    }

    @Test //successful movie checkout test
    public void testSuccessfulMovieCheckOut(){
        MainMenu mainMenu = new MainMenu();
        mainMenu.checkoutMovies(2);
        assertEquals("Thank you! Enjoy the movie.\r\n", output.toString());
    }

    @Test //unsuccessful movie checkout test
    public void testUnsuccessfulMovieCheckOut(){
        MainMenu mainMenu = new MainMenu();
        mainMenu.checkoutMovies(4);
        assertEquals("Sorry,that movie is not available!\r\n", output.toString());
    }

    @Test //successful movie return test
    public void testSuccessfulMovieReturn(){
        MainMenu mainMenu = new MainMenu();
        mainMenu.returnMovies(3);
        assertEquals("Thank you for returning the movie.\r\n", output.toString());
    }

    @Test //unsuccessful movie return test
    public void testUnsuccessfulMovieReturn(){
        MainMenu mainMenu = new MainMenu();
        mainMenu.returnMovies(4);
        assertEquals("That is not a valid movie to return.\r\n", output.toString());
    }

    @Test //quit test
    public void testQuitApp(){
        MainMenu mainMenu = new MainMenu();
        mainMenu.quitApp();
        assertEquals("Goodbye!\r\n", output.toString());
    }
}
