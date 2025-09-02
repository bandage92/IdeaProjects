package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PasswordStrengthTest {

    @Test
    public void testWeakPassword() {
        assertEquals("Weak", PasswordStrength.checkPasswordStrength("pass"));
        assertEquals("Weak", PasswordStrength.checkPasswordStrength("1234567"));
        assertEquals("Weak", PasswordStrength.checkPasswordStrength("abcd"));
    }

    @Test
    public void testMediumPassword() {
        assertEquals("Medium", PasswordStrength.checkPasswordStrength("password123"));
        assertEquals("Medium", PasswordStrength.checkPasswordStrength("12345678"));
        assertEquals("Medium", PasswordStrength.checkPasswordStrength("abcdefghi"));
    }

    @Test
    public void testStrongPassword() {
        assertEquals("Strong", PasswordStrength.checkPasswordStrength("Pass1234"));
        assertEquals("Strong", PasswordStrength.checkPasswordStrength("MyPassword123"));
        assertEquals("Strong", PasswordStrength.checkPasswordStrength("1234abcd"));
    }
}
