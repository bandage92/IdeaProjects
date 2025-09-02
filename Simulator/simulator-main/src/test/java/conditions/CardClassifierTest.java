package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CardClassifierTest {

    @Test
    public void testNumericCards() {
        assertEquals("Two of Hearts", CardClassifier.classifyCard("2", "H"));
        assertEquals("Ten of Diamonds", CardClassifier.classifyCard("10", "D"));
        assertEquals("Five of Clubs", CardClassifier.classifyCard("5", "C"));
    }

    @Test
    public void testFaceCards() {
        assertEquals("Jack of Spades", CardClassifier.classifyCard("J", "S"));
        assertEquals("Queen of Hearts", CardClassifier.classifyCard("Q", "H"));
        assertEquals("King of Diamonds", CardClassifier.classifyCard("K", "D"));
    }

    @Test
    public void testAces() {
        assertEquals("Ace of Hearts", CardClassifier.classifyCard("A", "H"));
        assertEquals("Ace of Diamonds", CardClassifier.classifyCard("A", "D"));
        assertEquals("Ace of Clubs", CardClassifier.classifyCard("A", "C"));
        assertEquals("Ace of Spades", CardClassifier.classifyCard("A", "S"));
    }

    @Test
    public void testInvalidRanks() {
        assertEquals("Invalid card", CardClassifier.classifyCard("1", "H"));
        assertEquals("Invalid card", CardClassifier.classifyCard("11", "H"));
        assertEquals("Invalid card", CardClassifier.classifyCard("B", "H"));
    }

    @Test
    public void testInvalidSuits() {
        assertEquals("Invalid card", CardClassifier.classifyCard("A", "X"));
        assertEquals("Invalid card", CardClassifier.classifyCard("10", "B"));
        assertEquals("Invalid card", CardClassifier.classifyCard("K", ""));
    }

    public class CardClassifier {

        public static String classifyCard(String rank, String suit) {
            // Проверка корректности ранга
            if (!isValidRank(rank)) {
                return "Invalid card";
            }

            // Проверка корректности масти
            if (!isValidSuit(suit)) {
                return "Invalid card";
            }

            // Преобразование ранга
            String rankName = getRankName(rank);

            // Преобразование масти
            String suitName = getSuitName(suit);

            return rankName + " of " + suitName;
        }

        private static boolean isValidRank(String rank) {
            // Допустимые ранги: 2-10, J, Q, K, A
            if (rank.equals("J") || rank.equals("Q") || rank.equals("K") || rank.equals("A")) {
                return true;
            }

            try {
                int num = Integer.parseInt(rank);
                return num >= 2 && num <= 10;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        private static boolean isValidSuit(String suit) {
            return suit.equals("H") || suit.equals("D") || suit.equals("C") || suit.equals("S");
        }

        private static String getRankName(String rank) {
            return switch (rank) {
                case "2" -> "Two";
                case "3" -> "Three";
                case "4" -> "Four";
                case "5" -> "Five";
                case "6" -> "Six";
                case "7" -> "Seven";
                case "8" -> "Eight";
                case "9" -> "Nine";
                case "10" -> "Ten";
                case "J" -> "Jack";
                case "Q" -> "Queen";
                case "K" -> "King";
                case "A" -> "Ace";
                default -> null;
            };
        }

        private static String getSuitName(String suit) {
            return switch (suit) {
                case "H" -> "Hearts";
                case "D" -> "Diamonds";
                case "C" -> "Clubs";
                case "S" -> "Spades";
                default -> "";
            };
        }
    }
}