package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {

    private ArrayList<String> optionsList;
    private BookList bookList=new BookList();

    public MainMenu() {
        optionsList = new ArrayList<>();
        optionsList.add("List of books");
        optionsList.add("Checkout books");
        optionsList.add("Quit");
    }

    public void showMainMenu() {
        for(int i = 0; i < optionsList.size(); i++) {
            System.out.println((i+1) + ". " + optionsList.get(i));
        }
    }
    public void showBookList(){
        bookList.showBooksInfo();
    }
    public void showInvalidInput(){
        System.out.println("Please select a valid option!");
    }

    public void showQuitMes(){
        System.out.println("Goodbye!");
    }

    public void showCheckoutBookMes(){
        System.out.println("Please select the book you want to checkout:");
        Scanner bookin = new Scanner(System.in);
        int index = bookin.nextInt()-1;
        if(index>0 && index<=bookList.getSize() && bookList.getBook(index).isCheckOut()==true){
            System.out.println("Thank you! Enjoy the book.");
        }
        else {
            System.out.println("Sorry,that book is not available!");
        }
    }
}
