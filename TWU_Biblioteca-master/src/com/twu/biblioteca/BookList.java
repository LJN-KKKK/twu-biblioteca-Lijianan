package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BookList {

    private ArrayList<Book> bookList = new ArrayList<>();

    public BookList(){
        bookList.add(new Book("Book A", "AAA", "2022"));
        bookList.add(new Book("Book B", "BBB", "2036"));
        bookList.add(new Book("Book C", "CCC", "2033"));
    }

    public String showListOfBooks() {
        StringBuffer bookListAsText = new StringBuffer();

        for(Book b : bookList) {
            bookListAsText.append(b.getTitle() + "\n");
        }

        return bookListAsText.toString().trim();
    }
}
