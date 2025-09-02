package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DigitCounterTest {

    @Test
    public void testSingleDigit() {
        assertEquals("1", DigitCounter.countDigits(0));
        assertEquals("1", DigitCounter.countDigits(5));
        assertEquals("1", DigitCounter.countDigits(9));
    }

    @Test
    public void testMultipleDigits() {
        assertEquals("2", DigitCounter.countDigits(10));
        assertEquals("3", DigitCounter.countDigits(123));
        assertEquals("4", DigitCounter.countDigits(9876));
        assertEquals("5", DigitCounter.countDigits(12345));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals("2", DigitCounter.countDigits(-10));
        assertEquals("3", DigitCounter.countDigits(-123));
        assertEquals("4", DigitCounter.countDigits(-9876));
        assertEquals("5", DigitCounter.countDigits(-12345));
    }

    @Test
    public void testNumbersWithZeros() {
        assertEquals("3", DigitCounter.countDigits(100));
        assertEquals("4", DigitCounter.countDigits(1000));
        assertEquals("5", DigitCounter.countDigits(10000));
    }
}
