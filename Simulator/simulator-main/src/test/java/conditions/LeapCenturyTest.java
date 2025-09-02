package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LeapCenturyTest {

    @Test
    public void testLeapCenturies() {
        assertEquals("Leap century", LeapCentury.isLeapCentury(2000));
        assertEquals("Leap century", LeapCentury.isLeapCentury(2400));
        assertEquals("Leap century", LeapCentury.isLeapCentury(1600));
    }

    @Test
    public void testNonLeapCenturies() {
        assertEquals("Not leap century", LeapCentury.isLeapCentury(1900));
        assertEquals("Not leap century", LeapCentury.isLeapCentury(2100));
        assertEquals("Not leap century", LeapCentury.isLeapCentury(1700));
    }

    @Test
    public void testInvalidYears() {
        assertEquals("Invalid year", LeapCentury.isLeapCentury(2023));
        assertEquals("Invalid year", LeapCentury.isLeapCentury(-2000));
        assertEquals("Invalid year", LeapCentury.isLeapCentury(0));
    }
}
