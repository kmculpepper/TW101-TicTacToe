import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by kculpepp on 3/3/17.
 */
public class TicTacToeTest {

    private PrintStream out;
    private BufferedReader in;
    private TicTacToe game;
    private Board board;

    @Before
    public void setUp() {

        out = mock(PrintStream.class);
        in = mock(BufferedReader.class);
        board = mock(Board.class);
        game = new TicTacToe(in, out, board);
    }

    @Test
    public void shouldDrawBoardWhenStartOfGame() throws IOException {
        game.start();
        verify(board).drawBoard();
    }

    @Test
    public void shouldReceive1WhenPromptingPlayerForMove() throws IOException {
        when(in.readLine()).thenReturn("1");
        assertEquals("1", game.promptPlayerForMove());
    }

    @Test
    public void shouldReceive2WhenPromptingPlayerForMove() throws IOException {
        when(in.readLine()).thenReturn("2");
        assertEquals("2", game.promptPlayerForMove());
    }
}