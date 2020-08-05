package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MovieListTest {
    ByteArrayOutputStream output;
    @Before
    public void setUp(){
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }
    @Test
    public void showListOfMoviesTest() {
        MovieList movieList = new MovieList();
        assertEquals("Movie A\n" +
                "Movie B\n" +
                "Movie C", movieList.showListOfMovies());
    }

    @Test
    public void showMoviesInfoTest() {
        MovieList movieList = new MovieList();
        movieList.showMoviesInfo();
        assertEquals("Movie A | AAA | 2\r\n" +
                "Movie B | BBB | 3\r\n" +
                "Movie C | CCC | 4\r\n", output.toString());
    }
}
