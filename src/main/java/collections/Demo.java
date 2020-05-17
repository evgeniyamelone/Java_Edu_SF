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


    }

//        printOutCollections();
//        int mainParam = scanner.nextInt();
//        while (mainParam != 0) {
//            switch (mainParam) {
//                case 1:
//                    MovieArrayList moviesList = new MovieArrayList();
//                    printOut1();
//                    int param = scanner.nextInt();
//                    while (param != 0) {
//                        switch (param) {
//                            case 1:
//                                System.out.println("\nPlease enter a movie to add");
//                                scanner.nextLine();
//                                String movie = scanner.nextLine();
//                                moviesList.addToMoviesList(movie);
//                                System.out.println("\nPlease choose an action by typing [0-4]");
//                                param = scanner.nextInt();
//                                break;
//                            case 2:
//                                System.out.println("\nPlease enter the movie to update:");
//                                scanner.nextLine();
//                                String oldMovie = scanner.nextLine();
//                                System.out.println("\nPlease enter a new movie:");
//                                String newMovie = scanner.nextLine();
//                                moviesList.changeMovie(moviesList.getMovieIndex(oldMovie), newMovie);
//                                System.out.println("\nPlease choose an action by typing [0-4]");
//                                param = scanner.nextInt();
//                                break;
//                            case 3:
//                                moviesList.sortMoviesList();
//                                System.out.println("\nPlease choose an action by typing [0-4]");
//                                param = scanner.nextInt();
//                                break;
//                            case 4:
//                                System.out.println("\nPrinting out the list of movies:");
//                                moviesList.printMoviesList();
//                                System.out.println("\nPlease choose an action by typing [0-4]");
//                                param = scanner.nextInt();
//                                break;
//                            case 5:
//                                System.out.println("Please enter the movie to remove:");
//                                scanner.nextLine();
//                                String removeMovie = scanner.nextLine();
//                                moviesList.removeMovie(removeMovie);
//                                System.out.println("Please choose an action by typing [0-4]");
//                                param = scanner.nextInt();
//                                break;
//                            default:
//                                param = 0;
//                        }
//                    }
//                    break;
//                case 2:
//                    MovieHashSet moviesList2 = new MovieHashSet();
//                    printOut2();
//                    int param2 = scanner.nextInt();
//                    while (param2 != 0) {
//                        switch (param2) {
//                            case 1:
//                                System.out.println("\nPlease enter a movie's title to add");
//                                String title = scanner.next();
//
//                                System.out.println("\nPlease enter a movie's director to add");
//                                String director = scanner.next();
//
//                                System.out.println("\nPlease enter a movie's genre to add");
//                                String genre = scanner.next();
//
//                                System.out.println("\nPlease enter a movie's rate to add");
//                                int rate = scanner.nextInt();
//
//                                Movie movie = new Movie(title, director, genre, rate);
//                                moviesList2.addToMoviesList(movie);
//                                System.out.println("\nPlease choose an action by typing [0-4]");
//                                param2 = scanner.nextInt();
//                                break;
//                            case 2:
//                                System.out.println("\nPrinting out the list of movies:");
//                                moviesList2.printMoviesList();
//                                System.out.println("\nPlease choose an action by typing [0-4]");
//                                param2 = scanner.nextInt();
//                                break;
//                            case 3:
//                                System.out.println("\nPlease enter a movie's title to add");
//                                String title1 = scanner.next();
//
//                                System.out.println("\nPlease enter a movie's director to add");
//                                String director1 = scanner.next();
//
//                                System.out.println("\nPlease enter a movie's genre to add");
//                                String genre1 = scanner.next();
//
//                                System.out.println("\nPlease enter a movie's rate to add");
//                                int rate1 = scanner.nextInt();
//
//                                Movie movie3 = new Movie(title1, director1, genre1, rate1);
//                                moviesList2.removeMovie(movie3);
//                                System.out.println("Please choose an action by typing [0-4]");
//                                param2 = scanner.nextInt();
//                                break;
//                            default:
//                                param2 = 0;
//                        }
//                    }
//                    break;
//                default:
//                    mainParam = 0;
//            }
//        }
//
//    }
//
//    private static void printOutCollections() {
//        System.out.println("Please choose a collection. Press: :\n"
//                + "1 to add ArrayList\n"
//                + "2 to add Hash Set\n"
//                + "press 0 for exit\n");
//    }
//
//    private static void printOut1() {
//        System.out.println("Please choose an action. Press: :\n"
//                + "1 to add a new movie into the list of movies\n"
//                + "2 to update an existing movie\n"
//                + "3 to sort the list of movies\n"
//                + "4 to print out the list of movies\n"
//                + "5 to remove an existing movies\n"
//                + "press 0 for exit\n");
//    }
//    private static void printOut2() {
//        System.out.println("Please choose an action. Press: :\n"
//                + "1 to add a new movie into the list of movies\n"
//                + "2 to print out the list of movies\n"
//                + "3 to remove an existing movies\n"
//                + "press 0 for exit\n");
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
