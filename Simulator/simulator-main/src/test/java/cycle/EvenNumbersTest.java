package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EvenNumbersTest {

    @Test
    public void testPrintEvenNumbers() {
        StringBuilder expectedOutput = new StringBuilder();
        for (int i = 2; i <= 10; i += 2) {
            expectedOutput.append(i).append(" ");
        }
        assertEquals(expectedOutput.toString().trim(), EvenNumbers.printEvenNumbersToString(10));
    }

    @Test
    public void testPrintEvenNumbersWithSmallNumber() {
        StringBuilder expectedOutput = new StringBuilder();
        for (int i = 2; i <= 4; i += 2) {
            expectedOutput.append(i).append(" ");
        }
        assertEquals(expectedOutput.toString().trim(), EvenNumbers.printEvenNumbersToString(4));
    }

    @Test
    public void testPrintEvenNumbersWithOddNumber() {
        StringBuilder expectedOutput = new StringBuilder();
        for (int i = 2; i <= 9; i += 2) {
            expectedOutput.append(i).append(" ");
        }
        assertEquals(expectedOutput.toString().trim(), EvenNumbers.printEvenNumbersToString(9));
    }
}
