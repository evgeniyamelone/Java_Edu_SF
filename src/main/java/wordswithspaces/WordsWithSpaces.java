package wordswithspaces;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsWithSpaces {
    private static final Pattern PATTERN = Pattern.compile("\\w+");

    public static String getWords(String text) {
        Matcher matcher = PATTERN.matcher(text);
        List<String> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(text.substring(matcher.start(), matcher.end()));
        }
        return String.join(" ", list);
    }
}

