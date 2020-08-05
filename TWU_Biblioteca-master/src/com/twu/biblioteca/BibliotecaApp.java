package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    private ArrayList<Book> books;

    public static void main(String[] args) {
        System.out.println(showWelcomeMessage());
        BookList bList = new BookList();
        System.out.println(bList.showListOfBooks());
    }

    public static String showWelcomeMessage() {
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }



}
