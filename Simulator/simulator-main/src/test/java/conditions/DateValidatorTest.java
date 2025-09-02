package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DateValidatorTest {

    @Test
    public void testValidDates() {
        assertEquals("Valid date", DateValidator.isValidDate(1, 1, 2023));
        assertEquals("Valid date", DateValidator.isValidDate(31, 12, 2023));
        assertEquals("Valid date", DateValidator.isValidDate(29, 2, 2020));  // високосный год
        assertEquals("Valid date", DateValidator.isValidDate(30, 4, 2023));
    }

    @Test
    public void testInvalidDays() {
        assertEquals("Invalid date", DateValidator.isValidDate(0, 1, 2023));
        assertEquals("Invalid date", DateValidator.isValidDate(32, 12, 2023));
        assertEquals("Invalid date", DateValidator.isValidDate(31, 4, 2023));
        assertEquals("Invalid date", DateValidator.isValidDate(29, 2, 2023)); // не високосный год
    }

    @Test
    public void testInvalidMonths() {
        assertEquals("Invalid date", DateValidator.isValidDate(1, 0, 2023));
        assertEquals("Invalid date", DateValidator.isValidDate(1, 13, 2023));
        assertEquals("Invalid date", DateValidator.isValidDate(31, 13, 2023));
    }

    @Test
    public void testInvalidYears() {
        assertEquals("Invalid date", DateValidator.isValidDate(1, 1, 0));
        assertEquals("Invalid date", DateValidator.isValidDate(1, 1, -2023));
    }

    @Test
    public void testMonthsWith30Days() {
        assertEquals("Valid date", DateValidator.isValidDate(30, 4, 2023));
        assertEquals("Valid date", DateValidator.isValidDate(30, 6, 2023));
        assertEquals("Valid date", DateValidator.isValidDate(30, 9, 2023));
        assertEquals("Valid date", DateValidator.isValidDate(30, 11, 2023));
        assertEquals("Invalid date", DateValidator.isValidDate(31, 4, 2023));
        assertEquals("Invalid date", DateValidator.isValidDate(31, 6, 2023));
        assertEquals("Invalid date", DateValidator.isValidDate(31, 9, 2023));
        assertEquals("Invalid date", DateValidator.isValidDate(31, 11, 2023));
    }
}
