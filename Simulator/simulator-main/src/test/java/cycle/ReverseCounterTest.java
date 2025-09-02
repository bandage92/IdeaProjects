package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ReverseCounterTest {

    @Test
    public void testSmallNumbers() {
        assertEquals("1", ReverseCounter.countDown(1));
        assertEquals("2 1", ReverseCounter.countDown(2));
        assertEquals("3 2 1", ReverseCounter.countDown(3));
    }

    @Test
    public void testLargerNumbers() {
        assertEquals("5 4 3 2 1", ReverseCounter.countDown(5));
        assertEquals("10 9 8 7 6 5 4 3 2 1", ReverseCounter.countDown(10));
    }

    @Test
    public void testInvalidInput() {
        assertEquals("Invalid number", ReverseCounter.countDown(0));
        assertEquals("Invalid number", ReverseCounter.countDown(-1));
        assertEquals("Invalid number", ReverseCounter.countDown(-5));
    }
}
