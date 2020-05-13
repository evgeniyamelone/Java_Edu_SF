package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MoviesArrayList {
    private List<String> moviesList = new ArrayList<>();

    public void addToMoviesList(String movie) {
        moviesList.add(movie);
    }

//    public void printMoviesList() {
//        for (String s : moviesList) {
//            System.out.println(s);
//        }
//    }

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


//    Implement a separate demo program for each of the following collections:
//        * ArrayList
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
