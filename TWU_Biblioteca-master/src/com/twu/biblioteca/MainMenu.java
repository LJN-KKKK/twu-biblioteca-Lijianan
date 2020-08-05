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
        optionsList.add("Return books");
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
        Book book = bookList.getBook(index);
        if(index>0 && index<=bookList.getSize() && book.isCheckOut()==true){
            System.out.println("Thank you! Enjoy the book.");
            book.setCbeckout(false);
        }
        else {
            System.out.println("Sorry,that book is not available!");
        }
    }

    public void showReturnBook(){
        System.out.println("Enter the number of the book you want to return:");
        Scanner rebook = new Scanner(System.in);
        int index = rebook.nextInt()-1;
        Book book = bookList.getBook(index);
        if(index>0 && index<=bookList.getSize() && book.isCheckOut()==true){
            System.out.println("That is not a valid book to return.");
        }
        else{
            System.out.println("Thank you for returning the book.");
            book.setCbeckout(true);
        }
    }
}
