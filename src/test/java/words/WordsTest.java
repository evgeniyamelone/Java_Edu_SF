package words;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordsTest {

    private final Words words = new Words();

    @Test
    void singleWord() {
        Assertions.assertThat(words.getWords("Word")).isEqualTo(List.of("Word"));
    }

    @Test
    void singleWord_Negative() {
        Assertions.assertThat(words.getWords("Word")).isNotEqualTo(List.of("word"));
    }

    @Test
    void wordsStartingWithLowerCase_Ignored(){
        Assertions.assertThat(words.getWords("word Cat data")).isEqualTo(List.of("Cat"));
    }

    @Test
    void wordsSingleLetter(){
        Assertions.assertThat(words.getWords("Word cAT data A site java tExt")).isEqualTo(List.of("Word", "A"));
    }

    @Test
    void task() {
        Assertions.assertThat(words.getWords("Word cAT DATA A site Java tExt")).isEqualTo(List.of("Word", "DATA", "A", "Java"));
    }
}