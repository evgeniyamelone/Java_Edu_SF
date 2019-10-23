package objectsBasicsMandatoryPracticalTasks;

public class Author {
    public String firstName, lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void getAuthor() {
        System.out.println("First Name = " + firstName + " \nLast Name = " + lastName);
    }
}
