package lambdaperson;

import personlist.Person;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FilteredPersons {

    public static Set<Person> filterPersons(Set<Person> personList) {
        Comparator<Person> sortingByNameLength =
                Comparator.comparingInt((Person p) -> p.getName().length());

        return personList.stream().filter(Person -> Person.getAge() < 30 & Person.getAge() > 20)
                .sorted(sortingByNameLength)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }
}

// Comparator<Person> sortingByName = Comparator.comparing(Person::getName);
//personList = new TreeSet<>(sortingByName);