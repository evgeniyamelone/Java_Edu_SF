package lambdabook;

import objectsBasicsMandatoryPracticalTasks.Books.Author;
import objectsBasicsMandatoryPracticalTasks.Books.Book;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

import java.util.Collections;
import java.util.List;

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
        List<Book> expected = List.of(
                new Book("'The Raven'", new Author("Edgar", "Po"), 15),
                new Book("'The Call of Cthulhu'", new Author("Howard", "Lovecraft"), 55),
                new Book("'Cthulhu'", new Author("Howard", "Lovecraft"), 55),
                new Book("'The Shining'", new Author("Stephen", "King"), 100),
                new Book("'Misery'", new Author("Stephen", "King"), 100),
                new Book("'It'", new Author("Stephen", "King"), 100));
        List<Book> actual = filterBooksService.sortBooks(given);
        Assert.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void filter_emptyList() {
        List<Book> given = Collections.EMPTY_LIST;
        List<Book> actual = filterBooksService.sortBooks(given);
        Assertions.assertThat(actual).isEmpty();
    }
}