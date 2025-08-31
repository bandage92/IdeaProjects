package data;

public enum AnimalTypeData {

    CAT, DOG, DUCK;

    AnimalTypeData() {
    }

    public static boolean isAnimalTypeExist(String input) {
        if(input == null || input.trim().isEmpty()) {
            return false;
        }

        String userInput = input.trim().toUpperCase();
        for(AnimalTypeData animalType : AnimalTypeData.values()) {
            if(animalType.name().equals(userInput)) {
                return true;
            }
        }
        return false;
    }
}