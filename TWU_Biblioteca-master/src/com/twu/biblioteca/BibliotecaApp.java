package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    private ArrayList<Book> books;

    public static void main(String[] args) {
        System.out.println(showWelcomeMessage());
        MainMenu mainMenu = new MainMenu();
        mainMenu.showMainMenu();

        Scanner in = new Scanner(System.in);
        boolean flag=true;
        while (flag){
            if(in.hasNext()){
                switch (in.nextInt()){
                    case 1://list
                        mainMenu.showBookList();
                        break;
                    case 2://quit
                        flag=false;
                        mainMenu.showQuitMes();
                        break;
                    default:
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
