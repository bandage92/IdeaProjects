package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GCDTest {

    @Test
    public void testSimpleCases() {
        assertEquals("6", GCD.findGCD(12, 18));    // НОД(12, 18) = 6
        assertEquals("4", GCD.findGCD(8, 12));     // НОД(8, 12) = 4
        assertEquals("1", GCD.findGCD(7, 13));     // НОД(7, 13) = 1 (взаимно простые числа)
    }

    @Test
    public void testLargerNumbers() {
        assertEquals("12", GCD.findGCD(48, 60));   // НОД(48, 60) = 12
        assertEquals("14", GCD.findGCD(42, 56));   // НОД(42, 56) = 14
        assertEquals("25", GCD.findGCD(75, 100));  // НОД(75, 100) = 25
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals("6", GCD.findGCD(-12, 18));   // НОД(|-12|, 18) = 6
        assertEquals("4", GCD.findGCD(8, -12));    // НОД(8, |-12|) = 4
        assertEquals("5", GCD.findGCD(-15, -25)); // НОД(|-15|, |-25|) = 5
    }

    @Test
    public void testWithZero() {
        assertEquals("Invalid number", GCD.findGCD(0, 5));
        assertEquals("Invalid number", GCD.findGCD(10, 0));
        assertEquals("Invalid number", GCD.findGCD(0, 0));
    }
}
