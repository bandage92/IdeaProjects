package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SquareSumTest {

    @Test
    public void testSmallNumbers() {
        assertEquals("1", SquareSum.calculateSquareSum(1));    // 1² = 1
        assertEquals("5", SquareSum.calculateSquareSum(2));    // 1² + 2² = 1 + 4 = 5
        assertEquals("14", SquareSum.calculateSquareSum(3));   // 1² + 2² + 3² = 1 + 4 + 9 = 14
    }

    @Test
    public void testLargerNumbers() {
        assertEquals("30", SquareSum.calculateSquareSum(4));   // 1² + 2² + 3² + 4² = 1 + 4 + 9 + 16 = 30
        assertEquals("55", SquareSum.calculateSquareSum(5));   // 1² + 2² + 3² + 4² + 5² = 1 + 4 + 9 + 16 + 25 = 55
        assertEquals("385", SquareSum.calculateSquareSum(10)); // 1² + 2² + ... + 10² = 385
    }

    @Test
    public void testZero() {
        assertEquals("0", SquareSum.calculateSquareSum(0));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals("Invalid number", SquareSum.calculateSquareSum(-1));
        assertEquals("Invalid number", SquareSum.calculateSquareSum(-5));
        assertEquals("Invalid number", SquareSum.calculateSquareSum(-10));
    }
}
