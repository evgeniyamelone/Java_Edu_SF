package lambdabook;

import objectsBasicsMandatoryPracticalTasks.Books.Author;
import objectsBasicsMandatoryPracticalTasks.Books.Book;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;


class FilterBooksService_MaxPrice_Test {

    FilterBooksService filterBooksService = new FilterBooksService();

    @Test
    void filter() {
        List<Book> given = List.of(
                new Book("Misery", new Author("Stephen", "King"), 10),
                new Book("It-2", new Author("Stephen", "King"), 150),
                new Book("It", new Author("Stephen", "King"), 100));
        Book actual = filterBooksService.maxPrice(given);
        Book expected = new Book("It-2", new Author("Stephen", "King"), 150);
       Assertions.assertThat(actual).isEqualToComparingFieldByFieldRecursively(expected);
    }

    @Test
    void filter_equalPrices() {
        List<Book> given = List.of(
                new Book("Misery", new Author("Stephen", "King"), 10),
                new Book("It-2", new Author("Stephen", "King"), 150),
                new Book("It", new Author("Stephen", "King"), 100),
                new Book("The Call of Cthulhu", new Author("Howard", "Lovecraft"), 150));
         Book expected = new Book("It-2", new Author("Stephen", "King"), 150);
        Book actual = filterBooksService.maxPrice(given);
        Assertions.assertThat(actual).isEqualToComparingFieldByFieldRecursively(expected);
    }

    @Test
    void filter_zeroPrice() {
        List<Book> given = List.of(
                new Book("Misery", new Author("Stephen", "King"), 10),
                new Book("It", new Author("Stephen", "King"), 0),
                new Book("The Call of Cthulhu", new Author("Howard", "Lovecraft"), 150));
        Book expected = new Book("The Call of Cthulhu", new Author("Howard", "Lovecraft"), 150);
        Book actual = filterBooksService.maxPrice(given);
        Assertions.assertThat(actual).isEqualToComparingFieldByFieldRecursively(expected);
    }

    @Test
    void filter_oneBook() {
        List<Book> given = List.of(
                new Book("Misery", new Author("Stephen", "King"), 10));
        Book expected = new Book("Misery", new Author("Stephen", "King"), 10);
        Book actual = filterBooksService.maxPrice(given);
        Assertions.assertThat(actual).isEqualToComparingFieldByFieldRecursively(expected);
    }

    @Test
    void filter_emptyList() {
        List<Book> given = Collections.EMPTY_LIST;
        Book actual = filterBooksService.maxPrice(given);
        Assertions.assertThat(actual).isNull();
    }

}


