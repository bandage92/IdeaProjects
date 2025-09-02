package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DiscountCalculatorTest {

    @Test
    public void testNoDiscount() {
        assertEquals("No discount", DiscountCalculator.calculateDiscount(500));
        assertEquals("No discount", DiscountCalculator.calculateDiscount(999.99));
    }

    @Test
    public void testFivePercentDiscount() {
        assertEquals("5% discount", DiscountCalculator.calculateDiscount(1000));
        assertEquals("5% discount", DiscountCalculator.calculateDiscount(3000));
        assertEquals("5% discount", DiscountCalculator.calculateDiscount(4999.99));
    }

    @Test
    public void testTenPercentDiscount() {
        assertEquals("10% discount", DiscountCalculator.calculateDiscount(5000));
        assertEquals("10% discount", DiscountCalculator.calculateDiscount(7500));
        assertEquals("10% discount", DiscountCalculator.calculateDiscount(9999.99));
    }

    @Test
    public void testFifteenPercentDiscount() {
        assertEquals("15% discount", DiscountCalculator.calculateDiscount(10000));
        assertEquals("15% discount", DiscountCalculator.calculateDiscount(15000));
    }

    @Test
    public void testInvalidAmount() {
        assertEquals("Invalid amount", DiscountCalculator.calculateDiscount(-100));
        assertEquals("Invalid amount", DiscountCalculator.calculateDiscount(-1));
    }
}
