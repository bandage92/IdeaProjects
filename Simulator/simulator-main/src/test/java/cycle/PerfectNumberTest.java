package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PerfectNumberTest {

    @Test
    public void testPerfectNumbers() {
        assertEquals("Perfect number", PerfectNumber.isPerfectNumber(6));   // 1 + 2 + 3
        assertEquals("Perfect number", PerfectNumber.isPerfectNumber(28));  // 1 + 2 + 4 + 7 + 14
        assertEquals("Perfect number", PerfectNumber.isPerfectNumber(496)); // 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248
    }

    @Test
    public void testNonPerfectNumbers() {
        assertEquals("Not perfect number", PerfectNumber.isPerfectNumber(10));
        assertEquals("Not perfect number", PerfectNumber.isPerfectNumber(15));
        assertEquals("Not perfect number", PerfectNumber.isPerfectNumber(100));
    }

    @Test
    public void testInvalidNumbers() {
        assertEquals("Invalid number", PerfectNumber.isPerfectNumber(0));
        assertEquals("Invalid number", PerfectNumber.isPerfectNumber(-6));
        assertEquals("Invalid number", PerfectNumber.isPerfectNumber(-28));
    }
}
