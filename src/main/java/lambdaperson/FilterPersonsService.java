package lambdaperson;

import personList.Person;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterPersonsService {

    public List<String> filter(Set<Person> personList) {
        return personList.stream().filter(person -> person.getAge() < 30 && person.getAge() > 20)
                .peek((Person p) -> p.setName(p.getName().toUpperCase()))
                .map(Person::getName).
                sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }
}
