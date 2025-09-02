package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaxDigitTest {

    @Test
    public void testSingleDigit() {
        assertEquals("0", MaxDigit.findMaxDigit(0));
        assertEquals("5", MaxDigit.findMaxDigit(5));
        assertEquals("9", MaxDigit.findMaxDigit(9));
    }

    @Test
    public void testMultipleDigits() {
        assertEquals("3", MaxDigit.findMaxDigit(123));
        assertEquals("9", MaxDigit.findMaxDigit(9735));
        assertEquals("8", MaxDigit.findMaxDigit(12845));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals("3", MaxDigit.findMaxDigit(-123));
        assertEquals("9", MaxDigit.findMaxDigit(-9735));
        assertEquals("8", MaxDigit.findMaxDigit(-12845));
    }

    @Test
    public void testRepeatingDigits() {
        assertEquals("5", MaxDigit.findMaxDigit(555));
        assertEquals("9", MaxDigit.findMaxDigit(999999));
        assertEquals("8", MaxDigit.findMaxDigit(181818));
    }
}
