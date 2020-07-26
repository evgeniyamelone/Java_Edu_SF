package objectsBasicsMandatoryPracticalTasks.Books;

public class Author {
    private String firstName, lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void printAuthor(Author author) {
        System.out.println("Author: \n First name: " + firstName + "\n" + " Last name: " + lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAuthorFullName() {
        return this.getFirstName() + " " + this.getLastName();
    }
}


