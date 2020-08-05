package com.twu.biblioteca;

public class Movie {
    private String title;
    private String director;
    private String rating;
    private boolean isCheckout;


    public Movie(String title, String director, String rating, boolean isCheckout) {
        this.title = title;
        this.director = director;
        this.rating = rating;
        this.isCheckout = isCheckout;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getRating() {
        return rating;
    }

    public boolean isCheckOut() {
        return isCheckout;
    }

    public void setCheckout(boolean isCheckout){
        this.isCheckout = isCheckout;
    }
}
