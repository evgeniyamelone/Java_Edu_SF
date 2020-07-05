package lambdaperson;

import org.junit.jupiter.api.Test;
import personlist.ListActions;
import personlist.Person;

import java.util.Collections;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class FilteredPersonsTest {

    @Test
    void filteredSet() {
        Set<Person> given = Set.of(
                new Person("Stephen", 25),
                new Person("John", 25),
                new Person("John", 25),
                new Person("Rose", 24),
                new Person("Stephen", 16),
                new Person("Stephen", 10),
                new Person("John", 30)
        );
        Set<Person> expected = Set.of(
                new Person("JOHN", 25),
                new Person("ROSE", 24),
                new Person("JOHN", 30),
                new Person("STEPHEN", 25));
                assertThat(ListActions.equalSets(expected, FilteredPersons.filterPersons(given))).isTrue();
    }

    @Test
    void outOfBoundary() {
        Set<Person> given = Set.of(
                new Person("Stephen", 19),
                new Person("John", 100),
                new Person("John", 10),
                new Person("Rose", 9)
        );
        assertThat(FilteredPersons.filterPersons(given).size()).isEqualTo(0);
    }

    @Test
    void filteredWithEmptyNameSet() {
        Set<Person> given = Set.of(
                new Person("", 25),
                new Person("John", 25),
                new Person("Rose", 24),
                new Person("Stephen", 16),
                new Person("Stephen", 10),
                new Person("John", 30)
        );
        Set<Person> expected = Set.of(
                new Person("", 25),
                new Person("JOHN", 25),
                new Person("ROSE", 24));
        assertThat(ListActions.equalSets(expected, FilteredPersons.filterPersons(given))).isTrue();
    }

    @Test
    void filteredWithBlankNameSet() {
        Set<Person> given = Set.of(
                new Person(" ", 25),
                new Person("John", 25),
                new Person("Rose", 24),
                new Person("Stephen", 16),
                new Person("Stephen", 10),
                new Person("John", 30)
        );
        Set<Person> expected = Set.of(
                new Person(" ", 25),
                new Person("JOHN", 25),
                new Person("ROSE", 24));
        assertThat(ListActions.equalSets(expected, FilteredPersons.filterPersons(given))).isTrue();
    }

    @Test
    void filteredWithUpperCase() {
        Set<Person> given = Set.of(
                new Person("JOHN", 25),
                new Person("Stephen", 26));

        Set<Person> expected = Set.of(
                new Person("JOHN", 25),
                new Person("STEPHEN", 26));
        assertThat(ListActions.equalSets(expected, FilteredPersons.filterPersons(given))).isTrue();
    }

    @Test
    void filteredWithEmptySet() {
        Set<Person> given = Collections.EMPTY_SET;

        Set<Person> expected = Set.of(
                new Person("JOHN", 25),
                new Person("STEPHEN", 26));
        assertThat(FilteredPersons.filterPersons(given).size()).isEqualTo(0);

    }
}