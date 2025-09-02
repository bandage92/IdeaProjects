package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ChessBoardTest {

    @Test
    public void testSmallBoard() {
        String expected2x2 = "#.\n.#\n";
        assertEquals(expected2x2, ChessBoard.drawBoard(2));

        String expected3x3 = "#.#\n.#.\n#.#\n";
        assertEquals(expected3x3, ChessBoard.drawBoard(3));
    }

    @Test
    public void testLargerBoard() {
        String expected4x4 = "#.#.\n.#.#\n#.#.\n.#.#\n";
        assertEquals(expected4x4, ChessBoard.drawBoard(4));

        String expected5x5 = "#.#.#\n.#.#.\n#.#.#\n.#.#.\n#.#.#\n";
        assertEquals(expected5x5, ChessBoard.drawBoard(5));
    }

    @Test
    public void testInvalidSize() {
        assertEquals("Invalid size", ChessBoard.drawBoard(0));
        assertEquals("Invalid size", ChessBoard.drawBoard(-1));
        assertEquals("Invalid size", ChessBoard.drawBoard(-5));
    }
}
