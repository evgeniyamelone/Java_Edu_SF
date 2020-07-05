package objectsBasicsMandatoryPracticalTasks.Books;

class Author {
    private String firstName, lastName;

    Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void printAuthor(Author author) {
        System.out.println("Author: \n First name: " + firstName + "\n" + " Last name: " + lastName);
    }
}


