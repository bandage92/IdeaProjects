package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FibonacciNumbersTest {

    @Test
    public void testSmallSequences() {
        assertEquals("0", FibonacciNumbers.generateFibonacci(1));
        assertEquals("0 1", FibonacciNumbers.generateFibonacci(2));
        assertEquals("0 1 1", FibonacciNumbers.generateFibonacci(3));
    }

    @Test
    public void testLargerSequences() {
        assertEquals("0 1 1 2 3", FibonacciNumbers.generateFibonacci(5));
        assertEquals("0 1 1 2 3 5 8 13", FibonacciNumbers.generateFibonacci(8));
        assertEquals("0 1 1 2 3 5 8 13 21 34", FibonacciNumbers.generateFibonacci(10));
    }

    @Test
    public void testInvalidInput() {
        assertEquals("Invalid number", FibonacciNumbers.generateFibonacci(0));
        assertEquals("Invalid number", FibonacciNumbers.generateFibonacci(-1));
        assertEquals("Invalid number", FibonacciNumbers.generateFibonacci(-5));
    }
}
