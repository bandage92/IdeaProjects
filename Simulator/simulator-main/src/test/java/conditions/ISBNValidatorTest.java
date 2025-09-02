package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ISBNValidatorTest {

    @Test
    public void testValidISBN10() {
        assertEquals("Valid ISBN", ISBNValidator.validateISBN("0-7475-3269-9")); // Harry Potter Book
        assertEquals("Valid ISBN", ISBNValidator.validateISBN("0-684-84328-5")); // Valid ISBN-10
        assertEquals("Valid ISBN", ISBNValidator.validateISBN("0-7475-3269-9")); // Valid ISBN-10 with X
    }

    @Test
    public void testValidISBN13() {
        assertEquals("Valid ISBN", ISBNValidator.validateISBN("978-0-7475-3269-9")); // ISBN-13
        assertEquals("Valid ISBN", ISBNValidator.validateISBN("978-0-684-84328-5")); // ISBN-13
        assertEquals("Valid ISBN", ISBNValidator.validateISBN("978-0-7475-3269-9")); // ISBN-13
    }

    @Test
    public void testInvalidISBNFormat() {
        assertEquals("Invalid ISBN", ISBNValidator.validateISBN("abc-0-7475-3269-9")); // Invalid prefix
        assertEquals("Invalid ISBN", ISBNValidator.validateISBN("0-7475-3269")); // Incomplete ISBN
        assertEquals("Invalid ISBN", ISBNValidator.validateISBN("0-7475-3269-A")); // Invalid character
    }

    @Test
    public void testInvalidCheckDigit() {
        assertEquals("Invalid ISBN", ISBNValidator.validateISBN("0-7475-3269-0")); // Wrong check digit
        assertEquals("Invalid ISBN", ISBNValidator.validateISBN("978-0-7475-3269-0")); // Wrong check digit ISBN-13
    }

    @Test
    public void testEmptyOrNullISBN() {
        assertEquals("Invalid ISBN", ISBNValidator.validateISBN(""));
        assertEquals("Invalid ISBN", ISBNValidator.validateISBN(null));
    }
}
