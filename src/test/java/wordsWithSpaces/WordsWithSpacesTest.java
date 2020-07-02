package wordsWithSpaces;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class WordsWithSpacesTest {
    private final WordsWithSpaces words = new WordsWithSpaces();

    @Test
    void spaceAfterWord() {
        Assertions.assertThat(words.getWords("Word  "))
                .isEqualTo("Word");
    }

    @Test
    void spaceBeforeWord() {
        Assertions.assertThat(words.getWords("  Word"))
                .isEqualTo("Word");
    }

    @Test
    void spaceAfterLetter() {
        Assertions.assertThat(words.getWords("W  "))
                .isEqualTo("W");
    }

    @Test
    void spaceBeforeLetter() {
        Assertions.assertThat(words.getWords("  W"))
                .isEqualTo("W");
    }

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
    void task() {
        Assertions.assertThat(words.getWords(" Removing        Extra Spaces       Between Words in  the             text  "))
                .isEqualTo("Removing Extra Spaces Between Words in the text");
    }
}