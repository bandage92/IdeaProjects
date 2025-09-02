package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MultiplicationTableForNumberTest {

    @Test
    public void testPositiveNumber() {
        String expected = "5 x 1 = 5\n" +
                         "5 x 2 = 10\n" +
                         "5 x 3 = 15\n" +
                         "5 x 4 = 20\n" +
                         "5 x 5 = 25\n" +
                         "5 x 6 = 30\n" +
                         "5 x 7 = 35\n" +
                         "5 x 8 = 40\n" +
                         "5 x 9 = 45\n" +
                         "5 x 10 = 50\n";
        assertEquals(expected, MultiplicationTableForNumber.generateTable(5));
    }

    @Test
    public void testNegativeNumber() {
        String expected = "3 x 1 = 3\n" +
                         "3 x 2 = 6\n" +
                         "3 x 3 = 9\n" +
                         "3 x 4 = 12\n" +
                         "3 x 5 = 15\n" +
                         "3 x 6 = 18\n" +
                         "3 x 7 = 21\n" +
                         "3 x 8 = 24\n" +
                         "3 x 9 = 27\n" +
                         "3 x 10 = 30\n";
        assertEquals(expected, MultiplicationTableForNumber.generateTable(-3));
    }

    @Test
    public void testZero() {
        assertEquals("Invalid number", MultiplicationTableForNumber.generateTable(0));
    }
}
