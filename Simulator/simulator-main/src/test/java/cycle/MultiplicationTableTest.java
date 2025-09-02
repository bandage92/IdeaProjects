package cycle;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

public class MultiplicationTableTest {

    @Test
    public void testPrintMultiplicationTable() {
        List<String> expectedOutput = List.of(
            "3 x 1 = 3",
            "3 x 2 = 6",
            "3 x 3 = 9",
            "3 x 4 = 12",
            "3 x 5 = 15",
            "3 x 6 = 18",
            "3 x 7 = 21",
            "3 x 8 = 24",
            "3 x 9 = 27",
            "3 x 10 = 30"
        );

        assertEquals(expectedOutput, MultiplicationTable.printMultiplicationTable(3));
    }

    @Test
    public void testPrintMultiplicationTableWithSmallNumber() {
        List<String> expectedOutput = List.of(
            "2 x 1 = 2",
            "2 x 2 = 4",
            "2 x 3 = 6",
            "2 x 4 = 8",
            "2 x 5 = 10",
            "2 x 6 = 12",
            "2 x 7 = 14",
            "2 x 8 = 16",
            "2 x 9 = 18",
            "2 x 10 = 20"
        );

        assertEquals(expectedOutput, MultiplicationTable.printMultiplicationTable(2));
    }
}
