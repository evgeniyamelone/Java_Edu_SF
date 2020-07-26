package lambdaperson;

import personlist.Person;
import personlist.PersonsComparator;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaPerson {
    public static void main(String[] args) {
        Set<Person> given = Set.of(new Person("John", 25), new Person("Rose", 24), new Person("Stephen", 16),
                new Person("Stephen", 10), new Person("John", 30));

        System.out.println(FilteredPersons.filterPersons(given));
    }
}