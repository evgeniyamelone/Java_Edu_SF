package objectsBasicsMandatoryPracticalTasks;

class Author {
    private String firstName, lastName;

    Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void printAuthor(Author author) {
        System.out.println("Author: \nFirst name: " + firstName + "\nLast name: " + lastName);
    }
}

