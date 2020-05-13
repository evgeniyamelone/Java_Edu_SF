package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        MoviesArrayList moviesList = new MoviesArrayList();
        moviesList.addToMoviesList("\tTrue Detective");
        moviesList.addToMoviesList("\tOnce Upon a Time in Hollywood");
        moviesList.addToMoviesList("\tIt");
        moviesList.addToMoviesList("\tThe Gentlemen");
        System.out.println("Movies List: ");
        moviesList.printMoviesList();
        System.out.println("\nUpdated Movies List: ");
        int index = moviesList.getMovieIndex("\tIt");
        moviesList.changeMovie(index, "\tIt 2");
        int index2 = moviesList.getMovieIndex("\tTrue Detective");
        moviesList.changeMovie(index2, "\tTrue Detective: season 2");
        moviesList.printMoviesList();
        moviesList.sortMoviesList();
        System.out.println("\nSorted Updated Movies List: ");
        moviesList.printMoviesList();
    }
}