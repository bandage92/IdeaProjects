package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EmailValidatorTest {

    @Test
    public void testValidEmails() {
        assertEquals("Valid email", EmailValidator.validateEmail("user@domain.com"));
        assertEquals("Valid email", EmailValidator.validateEmail("test.user@domain.com"));
        assertEquals("Valid email", EmailValidator.validateEmail("user@sub.domain.com"));
    }

    @Test
    public void testEmailsWithoutAt() {
        assertEquals("Invalid email", EmailValidator.validateEmail("userdomain.com"));
        assertEquals("Invalid email", EmailValidator.validateEmail("user.domain.com"));
    }

    @Test
    public void testEmailsWithoutDot() {
        assertEquals("Invalid email", EmailValidator.validateEmail("user@domaincom"));
        assertEquals("Invalid email", EmailValidator.validateEmail("user@domain"));
    }

    @Test
    public void testEmailsStartingWithInvalidChars() {
        assertEquals("Invalid email", EmailValidator.validateEmail("@user@domain.com"));
        assertEquals("Invalid email", EmailValidator.validateEmail(".user@domain.com"));
    }

    @Test
    public void testEmailsEndingWithInvalidChars() {
        assertEquals("Invalid email", EmailValidator.validateEmail("user@domain.com@"));
        assertEquals("Invalid email", EmailValidator.validateEmail("user@domain.com."));
    }
}
