package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NumberReverseTest {

    @Test
    public void testSingleDigit() {
        assertEquals("5", NumberReverse.reverseNumber(5));
        assertEquals("0", NumberReverse.reverseNumber(0));
        assertEquals("9", NumberReverse.reverseNumber(9));
    }

    @Test
    public void testMultipleDigits() {
        assertEquals("321", NumberReverse.reverseNumber(123));
        assertEquals("4321", NumberReverse.reverseNumber(1234));
        assertEquals("54321", NumberReverse.reverseNumber(12345));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals("-321", NumberReverse.reverseNumber(-123));
        assertEquals("-4321", NumberReverse.reverseNumber(-1234));
        assertEquals("-54321", NumberReverse.reverseNumber(-12345));
    }

    @Test
    public void testNumbersWithZeros() {
        assertEquals("21", NumberReverse.reverseNumber(120));    // Убираем незначащие нули
        assertEquals("1", NumberReverse.reverseNumber(100));
        assertEquals("-21", NumberReverse.reverseNumber(-120));
    }
}
