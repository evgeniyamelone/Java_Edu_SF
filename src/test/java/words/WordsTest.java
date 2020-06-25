package words;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordsTest {

    @Test
    void select() {
        assertEquals(Words.matches("\\b[A-Z]\\S+|\\b[A-Z]", "Word cAT DATA A site Java tExt"), "Word DATA A Java");
    }
}