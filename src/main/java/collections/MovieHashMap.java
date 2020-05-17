package collections;

import javax.management.openmbean.TabularData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MovieHashMap {
    Map<Integer, String> moviesList = new HashMap<>();

    public void addToMoviesList(int k, String movie) {
        moviesList.put(k, movie);
    }

    public void removeMovie(int k){
        moviesList.remove(k);
    }

    public void printMoviesList(){
        for(Map.Entry<Integer, String> entry: moviesList.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
    }
}
