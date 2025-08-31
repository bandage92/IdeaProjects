package data;

public enum CommandsData {

    ADD, LIST, EXIT;

    CommandsData() {
    }

    public static CommandsData parse(String input) {
        if(input == null || input.trim().isEmpty()) {
            return null;
        }

        String userInput = input.trim().toUpperCase();
        for(CommandsData command : CommandsData.values()) {
            if(command.name().equals(userInput)) {
                return command;
            }
        }
        return null;
    }
}