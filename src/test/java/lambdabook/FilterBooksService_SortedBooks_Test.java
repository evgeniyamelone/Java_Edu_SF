package lambdabook;

import objectsBasicsMandatoryPracticalTasks.Books.Author;
import objectsBasicsMandatoryPracticalTasks.Books.Book;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FilterBooksService_SortedBooks_Test {

    FilterBooksService filterBooksService = new FilterBooksService();

    @Test
    void filter() {
        List<Book> given = List.of(
                new Book("'The Shining'", new Author("Stephen", "King"), 100),
                new Book("'Misery'", new Author("Stephen", "King"), 100),
                new Book("'It'", new Author("Stephen", "King"), 100),
                new Book("'The Raven'", new Author("Edgar", "Po"), 15),
                new Book("'The Call of Cthulhu'", new Author("Howard", "Lovecraft"), 55),
                new Book("'Cthulhu'", new Author("Howard", "Lovecraft"), 55));
        List<String> expected = List.of(
                new Book("'The Raven'", new Author("Edgar", "Po"), 15),
                new Book("'The Call of Cthulhu'", new Author("Howard", "Lovecraft"), 55),
                new Book("'Cthulhu'", new Author("Howard", "Lovecraft"), 55),
                new Book("'The Shining'", new Author("Stephen", "King"), 100),
                new Book("'Misery'", new Author("Stephen", "King"), 100),
                new Book("'It'", new Author("Stephen", "King"), 100))
                .stream()
                .map(Book::getBookDetails)
                .collect(Collectors.toList());
        List<String> actual = filterBooksService.sortedBooks(given);
        assertThat(expected, is(actual));
    }

    @Test
    void filter_emptyList() {
        List<Book> given = Collections.EMPTY_LIST;
        List<String> expected = Collections.EMPTY_LIST;
        List<String> actual = filterBooksService.sortedBooks(given);
        assertThat(actual, is(expected));
    }
}