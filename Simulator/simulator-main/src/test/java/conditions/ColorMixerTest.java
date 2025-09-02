package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ColorMixerTest {

    @Test
    public void testMixRedAndBlue() {
        assertEquals("purple", ColorMixer.mixColors("red", "blue"));
        assertEquals("purple", ColorMixer.mixColors("blue", "red"));
    }

    @Test
    public void testMixRedAndYellow() {
        assertEquals("orange", ColorMixer.mixColors("red", "yellow"));
        assertEquals("orange", ColorMixer.mixColors("yellow", "red"));
    }

    @Test
    public void testMixBlueAndYellow() {
        assertEquals("green", ColorMixer.mixColors("blue", "yellow"));
        assertEquals("green", ColorMixer.mixColors("yellow", "blue"));
    }

    @Test
    public void testSameColors() {
        assertEquals("red", ColorMixer.mixColors("red", "red"));
        assertEquals("blue", ColorMixer.mixColors("blue", "blue"));
        assertEquals("yellow", ColorMixer.mixColors("yellow", "yellow"));
    }

    @Test
    public void testUnknownColor() {
        assertEquals("Unknown color", ColorMixer.mixColors("red", "green"));
        assertEquals("Unknown color", ColorMixer.mixColors("purple", "blue"));
        assertEquals("Unknown color", ColorMixer.mixColors("orange", "yellow"));
    }

    public static class ColorMixer {

        public static String mixColors(String color1, String color2) {
            // Проверяем, что оба цвета являются основными
            if (!isPrimaryColor(color1) || !isPrimaryColor(color2)) {
                return "Unknown color";
            }

            // Если цвета одинаковые
            if (color1.equals(color2)) {
                return color1;
            }

            // Смешиваем разные основные цвета
            if ((color1.equals("red") && color2.equals("blue")) ||
                    (color1.equals("blue") && color2.equals("red"))) {
                return "purple";
            } else if ((color1.equals("red") && color2.equals("yellow")) ||
                    (color1.equals("yellow") && color2.equals("red"))) {
                return "orange";
            } else if ((color1.equals("blue") && color2.equals("yellow")) ||
                    (color1.equals("yellow") && color2.equals("blue"))) {
                return "green";
            }

            return "Unknown color";
        }

        private static boolean isPrimaryColor(String color) {
            return color.equals("red") || color.equals("blue") || color.equals("yellow");
        }
    }
}