package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    @Test
    public void showWelcomeMessageTest() {
        assertEquals("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!", BibliotecaApp.showWelcomeMessage());
    }

    @Test
    public void showListOfBooksTest() {
        BookList bookList = new BookList();
        assertEquals("Book A\n" +
                "Book B\n" +
                "Book C", bookList.showListOfBooks());
    }
}
