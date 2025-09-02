package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PhoneValidatorTest {

    @Test
    public void testValidRussianNumbers() {
        assertEquals("Valid Russian number", PhoneValidator.validatePhone("+79123456789"));
        assertEquals("Valid Russian number", PhoneValidator.validatePhone("89123456789"));
    }

    @Test
    public void testValidUSNumbers() {
        assertEquals("Valid US number", PhoneValidator.validatePhone("+12345678901"));
    }

    @Test
    public void testInvalidNumbers() {
        assertEquals("Invalid number", PhoneValidator.validatePhone("123456"));
        assertEquals("Invalid number", PhoneValidator.validatePhone("+7912345"));
        assertEquals("Invalid number", PhoneValidator.validatePhone("+375123456789")); // Belarus
    }
}
