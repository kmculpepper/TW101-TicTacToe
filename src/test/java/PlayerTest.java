import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by kculpepp on 3/3/17.
 */
public class PlayerTest {

    private PrintStream out;
    private BufferedReader in;
    private TicTacToeBoard ticTacToeBoard;
    private Player firstPlayer;

    @Before
    public void setUp() {

        out = mock(PrintStream.class);
        in = mock(BufferedReader.class);
        ticTacToeBoard = mock(TicTacToeBoard.class);
        firstPlayer = new Player(in, out);
    }

    @Test
    public void shouldReceive1WhenPromptingPlayerForMove() throws IOException {
        when(in.readLine()).thenReturn("1");
        assertEquals("1", firstPlayer.promptPlayerForMove());
    }

    @Test
    public void shouldReceive2WhenPromptingPlayerForMove() throws IOException {
        when(in.readLine()).thenReturn("2");
        assertEquals("2", firstPlayer.promptPlayerForMove());
    }

    @Test
    public void shouldMarkBoardOnceWhenMakingMove() throws IOException {
        when(in.readLine()).thenReturn("1");
        firstPlayer.makeMove(ticTacToeBoard);
        verify(ticTacToeBoard).markBoardAt("1");
    }

    @Test
    public void shouldDrawBoardOnceWhenMakingMove() throws IOException {
        when(in.readLine()).thenReturn("1");
        firstPlayer.makeMove(ticTacToeBoard);
        verify(ticTacToeBoard).drawBoard();
    }

}