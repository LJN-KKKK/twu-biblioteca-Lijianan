package com.twu.biblioteca;

public class Book {

    private String title;
    private String author;
    private String publishYear;
    private boolean isCheckout;


    public Book(String title, String author, String publishYear, boolean isCheckout) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.isCheckout = isCheckout;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public boolean isCheckOut() {
        return isCheckout;
    }
    
    public void setCheckout(boolean isCheckout){
        this.isCheckout = isCheckout;
    }
}