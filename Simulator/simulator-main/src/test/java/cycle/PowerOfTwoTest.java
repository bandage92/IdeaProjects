package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PowerOfTwoTest {

    @Test
    public void testZeroPower() {
        assertEquals("1", PowerOfTwo.calculatePower(0));  // 2^0 = 1
    }

    @Test
    public void testSmallPowers() {
        assertEquals("2", PowerOfTwo.calculatePower(1));   // 2^1 = 2
        assertEquals("4", PowerOfTwo.calculatePower(2));   // 2^2 = 4
        assertEquals("8", PowerOfTwo.calculatePower(3));   // 2^3 = 8
        assertEquals("16", PowerOfTwo.calculatePower(4));  // 2^4 = 16
    }

    @Test
    public void testLargerPowers() {
        assertEquals("32", PowerOfTwo.calculatePower(5));    // 2^5 = 32
        assertEquals("64", PowerOfTwo.calculatePower(6));    // 2^6 = 64
        assertEquals("128", PowerOfTwo.calculatePower(7));   // 2^7 = 128
        assertEquals("256", PowerOfTwo.calculatePower(8));   // 2^8 = 256
        assertEquals("1024", PowerOfTwo.calculatePower(10)); // 2^10 = 1024
    }

    @Test
    public void testInvalidInput() {
        assertEquals("Invalid number", PowerOfTwo.calculatePower(-1));
        assertEquals("Invalid number", PowerOfTwo.calculatePower(-5));
    }
}
