package personlist;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ListActions_Contains_Test {
    @Test
    void contains() {
        List<Person> list = List.of( new Person( "John", 25 ), new Person( "Rose", 24 ), new Person( "Stephen", 16 ),
                new Person( "Stephen", 10 ), new Person( "John", 30 ) );
        Assertions.assertThat( ListActions.contains( list, new Person( "John", 25 ) ) ).isTrue();
        Assertions.assertThat( ListActions.contains( list, new Person( "John-1", 25 ) ) ).isFalse();
        Assertions.assertThat( ListActions.contains( list, new Person( "John", 24 ) ) ).isFalse();
        Assertions.assertThat( ListActions.contains( list, new Person( "John", 30 ) ) ).isTrue();
    }

    @Test
    void falseOnEmptyList() {
        List<Person> emptyList = List.of();
        Assertions.assertThat( ListActions.contains( emptyList, new Person( "", 100 ) ) ).isFalse();
    }

    @Test
    void singleElementListContainsPerson() {
        List<Person> list = List.of( new Person( "John", 25 ) );
        Assertions.assertThat( ListActions.contains( list, new Person( "John", 25 ) ) ).isTrue();
    }

    @Test
    void singleElementListNotContainPersonWithOtherName() {
        List<Person> list = List.of( new Person( "John", 25 ) );
        Assertions.assertThat( ListActions.contains( list, new Person( "Jane", 25 ) ) ).isFalse();
    }
}