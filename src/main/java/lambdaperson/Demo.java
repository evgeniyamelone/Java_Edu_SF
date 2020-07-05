package lambdaperson;

import personlist.Person;
import java.util.*;


public class Demo {
    public static void main(String[] args) {
        Set<Person> given = Set.of(  new Person("", 25),
                new Person("John", 25),
                new Person("Rose", 24),
                new Person("Stephen", 16),
                new Person("Stephen", 10),
                new Person("John", 30));

        System.out.println(FilteredPersons.filterPersons(given));
    }
}