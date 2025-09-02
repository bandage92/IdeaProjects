package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SeriesSumTest {

    @Test
    public void testSmallNumbers() {
        assertEquals("1.000", SeriesSum.calculateSeriesSum(1));  // 1
        assertEquals("1.500", SeriesSum.calculateSeriesSum(2));  // 1 + 1/2
        assertEquals("1.833", SeriesSum.calculateSeriesSum(3));  // 1 + 1/2 + 1/3
    }

    @Test
    public void testLargerNumbers() {
        assertEquals("2.083", SeriesSum.calculateSeriesSum(4));  // 1 + 1/2 + 1/3 + 1/4
        assertEquals("2.283", SeriesSum.calculateSeriesSum(5));  // 1 + 1/2 + 1/3 + 1/4 + 1/5
        assertEquals("2.929", SeriesSum.calculateSeriesSum(10)); // 1 + 1/2 + ... + 1/10
    }

    @Test
    public void testInvalidInput() {
        assertEquals("Invalid number", SeriesSum.calculateSeriesSum(0));
        assertEquals("Invalid number", SeriesSum.calculateSeriesSum(-1));
        assertEquals("Invalid number", SeriesSum.calculateSeriesSum(-5));
    }
}
