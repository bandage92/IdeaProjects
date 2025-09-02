package cycle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {

    @Test
    public void testEmptyString() {
        Assertions.assertEquals("", ReverseString.reverseString(""));
    }

    @Test
    public void testSingleCharacter() {
        Assertions.assertEquals("a", ReverseString.reverseString("a"));
    }

    @Test
    public void testNormalString() {
        Assertions.assertEquals("cba", ReverseString.reverseString("abc"));
    }

    @Test
    public void testPalindrome() {
        Assertions.assertEquals("madam", ReverseString.reverseString("madam"));
    }
}