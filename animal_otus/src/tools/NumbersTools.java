package tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersTools {

    public static boolean isNumber (String numberStr) {
        Pattern pattern = Pattern.compile("^(?:[1-9]|[1-9]\\d|[1-4]\\d\\d|500)$");
        Matcher matcher = pattern.matcher(numberStr);

        return matcher.find();
    }
}