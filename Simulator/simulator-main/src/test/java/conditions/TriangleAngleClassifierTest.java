package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TriangleAngleClassifierTest {

    @Test
    public void testAcuteTriangles() {
        assertEquals("Acute triangle", TriangleAngleClassifier.classifyTriangle(60, 60, 60));
        assertEquals("Acute triangle", TriangleAngleClassifier.classifyTriangle(50, 60, 70));
        assertEquals("Acute triangle", TriangleAngleClassifier.classifyTriangle(45, 45, 90));
    }

    @Test
    public void testRightTriangles() {
        assertEquals("Right triangle", TriangleAngleClassifier.classifyTriangle(90, 45, 45));
        assertEquals("Right triangle", TriangleAngleClassifier.classifyTriangle(90, 30, 60));
        assertEquals("Right triangle", TriangleAngleClassifier.classifyTriangle(45, 90, 45));
    }

    @Test
    public void testObtuseTriangles() {
        assertEquals("Obtuse triangle", TriangleAngleClassifier.classifyTriangle(100, 40, 40));
        assertEquals("Obtuse triangle", TriangleAngleClassifier.classifyTriangle(120, 30, 30));
        assertEquals("Obtuse triangle", TriangleAngleClassifier.classifyTriangle(150, 15, 15));
    }

    @Test
    public void testInvalidAngles() {
        assertEquals("Invalid triangle", TriangleAngleClassifier.classifyTriangle(0, 90, 90));
        assertEquals("Invalid triangle", TriangleAngleClassifier.classifyTriangle(-60, 60, 60));
        assertEquals("Invalid triangle", TriangleAngleClassifier.classifyTriangle(60, 60, 70)); // сумма > 180
        assertEquals("Invalid triangle", TriangleAngleClassifier.classifyTriangle(90, 90, 90)); // сумма > 180
    }
}
