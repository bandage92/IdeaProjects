package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LuckyNumberTest {

    @Test
    public void testLuckyNumbers() {
        assertEquals("Lucky number", LuckyNumber.isLuckyNumber(123321));   // 1+2+3 = 3+2+1
        assertEquals("Lucky number", LuckyNumber.isLuckyNumber(100001));   // 1+0+0 = 0+0+1
        assertEquals("Lucky number", LuckyNumber.isLuckyNumber(999999));   // 9+9+9 = 9+9+9
    }

    @Test
    public void testNotLuckyNumbers() {
        assertEquals("Not lucky number", LuckyNumber.isLuckyNumber(123456)); // 1+2+3 != 4+5+6
        assertEquals("Not lucky number", LuckyNumber.isLuckyNumber(111222)); // 1+1+1 != 2+2+2
        assertEquals("Not lucky number", LuckyNumber.isLuckyNumber(100100)); // 1+0+0 != 1+0+0
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals("Lucky number", LuckyNumber.isLuckyNumber(-123321));    // |-123321|
        assertEquals("Not lucky number", LuckyNumber.isLuckyNumber(-123456)); // |-123456|
    }

    @Test
    public void testInvalidNumbers() {
        assertEquals("Invalid number", LuckyNumber.isLuckyNumber(12345));    // 5 цифр
        assertEquals("Invalid number", LuckyNumber.isLuckyNumber(1234567));  // 7 цифр
        assertEquals("Invalid number", LuckyNumber.isLuckyNumber(0));        // 1 цифра
    }
}
