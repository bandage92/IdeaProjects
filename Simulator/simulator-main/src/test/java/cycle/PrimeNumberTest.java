package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PrimeNumberTest {

    @Test
    public void testPrimeNumbers() {
        assertEquals("Prime", PrimeNumber.isPrime(2));
        assertEquals("Prime", PrimeNumber.isPrime(3));
        assertEquals("Prime", PrimeNumber.isPrime(5));
        assertEquals("Prime", PrimeNumber.isPrime(7));
        assertEquals("Prime", PrimeNumber.isPrime(11));
        assertEquals("Prime", PrimeNumber.isPrime(13));
        assertEquals("Prime", PrimeNumber.isPrime(17));
        assertEquals("Prime", PrimeNumber.isPrime(19));
        assertEquals("Prime", PrimeNumber.isPrime(23));
    }

    @Test
    public void testNonPrimeNumbers() {
        assertEquals("Not prime", PrimeNumber.isPrime(1));
        assertEquals("Not prime", PrimeNumber.isPrime(4));
        assertEquals("Not prime", PrimeNumber.isPrime(6));
        assertEquals("Not prime", PrimeNumber.isPrime(8));
        assertEquals("Not prime", PrimeNumber.isPrime(9));
        assertEquals("Not prime", PrimeNumber.isPrime(10));
        assertEquals("Not prime", PrimeNumber.isPrime(12));
        assertEquals("Not prime", PrimeNumber.isPrime(15));
    }

    @Test
    public void testInvalidNumbers() {
        assertEquals("Invalid number", PrimeNumber.isPrime(0));
        assertEquals("Invalid number", PrimeNumber.isPrime(-1));
        assertEquals("Invalid number", PrimeNumber.isPrime(-5));
        assertEquals("Invalid number", PrimeNumber.isPrime(-10));
    }
}
