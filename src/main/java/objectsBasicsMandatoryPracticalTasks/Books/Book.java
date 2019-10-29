package objectsBasicsMandatoryPracticalTasks.Books;

class Book {
    private String title;
    private double price;
    Author author;

    Book(String title, Author author, double price) {
        this.title = title;
        this.price = price;
        author.printAuthor(author);
    }

    void printBook(Book book) {
        System.out.println("Title: \n" + " " + title + "\nPrice: \n" + " " + price);
    }
}