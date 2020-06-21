package words;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Words {
    public static String matches(String regex, String text) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            String result = "";
            while (matcher.find()) {
                result = result + text.substring(matcher.start(), matcher.end())+" ";
            }
            return result.trim();
        }
    }

