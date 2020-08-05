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
        assertEquals("1. List of books\r\n", output.toString());
    }
}
