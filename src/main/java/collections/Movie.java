package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Movie {
    private final String title;
    private final String director;
    private final String genre;
    private final int rate;

    public Movie(String title, String director, String genre, int rate) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.rate = rate;
    }

//    private Set<MovieHashSet> moviesList = new HashSet<>();

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getRate() {
        return rate;
    }


//    public void addToMovie(MovieHashSet movie) {
//        moviesList.add(movie);
//    }
}


//    Implement a separate demo program for each of the following collections:
//        * ArrayList (+)
//        * HashSet
//        * HashMap
//        * Queue
//        For each collection test following actions (if applicable to the collection type):
//        * add element
//        * edit some element
//        * remove some element
//        * sort elements
//        * iterate through the collection printing each element
//         
//        Also, you may test other collection types or\and other methods provided by the collection itself or by the Collections class.
