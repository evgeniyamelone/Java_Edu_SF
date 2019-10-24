package objectsBasicsMandatoryPracticalTasks;

class Book {
    String title;
    Author author;
    double price;

    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printBook(Book book) {
        System.out.println("\nTitle: " + title + "\nAuthor " + author + "\nPrice " + price);
    }
}