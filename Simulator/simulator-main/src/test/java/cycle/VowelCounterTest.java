package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class VowelCounterTest {

    @Test
    public void testSimpleWords() {
        assertEquals("2", VowelCounter.countVowels("Hello"));     // e, o
        assertEquals("1", VowelCounter.countVowels("World"));     // o
        assertEquals("3", VowelCounter.countVowels("Beautiful")); // e, a, u
    }

    @Test
    public void testMixedCase() {
        assertEquals("2", VowelCounter.countVowels("hElLo"));     // E, o
        assertEquals("3", VowelCounter.countVowels("AeIoU"));     // A, e, I, o, U
        assertEquals("2", VowelCounter.countVowels("TeXt"));      // e
    }

    @Test
    public void testNoVowels() {
        assertEquals("0", VowelCounter.countVowels(""));          // пустая строка
        assertEquals("0", VowelCounter.countVowels("Rhythm"));    // нет гласных
        assertEquals("0", VowelCounter.countVowels("Myth"));      // нет гласных
    }

    @Test
    public void testSpecialCases() {
        assertEquals("0", VowelCounter.countVowels("123"));       // только цифры
        assertEquals("0", VowelCounter.countVowels("!@#$%"));     // только символы
        assertEquals("1", VowelCounter.countVowels("a1e2i3o4u")); // гласные с цифрами
    }
}
