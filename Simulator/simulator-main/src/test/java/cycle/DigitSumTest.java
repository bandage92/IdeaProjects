package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DigitSumTest {

    @Test
    public void testSingleDigit() {
        assertEquals("5", DigitSum.calculateDigitSum(5));
        assertEquals("9", DigitSum.calculateDigitSum(9));
        assertEquals("0", DigitSum.calculateDigitSum(0));
    }

    @Test
    public void testMultipleDigits() {
        assertEquals("6", DigitSum.calculateDigitSum(123));     // 1 + 2 + 3
        assertEquals("10", DigitSum.calculateDigitSum(1234));   // 1 + 2 + 3 + 4
        assertEquals("15", DigitSum.calculateDigitSum(12345));  // 1 + 2 + 3 + 4 + 5
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals("6", DigitSum.calculateDigitSum(-123));    // |-123| = 123 -> 1 + 2 + 3
        assertEquals("10", DigitSum.calculateDigitSum(-1234));  // |-1234| = 1234 -> 1 + 2 + 3 + 4
    }

    @Test
    public void testRepeatingDigits() {
        assertEquals("11", DigitSum.calculateDigitSum(992));    // 9 + 9 + 2
        assertEquals("3", DigitSum.calculateDigitSum(111));     // 1 + 1 + 1
    }
}
