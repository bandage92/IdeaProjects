package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DivisorsTest {

    @Test
    public void testSimpleNumbers() {
        assertEquals("1 2 3 4 6 12", Divisors.findDivisors(12));
        assertEquals("1 2 4 8", Divisors.findDivisors(8));
        assertEquals("1 3 5 15", Divisors.findDivisors(15));
    }

    @Test
    public void testPrimeNumbers() {
        assertEquals("1 2", Divisors.findDivisors(2));
        assertEquals("1 3", Divisors.findDivisors(3));
        assertEquals("1 5", Divisors.findDivisors(5));
        assertEquals("1 7", Divisors.findDivisors(7));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals("1 2 3 4 6 12", Divisors.findDivisors(-12));
        assertEquals("1 2 4 8", Divisors.findDivisors(-8));
    }

    @Test
    public void testSpecialCases() {
        assertEquals("1", Divisors.findDivisors(1));
        assertEquals("Invalid number", Divisors.findDivisors(0));
    }
}
