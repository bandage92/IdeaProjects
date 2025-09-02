package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TimeOfDayTest {

    @Test
    public void testMorning() {
        assertEquals("Morning", TimeOfDay.getTimeOfDay(5));
        assertEquals("Morning", TimeOfDay.getTimeOfDay(8));
        assertEquals("Morning", TimeOfDay.getTimeOfDay(11));
    }

    @Test
    public void testAfternoon() {
        assertEquals("Afternoon", TimeOfDay.getTimeOfDay(12));
        assertEquals("Afternoon", TimeOfDay.getTimeOfDay(14));
        assertEquals("Afternoon", TimeOfDay.getTimeOfDay(16));
    }

    @Test
    public void testEvening() {
        assertEquals("Evening", TimeOfDay.getTimeOfDay(17));
        assertEquals("Evening", TimeOfDay.getTimeOfDay(19));
        assertEquals("Evening", TimeOfDay.getTimeOfDay(21));
    }

    @Test
    public void testNight() {
        assertEquals("Night", TimeOfDay.getTimeOfDay(22));
        assertEquals("Night", TimeOfDay.getTimeOfDay(0));
        assertEquals("Night", TimeOfDay.getTimeOfDay(4));
    }

    @Test
    public void testInvalidHour() {
        assertEquals("Invalid hour", TimeOfDay.getTimeOfDay(-1));
        assertEquals("Invalid hour", TimeOfDay.getTimeOfDay(24));
    }
}
