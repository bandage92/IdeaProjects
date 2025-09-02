package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DigitSortTest {

    @Test
    public void testAlreadySorted() {
        assertEquals("123", DigitSort.sortDigits(123));
        assertEquals("1234", DigitSort.sortDigits(1234));
        assertEquals("12345", DigitSort.sortDigits(12345));
    }

    @Test
    public void testReverseSorted() {
        assertEquals("123", DigitSort.sortDigits(321));
        assertEquals("1234", DigitSort.sortDigits(4321));
        assertEquals("12345", DigitSort.sortDigits(54321));
    }

    @Test
    public void testRandomOrder() {
        assertEquals("123", DigitSort.sortDigits(231));
        assertEquals("1234", DigitSort.sortDigits(2413));
        assertEquals("12345", DigitSort.sortDigits(32514));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals("123", DigitSort.sortDigits(-321));
        assertEquals("1234", DigitSort.sortDigits(-4321));
        assertEquals("12345", DigitSort.sortDigits(-54321));
    }

    @Test
    public void testRepeatingDigits() {
        assertEquals("111", DigitSort.sortDigits(111));
        assertEquals("122", DigitSort.sortDigits(221));
        assertEquals("1123", DigitSort.sortDigits(3211));
    }

    @Test
    public void testSingleDigit() {
        assertEquals("0", DigitSort.sortDigits(0));
        assertEquals("5", DigitSort.sortDigits(5));
        assertEquals("9", DigitSort.sortDigits(9));
    }
}
