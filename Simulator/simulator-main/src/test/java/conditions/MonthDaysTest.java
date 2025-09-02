package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MonthDaysTest {

    @Test
    public void test31DayMonths() {
        assertEquals("31 days", MonthDays.getDaysInMonth(1, 2023));  // January
        assertEquals("31 days", MonthDays.getDaysInMonth(3, 2023));  // March
        assertEquals("31 days", MonthDays.getDaysInMonth(5, 2023));  // May
        assertEquals("31 days", MonthDays.getDaysInMonth(7, 2023));  // July
        assertEquals("31 days", MonthDays.getDaysInMonth(8, 2023));  // August
        assertEquals("31 days", MonthDays.getDaysInMonth(10, 2023)); // October
        assertEquals("31 days", MonthDays.getDaysInMonth(12, 2023)); // December
    }

    @Test
    public void test30DayMonths() {
        assertEquals("30 days", MonthDays.getDaysInMonth(4, 2023));  // April
        assertEquals("30 days", MonthDays.getDaysInMonth(6, 2023));  // June
        assertEquals("30 days", MonthDays.getDaysInMonth(9, 2023));  // September
        assertEquals("30 days", MonthDays.getDaysInMonth(11, 2023)); // November
    }

    @Test
    public void testFebruary() {
        assertEquals("28 days", MonthDays.getDaysInMonth(2, 2023)); // Non-leap year
        assertEquals("29 days", MonthDays.getDaysInMonth(2, 2024)); // Leap year
    }

    @Test
    public void testInvalidMonth() {
        assertEquals("Invalid month", MonthDays.getDaysInMonth(0, 2023));
        assertEquals("Invalid month", MonthDays.getDaysInMonth(13, 2023));
    }

    @Test
    public void testInvalidYear() {
        assertEquals("Invalid year", MonthDays.getDaysInMonth(1, -2023));
        assertEquals("Invalid year", MonthDays.getDaysInMonth(1, -1));
    }
}
