package com.twu.biblioteca;

import java.util.ArrayList;

public class MovieList {
    private ArrayList<Movie> movieList = new ArrayList<>();

    public MovieList(){
        boolean add = movieList.add(new Movie("Movie A", "AAA", "2",true));
        movieList.add(new Movie("Movie B", "BBB", "3",true));
        movieList.add(new Movie("Movie C", "CCC", "4",false));
    }

    public String showListOfMovies() {
        StringBuffer movies = new StringBuffer();

        for(Movie movie : movieList) {
            movies.append(movie.getTitle() + "\n");
        }

        return movies.toString().trim();
    }

    public void showMoviesInfo() {
        for(Movie movie : movieList) {
            System.out.println(movie.getTitle() + " | " + movie.getDirector() + " | " + movie.getRating());
        }
    }

    public int getSize(){
        return movieList.size();
    }

    public Movie getMovie(int index){
        return movieList.get(index);
    }
}
