package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TrafficLightTest {

    @Test
    public void testRedToGreen() {
        assertEquals("red", TrafficLight.getNextColor("red", 119));     // Not enough time
        assertEquals("green", TrafficLight.getNextColor("red", 120));   // Exactly 2 minutes
        assertEquals("green", TrafficLight.getNextColor("red", 180));   // More than enough
    }

    @Test
    public void testGreenToYellow() {
        assertEquals("green", TrafficLight.getNextColor("green", 119)); // Not enough time
        assertEquals("yellow", TrafficLight.getNextColor("green", 120)); // Exactly 2 minutes
        assertEquals("yellow", TrafficLight.getNextColor("green", 180)); // More than enough
    }

    @Test
    public void testYellowToRed() {
        assertEquals("yellow", TrafficLight.getNextColor("yellow", 29)); // Not enough time
        assertEquals("red", TrafficLight.getNextColor("yellow", 30));    // Exactly 30 seconds
        assertEquals("red", TrafficLight.getNextColor("yellow", 60));    // More than enough
    }

    @Test
    public void testInvalidColor() {
        assertEquals("Invalid color", TrafficLight.getNextColor("blue", 120));
        assertEquals("Invalid color", TrafficLight.getNextColor("", 120));
    }

    @Test
    public void testInvalidTime() {
        assertEquals("Invalid time", TrafficLight.getNextColor("red", -1));
        assertEquals("Invalid time", TrafficLight.getNextColor("green", -60));
    }
}
