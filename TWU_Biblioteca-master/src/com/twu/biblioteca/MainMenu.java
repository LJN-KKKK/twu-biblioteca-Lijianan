package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {

    private ArrayList<String> optionsList;
    private BookList bookList=new BookList();
    private MovieList movieList=new MovieList();

    public MainMenu() {
        optionsList = new ArrayList<>();
        optionsList.add("List of books");
        optionsList.add("Checkout books");
        optionsList.add("Return books");
        optionsList.add("List of movies");
        optionsList.add("Checkout movies");
        optionsList.add("Return movies");
        optionsList.add("Log in");
        optionsList.add("Log out");
        optionsList.add("User Information");
        optionsList.add("Quit");
    }

    public void showMainMenu() {
        for(int i = 0; i < optionsList.size(); i++) {
            System.out.println((i+1) + "." + optionsList.get(i));
        }
    }

    public void showBookList(){
        bookList.showBooksInfo();
    }

    public void showMovieList(){
        movieList.showMoviesInfo();
    }

    public void showInvalidInput(){
        System.out.println("Please select a valid option!");
    }

    public void quitApp(){
        System.out.println("Goodbye!");
    }

    public void checkoutBooks(int index){
        if(index>0 && index<=bookList.getSize() && bookList.getBook(index-1).isCheckOut()==true){
            Book book = bookList.getBook(index-1);
            System.out.println("Thank you! Enjoy the book.");
            book.setCheckout(false);
        }
        else {
            System.out.println("Sorry,that book is not available!");
        }
    }

    public void returnBooks(int index){
        if(index>0 && index<=bookList.getSize() && bookList.getBook(index-1).isCheckOut()==false){
            Book book = bookList.getBook(index-1);
            System.out.println("Thank you for returning the book.");
            book.setCheckout(true);
        }
        else{
            System.out.println("That is not a valid book to return.");
        }
    }

    public void checkoutMovies(int index){
        if(index>0 && index<=movieList.getSize() && movieList.getMovie(index-1).isCheckOut()==true){
            Movie movie = movieList.getMovie(index-1);
            System.out.println("Thank you! Enjoy the movie.");
            movie.setCheckout(false);
        }
        else {
            System.out.println("Sorry,that movie is not available!");
        }
    }

    public void returnMovies(int index){
        if(index>0 && index<=movieList.getSize() && movieList.getMovie(index-1).isCheckOut()==false){
            Movie movie = movieList.getMovie(index-1);
            System.out.println("Thank you for returning the movie.");
            movie.setCheckout(true);
        }
        else{
            System.out.println("That is not a valid movie to return.");
        }
    }
}
