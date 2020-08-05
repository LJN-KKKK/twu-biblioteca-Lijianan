package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BookListTest {
    ByteArrayOutputStream output;
    @Before
    public void setUp(){
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }
    @Test
    public void showListOfBooksTest() {
        BookList bookList = new BookList();
        assertEquals("Book A\n" +
                "Book B\n" +
                "Book C", bookList.showListOfBooks());
    }

    @Test
    public void showBooksInfoInfoTest() {
        BookList bookList = new BookList();
        bookList.showBooksInfo();
        assertEquals("Book A | AAA | 2022\r\n" +
                "Book B | BBB | 2036\r\n" +
                "Book C | CCC | 2033\r\n", output.toString());
    }
}
