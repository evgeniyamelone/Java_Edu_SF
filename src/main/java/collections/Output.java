package collections;

import java.util.Collection;
import java.util.Map;

public class Output {

    public static void printMoviesList(Collection<?> moviesList) {
        for (Object s : moviesList) {
            System.out.println(s);
        }
    }

    public static void printHashMap(Map<?, String> moviesList) {
        for(Map.Entry<?, String> entry: moviesList.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
    }
}
