package objectsBasicsMandatoryPracticalTasks;

public class Book {
    public String title;
    public Author author;
    public double price;

    public Book(String title, double price) {
        this.title = title;
        this.author = new Author("Russel", "Winderand");
        this.price = price;
        System.out.println("title = " + title + ", author = " + author + ", price = " + price);
    }
}
