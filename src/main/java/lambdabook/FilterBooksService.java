package lambdabook;


import objectsBasicsMandatoryPracticalTasks.Books.Author;
import objectsBasicsMandatoryPracticalTasks.Books.Book;

import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class FilterBooksService {
    public List<Book> maxPrice(List<Book> bookList) {
        return bookList.stream()
                .collect(Collectors.groupingBy(
                        Book::getPrice,
                        TreeMap::new,
                        Collectors.toList()
                ))
                .lastEntry()
                .getValue();
    }

    public String getBooks(List<Book> bookList, Author author) {
        return bookList.stream()
                .filter((Book book) -> book.getAuthor()
                        .getAuthorFullName()
                        .equals(author.getAuthorFullName()))
                .map(Book::getTitle)
                .collect(Collectors.joining(" "));
    }

    public List<String> sortedBooks(List<Book> bookList) {
        return bookList.stream()
                .sorted(Comparator.comparing(s -> s.getAuthor()
                        .getAuthorFullName()))
                .map(Book::getBookDetails)
                .collect(Collectors.toList());
    }

    public Double sumPrices(List<Book> bookList) {
        return bookList.stream()
                .mapToDouble(Book::getPrice)
                .sum();
    }

}

