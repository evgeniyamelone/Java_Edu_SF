package objectsBasicsMandatoryPracticalTasks;

class Author {
    String firstName, lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printAuthor(Author author) {
        System.out.println("Author: \nFirst name: " + firstName + "\nLast name: " + lastName);
    }
}