package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MovieArrayList {
    private List<String> moviesList = new ArrayList<>();

    public void addToMoviesList(String movie) {
        moviesList.add(movie);
    }

    public void changeMovie(int index, String movie) {
        moviesList.set(index, movie);
    }

    public int getMovieIndex(String movie) {
        return moviesList.indexOf(movie);
    }

    public void removeMovie(String movie) {
        moviesList.remove(movie);
    }

    public void sortMoviesList() {
        Collections.sort(moviesList);
    }

    public void printMoviesList() {
        Iterator<String> iter = moviesList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

}


