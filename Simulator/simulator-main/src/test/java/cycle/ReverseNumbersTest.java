package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ReverseNumbersTest {

    @Test
    public void testPrintReverseWithSmallNumber() {
        assertEquals("5 4 3 2 1", ReverseNumbers.reverseNumbers(5));
    }

    @Test
    public void testPrintReverseWithLargeNumber() {
        assertEquals("10 9 8 7 6 5 4 3 2 1", ReverseNumbers.reverseNumbers(10));
    }

    @Test
    public void testPrintReverseWithOne() {
        assertEquals("1", ReverseNumbers.reverseNumbers(1));
    }
}
