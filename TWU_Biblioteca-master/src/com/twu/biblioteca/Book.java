package com.twu.biblioteca;

public class Book {

    private String title;
    private String author;
    private String publishYear;
    private boolean isCbeckout;


    public Book(String title, String author, String publishYear, boolean isCbeckout) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.isCbeckout = isCbeckout;
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
        return isCbeckout;
    }

    public void setCbeckout(boolean isCbeckout){
        this.isCbeckout = isCbeckout;
    }
}