package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MovieHashSet {
    private Set<String> moviesList = new HashSet<>();

    public Set<String> getMoviesList() {
        return moviesList;
    }

    public void removeMovie(String movie) {
        moviesList.remove(movie);
    }

    public void addToMoviesList(String movie) {
        moviesList.add(movie);
    }

    public void printMoviesList() {
        Iterator<String> iter = moviesList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

}

