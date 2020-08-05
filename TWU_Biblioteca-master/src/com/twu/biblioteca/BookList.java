package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BookList {

    private ArrayList<Book> bookList = new ArrayList<>();

    public BookList(){
        boolean add = bookList.add(new Book("Book A", "AAA", "2022",true));
        bookList.add(new Book("Book B", "BBB", "2036",true));
        bookList.add(new Book("Book C", "CCC", "2033",false));
    }

    public String showListOfBooks() {
        StringBuffer books = new StringBuffer();

        for(Book book : bookList) {
            books.append(book.getTitle() + "\n");
        }

        return books.toString().trim();
    }

    public void showBooksInfo() {
        for(Book book : bookList) {
            System.out.println(book.getTitle() + " | " + book.getAuthor() + " | " + book.getPublishYear());
        }
    }

    public int getSize(){
        return bookList.size();
    }

    public Book getBook(int index){
        return bookList.get(index);
    }
}
