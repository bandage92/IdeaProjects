package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArmstrongNumberTest {

    @Test
    public void testArmstrongNumbers() {
        assertEquals("Armstrong number", ArmstrongNumber.isArmstrongNumber(0));    // 0 = 0¹
        assertEquals("Armstrong number", ArmstrongNumber.isArmstrongNumber(1));    // 1 = 1¹
        assertEquals("Armstrong number", ArmstrongNumber.isArmstrongNumber(153));  // 1³ + 5³ + 3³
        assertEquals("Armstrong number", ArmstrongNumber.isArmstrongNumber(370));  // 3³ + 7³ + 0³
        assertEquals("Armstrong number", ArmstrongNumber.isArmstrongNumber(407));  // 4³ + 0³ + 7³
    }

    @Test
    public void testNonArmstrongNumbers() {
        assertEquals("Not Armstrong number", ArmstrongNumber.isArmstrongNumber(10));
        assertEquals("Not Armstrong number", ArmstrongNumber.isArmstrongNumber(100));
        assertEquals("Not Armstrong number", ArmstrongNumber.isArmstrongNumber(123));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals("Armstrong number", ArmstrongNumber.isArmstrongNumber(-153)); // |153|
        assertEquals("Armstrong number", ArmstrongNumber.isArmstrongNumber(-370)); // |370|
        assertEquals("Not Armstrong number", ArmstrongNumber.isArmstrongNumber(-123));
    }
}
