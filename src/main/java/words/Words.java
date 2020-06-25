package words;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Words {
    private static Pattern pattern = Pattern.compile("\\b[A-Z]\\S+|\\b[A-Z]");

    public static List<String> getWords(String text) {
        Matcher matcher = pattern.matcher(text);
        List<String> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(text.substring(matcher.start(), matcher.end()));
        }
        return list;
    }
}

