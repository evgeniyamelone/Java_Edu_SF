package lambdabook;

import objectsBasicsMandatoryPracticalTasks.Books.Author;
import objectsBasicsMandatoryPracticalTasks.Books.Book;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class FilterBooksService_AllBooksByAuthor_Test {
    FilterBooksService filterBooksService = new FilterBooksService();

    @Test
    void filter() {
        Author author = new Author("Stephen", "King");
        List<Book> given = List.of(
                new Book("Misery", new Author("Stephen", "King"), 10),
                new Book("It", new Author("Stephen", "King"), 100),
                new Book("The Call of Cthulhu", new Author("Howard", "Lovecraft"), 55));
        String expected = "Misery It";
        String actual = filterBooksService.getBooks(given, author);
       Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void filter_oneBook() {
        Author author = new Author("Stephen", "King");
        List<Book> given = List.of(
                new Book("Misery", new Author("Stephen", "King"), 10),
                new Book("The Call of Cthulhu", new Author("Howard", "Lovecraft"), 55));
        String expected = "Misery";
        String actual = filterBooksService.getBooks(given, author);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void filter_noAuthor() {
        Author author = new Author("Edgar", "Po");
        List<Book> given = List.of(
                new Book("Misery", new Author("Stephen", "King"), 10),
                new Book("It", new Author("Stephen", "King"), 100),
                new Book("The Call of Cthulhu", new Author("Howard", "Lovecraft"), 55));
        String expected = "";
        String actual = filterBooksService.getBooks(given, author);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void filter_emptyList() {
        Author author = new Author("Edgar", "Po");
        List<Book> given = Collections.EMPTY_LIST;
        String actual = filterBooksService.getBooks(given, author);
        Assertions.assertThat(actual).isEmpty();
    }
}
