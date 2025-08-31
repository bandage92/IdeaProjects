package data;

public enum ColorData {

    WHITE ("белый"),
    FOXY ("рыжий"),
    CREAM ("кремовый"),
    CHOCOLATE ("шоколадный");

    private final String name;

    ColorData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static ColorData getRussianColor(String input) {
        if(input == null || input.trim().isEmpty()) {
            return null;
        }

        String userInput = input.trim().toLowerCase();
        for(ColorData color : ColorData.values()) {
            if(color.getName().equals(userInput)) {
                return color;
            }
        }
        return null;
        }
    }