package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StarTriangleTest {

    @Test
    public void testSmallTriangle() {
        String expected = "*\n" +
                         "**\n" +
                         "***\n";
        assertEquals(expected, StarTriangle.drawTriangle(3));
    }

    @Test
    public void testLargerTriangle() {
        String expected = "*\n" +
                         "**\n" +
                         "***\n" +
                         "****\n" +
                         "*****\n";
        assertEquals(expected, StarTriangle.drawTriangle(5));
    }

    @Test
    public void testSingleLine() {
        assertEquals("*\n", StarTriangle.drawTriangle(1));
    }

    @Test
    public void testInvalidHeight() {
        assertEquals("Invalid height", StarTriangle.drawTriangle(0));
        assertEquals("Invalid height", StarTriangle.drawTriangle(-1));
        assertEquals("Invalid height", StarTriangle.drawTriangle(-5));
    }
}
