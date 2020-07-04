package lambdaperson;

import org.junit.jupiter.api.Test;
import personlist.ListActions;
import personlist.Person;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class FilteredPersonsTest {
    @Test
    void filter() {
        Set<Person> given = Set.of(new Person("John", 25), new Person("Rose", 24), new Person("Stephen", 16),
                new Person("Stephen", 10), new Person("John", 30));
        Set<Person> expected = Set.of(new Person("Rose1", 24), new Person("John", 25));
        assertThat(ListActions.equalSets(expected, FilteredPersons.filterPersons(given))).isTrue();

    }
