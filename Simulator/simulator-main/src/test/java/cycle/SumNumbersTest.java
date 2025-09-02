package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SumNumbersTest {

    @Test
    public void testCalculateSumWithSmallNumber() {
        assertEquals(15, SumNumbers.sumNumbers(5));
    }

    @Test
    public void testCalculateSumWithZero() {
        assertEquals(0, SumNumbers.sumNumbers(0));
    }

    @Test
    public void testCalculateSumWithLargeNumber() {
        assertEquals(5050, SumNumbers.sumNumbers(100));
    }
}
