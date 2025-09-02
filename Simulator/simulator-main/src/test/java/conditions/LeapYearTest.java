package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LeapYearTest {

    @Test
    public void testLeapYear() {
        assertEquals("Leap year", LeapYear.isLeapYear(2000));
        assertEquals("Leap year", LeapYear.isLeapYear(2004));
        assertEquals("Leap year", LeapYear.isLeapYear(2400));
    }

    @Test
    public void testNonLeapYear() {
        assertEquals("Not a leap year", LeapYear.isLeapYear(2001));
        assertEquals("Not a leap year", LeapYear.isLeapYear(2100));
        assertEquals("Not a leap year", LeapYear.isLeapYear(1900));
    }

    @Test
    public void testInvalidYear() {
        assertEquals("Invalid year", LeapYear.isLeapYear(-2000));
        assertEquals("Invalid year", LeapYear.isLeapYear(-1));
    }
}
