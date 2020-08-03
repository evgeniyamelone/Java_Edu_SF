package lambdabook;


import objectsBasicsMandatoryPracticalTasks.Books.Author;
import objectsBasicsMandatoryPracticalTasks.Books.Book;
import objectsBasicsMandatoryPracticalTasks.Books.BookComparator;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterBooksService {
    public Book maxPrice(List<Book> bookList) {
        return bookList.stream()
                .sorted(new BookComparator())
                .findFirst()
                .orElse(null);
    }

    public String getBooks(List<Book> bookList, Author author) {
        return bookList.stream()
                .filter((book) -> book.getAuthor().equals(author))
                .map(Book::getTitle)
                .collect(Collectors.joining(" "));
    }

    public List<Book> sortBooks(List<Book> bookList) {
        return bookList.stream()
                .sorted(Comparator.comparing(s -> s.getAuthor()
                        .getAuthorFullName()))
                .collect(Collectors.toList());
    }

    public double sumPrices(List<Book> bookList) {
        return bookList.stream()
                .mapToDouble(Book::getPrice)
                .sum();
    }

}

