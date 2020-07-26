package lambdaperson;

import personList.Person;
import java.util.*;
import java.util.stream.Collectors;

public class LambdaPerson {

    public static void main(String[] args) {
        FilterPersonsService filterPersonService = new FilterPersonsService();
        Set<Person> given = Set.of(new Person("John", 25), new Person("Rose", 24), new Person("Stephen", 16),
                new Person("Stephen", 10), new Person("John", 30));
        System.out.println(filterPersonService.filter(given));
    }
}