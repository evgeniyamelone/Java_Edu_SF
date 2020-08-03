package lambdabook;

import objectsBasicsMandatoryPracticalTasks.Books.Author;
import objectsBasicsMandatoryPracticalTasks.Books.Book;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FilterBooksService_SumPrices_Test {

    FilterBooksService filterBooksService = new FilterBooksService();

    @Test
    void sum() {
        List<Book> given = List.of(
                new Book("Misery", new Author("Stephen", "King"), 10),
                new Book("It-2", new Author("Stephen", "King"), 150),
                new Book("It", new Author("Stephen", "King"), 100));
        Double expected = 260.0;
        Double actual = filterBooksService.sumPrices(given);
        assertThat(expected, is(actual));
    }

    @Test
    void sum_Zero() {
        List<Book> given = List.of(
                new Book("Misery", new Author("Stephen", "King"), 0),
                new Book("It-2", new Author("Stephen", "King"), 0),
                new Book("It", new Author("Stephen", "King"), 0));
        Double expected = 0.0;
        Double actual = filterBooksService.sumPrices(given);
        assertThat(expected, is(actual));
    }

    @Test
    void sum_emptyList() {
        List<Book> given = Collections.EMPTY_LIST;
        Double expected = 0.0;
        Double actual = filterBooksService.sumPrices(given);
        assertThat(actual, is(expected));
    }
}
