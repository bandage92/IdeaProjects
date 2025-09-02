package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CharacterClassifierTest {

    @Test
    public void testUppercaseLetters() {
        assertEquals("Uppercase letter", CharacterClassifier.classifyCharacter('A'));
        assertEquals("Uppercase letter", CharacterClassifier.classifyCharacter('M'));
        assertEquals("Uppercase letter", CharacterClassifier.classifyCharacter('Z'));
    }

    @Test
    public void testLowercaseLetters() {
        assertEquals("Lowercase letter", CharacterClassifier.classifyCharacter('a'));
        assertEquals("Lowercase letter", CharacterClassifier.classifyCharacter('m'));
        assertEquals("Lowercase letter", CharacterClassifier.classifyCharacter('z'));
    }

    @Test
    public void testDigits() {
        assertEquals("Digit", CharacterClassifier.classifyCharacter('0'));
        assertEquals("Digit", CharacterClassifier.classifyCharacter('5'));
        assertEquals("Digit", CharacterClassifier.classifyCharacter('9'));
    }

    @Test
    public void testSpecialCharacters() {
        assertEquals("Special character", CharacterClassifier.classifyCharacter('!'));
        assertEquals("Special character", CharacterClassifier.classifyCharacter('@'));
        assertEquals("Special character", CharacterClassifier.classifyCharacter('#'));
        assertEquals("Special character", CharacterClassifier.classifyCharacter(' '));
        assertEquals("Special character", CharacterClassifier.classifyCharacter('\n'));
    }

    public static class CharacterClassifier {

        public static String classifyCharacter(char c) {
            if (Character.isUpperCase(c)) {
                return "Uppercase letter";
            } else if (Character.isLowerCase(c)) {
                return "Lowercase letter";
            } else if (Character.isDigit(c)) {
                return "Digit";
            } else {
                return "Special character";
            }
        }
    }
}