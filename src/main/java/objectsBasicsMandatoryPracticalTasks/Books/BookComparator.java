package objectsBasicsMandatoryPracticalTasks.Books;
import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    public int compare(Book b1, Book b2){
        return b2.getPrice().compareTo(b1.getPrice());
    }
}
