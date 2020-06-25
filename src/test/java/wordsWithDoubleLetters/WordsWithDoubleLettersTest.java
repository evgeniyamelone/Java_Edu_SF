package wordsWithDoubleLetters;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class WordsWithDoubleLettersTest {
    private final WordsWithDoubleLetters words = new WordsWithDoubleLetters();

    @Test
    void empty() {
        Assertions.assertThat(words.getWords(""))
                .isEqualTo("");
    }

    @Test
    void blank() {
        Assertions.assertThat(words.getWords(" "))
                .isEqualTo("");
    }

    @Test
    void wordWithDoubleLetters() {
        Assertions.assertThat(words.getWords("Hello"))
                .isEqualTo("");
    }

    @Test
    void doubleLetters() {
        Assertions.assertThat(words.getWords("ll"))
                .isEqualTo("");
    }

    @Test
    void wordsWithOnlyDoubleLetters() {
        Assertions.assertThat(words.getWords("Hello  password"))
                .isEqualTo("");
    }

    @Test
    void noDoubleLetters() {
        Assertions.assertThat(words.getWords("pasword word word Helo"))
                .isEqualTo("pasword word word Helo");
    }

    @Test
    void task() {
        Assertions.assertThat(words.getWords("password wword word Heeeeeeello"))
                .isEqualTo("word");
    }
}
