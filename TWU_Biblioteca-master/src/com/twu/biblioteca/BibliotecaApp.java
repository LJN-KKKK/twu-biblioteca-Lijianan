package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    private ArrayList<Book> books;

    public static void main(String[] args) {
        System.out.println(showWelcomeMessage());
        MainMenu mainMenu = new MainMenu();
        mainMenu.showMainMenu();
        BookList bookList = new BookList();
        System.out.println(bookList.showListOfBooks());
        bookList.showBooksInfo();
    }

    public static String showWelcomeMessage() {
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }

}
