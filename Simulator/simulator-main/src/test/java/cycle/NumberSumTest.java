package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NumberSumTest {

    @Test
    public void testSmallNumbers() {
        assertEquals("1", NumberSum.calculateSum(1));
        assertEquals("3", NumberSum.calculateSum(2));
        assertEquals("6", NumberSum.calculateSum(3));
    }

    @Test
    public void testLargerNumbers() {
        assertEquals("15", NumberSum.calculateSum(5));
        assertEquals("55", NumberSum.calculateSum(10));
        assertEquals("5050", NumberSum.calculateSum(100));
    }

    @Test
    public void testInvalidInput() {
        assertEquals("Invalid number", NumberSum.calculateSum(-1));
        assertEquals("Invalid number", NumberSum.calculateSum(-10));
    }

    @Test
    public void testZero() {
        assertEquals("0", NumberSum.calculateSum(0));
    }
}
