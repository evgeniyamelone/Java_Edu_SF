package wordsWithDoubleLetters;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsWithDoubleLetters {
    private static final Pattern pattern = Pattern.compile("\\b(?:(?!\\w*(\\w)\\1\\w*)\\w)+\\b");

    public static String getWords(String text) {
        Matcher matcher = pattern.matcher(text);
        List<String> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(text.substring(matcher.start(), matcher.end()));
        }
        return String.join(" ", list);
    }
}
