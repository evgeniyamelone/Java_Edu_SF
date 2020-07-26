package lambdabook;

import objectsBasicsMandatoryPracticalTasks.Books.Author;
import objectsBasicsMandatoryPracticalTasks.Books.Book;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

class FilterBooksService_MaxPrice_Test {

    FilterBooksService filterBooksService = new FilterBooksService();

    @Test
    void filter() {
        List<Book> given = List.of(
                new Book("Misery", new Author("Stephen", "King"), 10),
                new Book("It-2", new Author("Stephen", "King"), 150),
                new Book("It", new Author("Stephen", "King"), 100));
        List<String> expected = List.of(
                new Book("It-2", new Author("Stephen", "King"), 150))
                .stream()
                .map(Book::getBookDetails)
                .collect(Collectors.toList());
        List<String> actual = filterBooksService.maxPrice(given)
                .stream()
                .map(Book::getBookDetails)
                .collect(Collectors.toList());
        assertThat(expected, is(actual));
    }

    @Test
    void filter_equalPrice() {
        List<Book> given = List.of(
                new Book("Misery", new Author("Stephen", "King"), 10),
                new Book("It-2", new Author("Stephen", "King"), 150),
                new Book("It", new Author("Stephen", "King"), 100),
                new Book("The Call of Cthulhu", new Author("Howard", "Lovecraft"), 150));
        List<String> expected = List.of(
                new Book("It-2", new Author("Stephen", "King"), 150),
                new Book("The Call of Cthulhu", new Author("Howard", "Lovecraft"), 150))
                .stream()
                .map(Book::getBookDetails)
                .collect(Collectors.toList());
        List<String> actual = filterBooksService.maxPrice(given)
                .stream()
                .map(Book::getBookDetails)
                .collect(Collectors.toList());
        assertThat(expected, is(actual));
    }

    @Test
    void filter_zeroPrice() {
        List<Book> given = List.of(
                new Book("Misery", new Author("Stephen", "King"), 10),
                new Book("It", new Author("Stephen", "King"), 0),
                new Book("The Call of Cthulhu", new Author("Howard", "Lovecraft"), 150));
        List<String> expected = List.of(
                new Book("The Call of Cthulhu", new Author("Howard", "Lovecraft"), 150))
                .stream()
                .map(Book::getBookDetails)
                .collect(Collectors.toList());
        List<String> actual = filterBooksService.maxPrice(given)
                .stream()
                .map(Book::getBookDetails)
                .collect(Collectors.toList());
        assertThat(expected, is(actual));
    }
}


