package collections;

import java.util.*;

public class Demo {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MovieArrayList moviesList = new MovieArrayList();
        printOut();
        int param = scanner.nextInt();
        while (param != 0) {
            switch (param) {
                case 1:
                    System.out.println("\nPlease enter a movie to add");
                    scanner.nextLine();
                    String movie = scanner.nextLine();
                    moviesList.addToMoviesList(movie);
                    System.out.println("\nPlease choose an action by typing [0-4]");
                    param = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("\nPlease enter the movie to update:");
                    scanner.nextLine();
                    String oldMovie = scanner.nextLine();
                    System.out.println("\nPlease enter a new movie:");
                    String newMovie = scanner.nextLine();
                    moviesList.changeMovie(moviesList.getMovieIndex(oldMovie), newMovie);
                    System.out.println("\nPlease choose an action by typing [0-4]");
                    param = scanner.nextInt();
                    break;
                case 3:
                    moviesList.sortMoviesList();
                    System.out.println("\nPlease choose an action by typing [0-4]");
                    param = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("\nPrinting out the list of movies:");
                    moviesList.printMoviesList();
                    System.out.println("\nPlease choose an action by typing [0-4]");
                    param = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("Please enter the movie to remove:");
                    scanner.nextLine();
                    String removeMovie = scanner.nextLine();
                    moviesList.removeMovie(removeMovie);
                    System.out.println("Please choose an action by typing [0-4]");
                    param = scanner.nextInt();
                    break;
                default:
                    param = 0;
            }
        }


//        moviesList.addToMoviesList("\tTrue Detective");
//        moviesList.addToMoviesList("\tOnce Upon a Time in Hollywood");
//        moviesList.addToMoviesList("\tIt");
//        moviesList.addToMoviesList("\tThe Gentlemen");
//        System.out.println("Movies List: ");
//        moviesList.printMoviesList();
//        System.out.println("\nUpdated Movies List: ");
//        int index = moviesList.getMovieIndex("\tIt");
//        moviesList.changeMovie(index, "\tIt 2");
//        int index2 = moviesList.getMovieIndex("\tTrue Detective");
//        moviesList.changeMovie(index2, "\tTrue Detective: season 2");
//        moviesList.printMoviesList();
//        moviesList.sortMoviesList();
//        System.out.println("\nSorted Updated Movies List: ");
//        moviesList.printMoviesList();


    }

    //        Set<Movie> moviesTopTen= new HashSet<>();
//        moviesTopTen.add(new Movie("It", "Andres Muschietti", "horror", 10);
//    }
    private static void printOut() {
        System.out.println("Please choose an action. Press: :\n"
                + "1 to add a new movie into the list of movies\n"
                + "2 to update an existing movie\n"
                + "3 to sort the list of movies\n"
                + "4 to print out the list of movies\n"
                + "5 to remove an existing movies\n"
                + "press 0 for exit\n");
    }
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
