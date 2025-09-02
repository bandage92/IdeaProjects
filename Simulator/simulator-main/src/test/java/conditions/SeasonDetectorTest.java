package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SeasonDetectorTest {

    @Test
    public void testWinter() {
        assertEquals("Winter", SeasonDetector.detectSeason(12));
        assertEquals("Winter", SeasonDetector.detectSeason(1));
        assertEquals("Winter", SeasonDetector.detectSeason(2));
    }

    @Test
    public void testSpring() {
        assertEquals("Spring", SeasonDetector.detectSeason(3));
        assertEquals("Spring", SeasonDetector.detectSeason(4));
        assertEquals("Spring", SeasonDetector.detectSeason(5));
    }

    @Test
    public void testSummer() {
        assertEquals("Summer", SeasonDetector.detectSeason(6));
        assertEquals("Summer", SeasonDetector.detectSeason(7));
        assertEquals("Summer", SeasonDetector.detectSeason(8));
    }

    @Test
    public void testAutumn() {
        assertEquals("Autumn", SeasonDetector.detectSeason(9));
        assertEquals("Autumn", SeasonDetector.detectSeason(10));
        assertEquals("Autumn", SeasonDetector.detectSeason(11));
    }

    @Test
    public void testInvalidMonth() {
        assertEquals("Invalid month", SeasonDetector.detectSeason(0));
        assertEquals("Invalid month", SeasonDetector.detectSeason(13));
    }
}
