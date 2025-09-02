package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FactorialCalculatorTest {

    @Test
    public void testSmallNumbers() {
        assertEquals("1", FactorialCalculator.calculateFactorial(1));
        assertEquals("2", FactorialCalculator.calculateFactorial(2));
        assertEquals("6", FactorialCalculator.calculateFactorial(3));
        assertEquals("24", FactorialCalculator.calculateFactorial(4));
    }

    @Test
    public void testLargerNumbers() {
        assertEquals("120", FactorialCalculator.calculateFactorial(5));
        assertEquals("3628800", FactorialCalculator.calculateFactorial(10));
    }

    @Test
    public void testZero() {
        assertEquals("1", FactorialCalculator.calculateFactorial(0));
    }

    @Test
    public void testInvalidInput() {
        assertEquals("Invalid number", FactorialCalculator.calculateFactorial(-1));
        assertEquals("Invalid number", FactorialCalculator.calculateFactorial(-5));
    }
}
