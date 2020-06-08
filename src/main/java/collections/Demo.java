package collections;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
       ArrayList<String> moviesList = new ArrayList<>();
        moviesList.add("It");
        moviesList.add("The Gentlemen");
        moviesList.add("Once upon a time in Hollywood");
        moviesList.add("Astral");
        System.out.println("\nArrayList of Movies:");
        Output.printMoviesList(moviesList);
        moviesList.remove("It");
        System.out.println("\nUpdated ArrayList of Movies:");
        Output.printMoviesList(moviesList);
        System.out.println("\nUpdated ArrayList of Movies:");
        moviesList.set(moviesList.indexOf("Astral"), "Astral-2");
        Output.printMoviesList(moviesList);
        Collections.sort(moviesList);
        System.out.println("\nSorted ArrayList of Movies:");
        Output.printMoviesList(moviesList);

        HashSet<String> moviesList2 = new HashSet<>();
        moviesList2.add("It-2");
        moviesList2.add("Saw-4");
        moviesList2.add("Saw-5");
        moviesList2.add("Saw-2");
        System.out.println("\nHashSet of Movies:");
        Output.printMoviesList(moviesList2);
        moviesList2.remove("Saw-5");
        System.out.println("\nUpdated HashSet of Movies:");
        Output.printMoviesList(moviesList2);

        HashMap<Integer, String> moviesList3 = new HashMap<>();
        moviesList3.put(1, "It");
        moviesList3.put(2, "Avatar");
        moviesList3.put(5, "Titanic");
        moviesList3.put(3, "Terminator");
        System.out.println("\nHashMap of Movies:");
        Output.printHashMap(moviesList3);
        moviesList3.remove(2);
        System.out.println("\nUpdated HashMap of Movies:");
        Output.printHashMap(moviesList3);
        moviesList3.put(1, "It-2");
        System.out.println("\nUpdated HashMap of Movies:");
        Output.printHashMap(moviesList3);

        Queue<String> moviesList4 = new PriorityQueue<>();
        moviesList4.add("Top Gun: Maverick");
        moviesList4.add("Top Gun");
        moviesList4.add("Voltron");
        moviesList4.add("Robotech");
        System.out.println("\nQueue of Movies:");
        Output.printMoviesList(moviesList4);
        moviesList4.remove();
        System.out.println("\nUpdated Queue of Movies:");
        Output.printMoviesList(moviesList4);
    }
}