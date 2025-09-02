package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    public void testSimplePalindromes() {
        assertEquals("Palindrome", Palindrome.isPalindrome("radar"));
        assertEquals("Palindrome", Palindrome.isPalindrome("level"));
        assertEquals("Palindrome", Palindrome.isPalindrome("deed"));
    }

    @Test
    public void testPalindromesWithSpaces() {
        assertEquals("Palindrome", Palindrome.isPalindrome("never odd or even"));
        assertEquals("Palindrome", Palindrome.isPalindrome("do geese see god"));
        assertEquals("Palindrome", Palindrome.isPalindrome("а роза упала на лапу азора"));
    }

    @Test
    public void testPalindromesWithPunctuation() {
        assertEquals("Palindrome", Palindrome.isPalindrome("Madam, I'm Adam!"));
        assertEquals("Palindrome", Palindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void testNonPalindromes() {
        assertEquals("Not palindrome", Palindrome.isPalindrome("hello"));
        assertEquals("Not palindrome", Palindrome.isPalindrome("world"));
        assertEquals("Not palindrome", Palindrome.isPalindrome("palindrome"));
    }

    @Test
    public void testSpecialCases() {
        assertEquals("Not palindrome", Palindrome.isPalindrome(""));
        assertEquals("Palindrome", Palindrome.isPalindrome("a"));
        assertEquals("Palindrome", Palindrome.isPalindrome("!"));
    }
}
