package objectsBasicsMandatoryPracticalTasks.Books;

public class Book {
    private String title;
    private double price;
    Author author;

    public Book(String title, Author author, double price) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    void printBook(Book book) {

        System.out.println("Title: \n" + " " + title + "\nPrice: \n" + " " + price);
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        String title = getTitle();
        String authorFullName = getAuthor().getAuthorFullName();
        double price = getPrice();
        return title + " " + authorFullName + " " + price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return title.equals(book.title) &&
                price == book.price &&
                author.equals(book.author);
    }
}
