package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RockPaperScissorsTest {

    @Test
    public void testPlayer1Wins() {
        assertEquals("Player 1 wins", RockPaperScissors.determineWinner("rock", "scissors"));
        assertEquals("Player 1 wins", RockPaperScissors.determineWinner("scissors", "paper"));
        assertEquals("Player 1 wins", RockPaperScissors.determineWinner("paper", "rock"));
    }

    @Test
    public void testPlayer2Wins() {
        assertEquals("Player 2 wins", RockPaperScissors.determineWinner("scissors", "rock"));
        assertEquals("Player 2 wins", RockPaperScissors.determineWinner("paper", "scissors"));
        assertEquals("Player 2 wins", RockPaperScissors.determineWinner("rock", "paper"));
    }

    @Test
    public void testDraw() {
        assertEquals("Draw", RockPaperScissors.determineWinner("rock", "rock"));
        assertEquals("Draw", RockPaperScissors.determineWinner("paper", "paper"));
        assertEquals("Draw", RockPaperScissors.determineWinner("scissors", "scissors"));
    }

    @Test
    public void testInvalidInput() {
        assertEquals("Invalid input", RockPaperScissors.determineWinner("rock", "invalid"));
        assertEquals("Invalid input", RockPaperScissors.determineWinner("invalid", "paper"));
        assertEquals("Invalid input", RockPaperScissors.determineWinner("", "scissors"));
    }
}
