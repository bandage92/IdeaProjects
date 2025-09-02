package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GradeConverterTest {

    @Test
    public void testExcellentGrade() {
        assertEquals("A", GradeConverter.convertGrade(5));
    }

    @Test
    public void testGoodGrade() {
        assertEquals("B", GradeConverter.convertGrade(4));
    }

    @Test
    public void testSatisfactoryGrade() {
        assertEquals("C", GradeConverter.convertGrade(3));
    }

    @Test
    public void testFailGrade() {
        assertEquals("F", GradeConverter.convertGrade(2));
    }

    @Test
    public void testInvalidGrade() {
        assertEquals("Invalid grade", GradeConverter.convertGrade(1));
        assertEquals("Invalid grade", GradeConverter.convertGrade(6));
    }
}
