package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NumberCategoryTest {

    @Test
    public void testPositiveNumber() {
        assertEquals("Positive", NumberCategory.determineNumberCategory(5));
        assertEquals("Positive", NumberCategory.determineNumberCategory(100));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals("Negative", NumberCategory.determineNumberCategory(-3));
        assertEquals("Negative", NumberCategory.determineNumberCategory(-50));
    }

    @Test
    public void testZero() {
        assertEquals("Zero", NumberCategory.determineNumberCategory(0));
    }
}
