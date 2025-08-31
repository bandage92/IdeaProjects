package tools;

public class StringsTools {

    public static boolean isValidName(String name) {
        return getNameErrorMessage(name) == null;
    }

    public static String getNameErrorMessage(String name) {
        if(name == null || name.isEmpty()) {
            return "Имя не должно быть пустым.";
        }
        if(name.length() > 20) {
            return "Имя не должно превышать 20 символов.";
        }
        return null;
    }
}