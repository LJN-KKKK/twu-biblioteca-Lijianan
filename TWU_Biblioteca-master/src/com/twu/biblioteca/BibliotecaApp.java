package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    private ArrayList<Book> books;
    private static UserManagement userManagement = new UserManagement();

    public static void main(String[] args) {
        System.out.println(showWelcomeMessage());
        MainMenu mainMenu = new MainMenu();
        mainMenu.showMainMenu();

        Scanner option = new Scanner(System.in);
        boolean flag=true;
        while (flag){
            if(option.hasNext()){
                switch (option.nextInt()){
                    case 1://show BookList
                        mainMenu.showBookList();
                        break;
                    case 2://checkout books
                        System.out.println("Please select the book you want to checkout:");
                        mainMenu.showBookList();
                        option = new Scanner(System.in);
                        mainMenu.checkoutBooks(option.nextInt());
                        mainMenu.showMainMenu();
                        break;
                    case 3://return books
                        System.out.println("Please select the book you want to return:");
                        mainMenu.showBookList();
                        option = new Scanner(System.in);
                        mainMenu.returnBooks(option.nextInt());
                        mainMenu.showMainMenu();
                        break;
                    case 4://show MovieList
                        mainMenu.showMovieList();
                        break;
                    case 5://checkout movies
                        System.out.println("Please select the movie you want to checkout:");
                        mainMenu.showMovieList();
                        option = new Scanner(System.in);
                        mainMenu.checkoutMovies(option.nextInt());
                        mainMenu.showMainMenu();
                        break;
                    case 6://return movies
                        System.out.println("Please select the movie you want to return:");
                        mainMenu.showMovieList();
                        option = new Scanner(System.in);
                        mainMenu.returnMovies(option.nextInt());
                        mainMenu.showMainMenu();
                        break;
                    case 7://log in
                        userManagement.logIn();
                        mainMenu.showMainMenu();
                        break;
                    case 8://log out
                        userManagement.logOut();
                        mainMenu.showMainMenu();
                        break;
                    case 9://user information
                        userManagement.showUserInfo();
                        mainMenu.showMainMenu();
                        break;
                    case 10://quit
                        flag=false;
                        mainMenu.quitApp();
                        break;
                    default://invalid input
                        mainMenu.showInvalidInput();
                        break;
                }
            }
            else
                break;
        }
    }

    public static String showWelcomeMessage() {
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }

}
