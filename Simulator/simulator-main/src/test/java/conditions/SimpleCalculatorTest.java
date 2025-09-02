package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {

    @Test
    public void testAddition() {
        assertEquals("4.00", SimpleCalculator.calculate(2, "+", 2));
        assertEquals("-1.00", SimpleCalculator.calculate(2, "+", -3));
    }

    @Test
    public void testSubtraction() {
        assertEquals("0.00", SimpleCalculator.calculate(2, "-", 2));
        assertEquals("5.00", SimpleCalculator.calculate(2, "-", -3));
    }

    @Test
    public void testMultiplication() {
        assertEquals("4.00", SimpleCalculator.calculate(2, "*", 2));
        assertEquals("-6.00", SimpleCalculator.calculate(2, "*", -3));
    }

    @Test
    public void testDivision() {
        assertEquals("1.00", SimpleCalculator.calculate(2, "/", 2));
        assertEquals("2.50", SimpleCalculator.calculate(5, "/", 2));
    }

    @Test
    public void testDivisionByZero() {
        assertEquals("Division by zero", SimpleCalculator.calculate(5, "/", 0));
    }

    @Test
    public void testUnknownOperation() {
        assertEquals("Unknown operation", SimpleCalculator.calculate(2, "%", 2));
    }
}
