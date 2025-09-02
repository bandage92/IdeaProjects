package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AgeClassifierTest {

    @Test
    public void testInfant() {
        assertEquals("Infant", AgeClassifier.classifyAge(0));
        assertEquals("Infant", AgeClassifier.classifyAge(1));
        assertEquals("Infant", AgeClassifier.classifyAge(2));
    }

    @Test
    public void testChild() {
        assertEquals("Child", AgeClassifier.classifyAge(3));
        assertEquals("Child", AgeClassifier.classifyAge(7));
        assertEquals("Child", AgeClassifier.classifyAge(12));
    }

    @Test
    public void testTeen() {
        assertEquals("Teen", AgeClassifier.classifyAge(13));
        assertEquals("Teen", AgeClassifier.classifyAge(16));
        assertEquals("Teen", AgeClassifier.classifyAge(19));
    }

    @Test
    public void testAdult() {
        assertEquals("Adult", AgeClassifier.classifyAge(20));
        assertEquals("Adult", AgeClassifier.classifyAge(40));
        assertEquals("Adult", AgeClassifier.classifyAge(65));
    }

    @Test
    public void testSenior() {
        assertEquals("Senior", AgeClassifier.classifyAge(66));
        assertEquals("Senior", AgeClassifier.classifyAge(80));
    }

    @Test
    public void testInvalidAge() {
        assertEquals("Invalid age", AgeClassifier.classifyAge(-1));
        assertEquals("Invalid age", AgeClassifier.classifyAge(-10));
    }

    public static class AgeClassifier {

        public static String classifyAge(int age) {
            if (age < 0) {
                return "Invalid age";
            } else if (age <= 2) {
                return "Infant";
            } else if (age <= 12) {
                return "Child";
            } else if (age <= 19) {
                return "Teen";
            } else if (age <= 65) {
                return "Adult";
            } else {
                return "Senior";
            }
        }
    }
}