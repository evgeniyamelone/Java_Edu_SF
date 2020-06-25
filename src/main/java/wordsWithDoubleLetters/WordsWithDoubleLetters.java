package wordsWithDoubleLetters;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsWithDoubleLetters {
    private static final String pattern = "\\w*(\\w+)\\1\\w*";

    public static String getWords(String text) {

        return text.replaceAll(pattern, "").trim();
    }
}
