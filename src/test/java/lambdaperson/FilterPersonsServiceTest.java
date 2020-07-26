package lambdaperson;

import org.junit.jupiter.api.Test;
import personList.Person;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

class FilterPersonsServiceTest {

    FilterPersonsService filterPersonService = new FilterPersonsService();

    @Test
    void filteredSet() {
        Set<Person> given = Set.of(
                new Person("Stephen", 25),
                new Person("John", 25),
                new Person("John", 25),
                new Person("Rose", 24),
                new Person("Stephen", 16),
                new Person("Stephen", 10),
                new Person("Stephen_Fry", 29),
                new Person("Stephen", 10)
        );
        List<String> expected = List.of(
                "JOHN", "ROSE", "JOHN", "STEPHEN", "STEPHEN_FRY");
        assertThat(expected, is(filterPersonService.filter(given)));
    }

    @Test
    void outOfBoundary() {
        Set<Person> given = Set.of(
                new Person("Stephen", 19),
                new Person("Stephen", 20),
                new Person("John", 100),
                new Person("John", 10),
                new Person("Rose", 9),
                new Person("Rose", 30),
                new Person("Rose", 31)
        );
        assertThat(filterPersonService.filter(given).size()).isEqualTo(0);
    }

    @Test
    void filteredWithEmptyNameSet() {
        Set<Person> given = Set.of(
                new Person("", 25),
                new Person("John", 25),
                new Person("Rose", 24)
        );
        List<String> expected = List.of("", "JOHN", "ROSE");
        assertThat(expected, is(filterPersonService.filter(given)));
    }

    @Test
    void filteredWithBlankNameSet() {
        Set<Person> given = Set.of(
                new Person(" ", 25),
                new Person("John", 25),
                new Person("Rose", 24)
        );
        List<String> expected = List.of(" ", "JOHN", "ROSE");
        assertThat(expected, is(filterPersonService.filter(given)));
    }

    @Test
    void filteredWithUpperCase() {
        Set<Person> given = Set.of(
                new Person("JOHN", 25),
                new Person("Stephen", 26));

        List<String> expected = List.of("JOHN", "STEPHEN");
        assertThat(expected, is(filterPersonService.filter(given)));
    }

    @Test
    void filteredWithEmptySet() {
        Set given = Collections.EMPTY_SET;
        assertThat(filterPersonService.filter(given).size()).isEqualTo(0);

    }
}