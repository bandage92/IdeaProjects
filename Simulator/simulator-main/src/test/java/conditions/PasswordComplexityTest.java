package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PasswordComplexityTest {

    @Test
    public void testWeakPasswords() {
        assertEquals("Weak password", PasswordComplexity.evaluatePassword("pass"));  // только строчные, короткий
        assertEquals("Weak password", PasswordComplexity.evaluatePassword("12345")); // только цифры, короткий
        assertEquals("Weak password", PasswordComplexity.evaluatePassword("abcdefgh")); // длинный, но только строчные
    }

    @Test
    public void testMediumPasswords() {
        assertEquals("Medium password", PasswordComplexity.evaluatePassword("Password123")); // заглавные, строчные, цифры
        assertEquals("Medium password", PasswordComplexity.evaluatePassword("abcd1234")); // строчные и цифры, длинный
        assertEquals("Medium password", PasswordComplexity.evaluatePassword("Pass word")); // заглавные и строчные, длинный
    }

    @Test
    public void testStrongPasswords() {
        assertEquals("Strong password", PasswordComplexity.evaluatePassword("P@ssw0rd")); // все типы символов
        assertEquals("Strong password", PasswordComplexity.evaluatePassword("Str0ng!Pass")); // все типы символов
        assertEquals("Strong password", PasswordComplexity.evaluatePassword("C0mpl#x1ty")); // все типы символов
    }

    @Test
    public void testInvalidPasswords() {
        assertEquals("Invalid password", PasswordComplexity.evaluatePassword(""));
        assertEquals("Invalid password", PasswordComplexity.evaluatePassword(" "));
        assertEquals("Invalid password", PasswordComplexity.evaluatePassword("\n"));
    }
}
