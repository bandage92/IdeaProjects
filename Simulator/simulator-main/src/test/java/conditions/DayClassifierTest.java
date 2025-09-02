package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DayClassifierTest {

    @Test
    public void testWeekdays() {
        assertEquals("Weekday", DayClassifier.classifyDay(1));
        assertEquals("Weekday", DayClassifier.classifyDay(2));
        assertEquals("Weekday", DayClassifier.classifyDay(3));
        assertEquals("Weekday", DayClassifier.classifyDay(4));
        assertEquals("Weekday", DayClassifier.classifyDay(5));
    }

    @Test
    public void testWeekend() {
        assertEquals("Weekend", DayClassifier.classifyDay(6));
        assertEquals("Weekend", DayClassifier.classifyDay(7));
    }

    @Test
    public void testInvalidDay() {
        assertEquals("Invalid day", DayClassifier.classifyDay(0));
        assertEquals("Invalid day", DayClassifier.classifyDay(8));
        assertEquals("Invalid day", DayClassifier.classifyDay(-1));
    }
}
