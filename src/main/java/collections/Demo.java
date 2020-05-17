package collections;

import java.util.*;

public class Demo {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MovieArrayList moviesList = new MovieArrayList();
        moviesList.addToMoviesList("It");
        moviesList.addToMoviesList("The Gentlemen");
        moviesList.addToMoviesList("Once upon a time in Hollywood");
        moviesList.addToMoviesList("Astral");
        System.out.println("\nArrayList of Movies:");
        moviesList.printMoviesList();
        moviesList.removeMovie("It");
        System.out.println("\nUpdated ArrayList of Movies:");
        moviesList.printMoviesList();
        System.out.println("\nUpdated ArrayList of Movies:");
        moviesList.changeMovie(moviesList.getMovieIndex("Astral"), "Astral-2");
        moviesList.printMoviesList();
        moviesList.sortMoviesList();
        System.out.println("\nSorted ArrayList of Movies:");
        moviesList.printMoviesList();

        MovieHashSet moviesList2 = new MovieHashSet();
        moviesList2.addToMoviesList("It-2");
        moviesList2.addToMoviesList("Saw-4");
        moviesList2.addToMoviesList("Saw-5");
        moviesList2.addToMoviesList("Saw-2");
        System.out.println("\nHashSet of Movies:");
        moviesList2.printMoviesList();
        moviesList2.removeMovie("Saw-5");
        System.out.println("\nUpdated HashSet of Movies:");
        moviesList2.printMoviesList();

        MovieHashMap moviesList3 = new MovieHashMap();
        moviesList3.addToMoviesList(1, "It");
        moviesList3.addToMoviesList(2, "Avatar");
        moviesList3.addToMoviesList(5, "Titanic");
        moviesList3.addToMoviesList(3, "Terminator");
        System.out.println("\nHashMap of Movies:");
        moviesList3.printMoviesList();
        moviesList3.removeMovie(2);
        System.out.println("\nUpdated HashMap of Movies:");
        moviesList3.printMoviesList();
        moviesList3.addToMoviesList(1, "It-2");
        System.out.println("\nUpdated HashMap of Movies:");
        moviesList3.printMoviesList();

        MovieQueue moviesList4 = new MovieQueue();
        moviesList4.addToMoviesList("Top Gun: Maverick");
        moviesList4.addToMoviesList("Top Gun");
        moviesList4.addToMoviesList("Voltron");
        moviesList4.addToMoviesList("Robotech");
        System.out.println("\nQueue of Movies:");
        moviesList4.printMoviesList();
        moviesList4.removeMovie();
        System.out.println("\nUpdated Queue of Movies:");
        moviesList4.printMoviesList();
    }
}