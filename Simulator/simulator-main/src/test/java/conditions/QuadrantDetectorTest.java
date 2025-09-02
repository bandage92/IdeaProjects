package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class QuadrantDetectorTest {

    @Test
    public void testFirstQuadrant() {
        assertEquals("Quadrant 1", QuadrantDetector.detectQuadrant(1, 1));
        assertEquals("Quadrant 1", QuadrantDetector.detectQuadrant(5, 3));
        assertEquals("Quadrant 1", QuadrantDetector.detectQuadrant(10, 20));
    }

    @Test
    public void testSecondQuadrant() {
        assertEquals("Quadrant 2", QuadrantDetector.detectQuadrant(-1, 1));
        assertEquals("Quadrant 2", QuadrantDetector.detectQuadrant(-5, 3));
        assertEquals("Quadrant 2", QuadrantDetector.detectQuadrant(-10, 20));
    }

    @Test
    public void testThirdQuadrant() {
        assertEquals("Quadrant 3", QuadrantDetector.detectQuadrant(-1, -1));
        assertEquals("Quadrant 3", QuadrantDetector.detectQuadrant(-5, -3));
        assertEquals("Quadrant 3", QuadrantDetector.detectQuadrant(-10, -20));
    }

    @Test
    public void testFourthQuadrant() {
        assertEquals("Quadrant 4", QuadrantDetector.detectQuadrant(1, -1));
        assertEquals("Quadrant 4", QuadrantDetector.detectQuadrant(5, -3));
        assertEquals("Quadrant 4", QuadrantDetector.detectQuadrant(10, -20));
    }

    @Test
    public void testOnAxis() {
        assertEquals("On axis", QuadrantDetector.detectQuadrant(0, 5));
        assertEquals("On axis", QuadrantDetector.detectQuadrant(0, -5));
        assertEquals("On axis", QuadrantDetector.detectQuadrant(5, 0));
        assertEquals("On axis", QuadrantDetector.detectQuadrant(-5, 0));
    }

    @Test
    public void testOrigin() {
        assertEquals("Origin", QuadrantDetector.detectQuadrant(0, 0));
    }
}
