package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class MovieQueue {
    Queue<String> moviesList = new PriorityQueue<>();

    public void addToMoviesList(String movie) {
        moviesList.add(movie);
    }

    public void removeMovie() {
        moviesList.poll();
    }

    public void printMoviesList() {
        for(String movie : moviesList) {
            System.out.println(movie);
        }
    }
}
