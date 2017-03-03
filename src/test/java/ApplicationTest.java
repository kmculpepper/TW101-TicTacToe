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
public class ApplicationTest {

    private PrintStream out;
    private BufferedReader in;
    private Application game;
    private TicTacToeBoard ticTacToeBoard;
    private Player firstPlayer;

    @Before
    public void setUp() {

        out = mock(PrintStream.class);
        in = mock(BufferedReader.class);
        ticTacToeBoard = mock(TicTacToeBoard.class);
        firstPlayer = mock(Player.class);
        game = new Application(in, out, ticTacToeBoard, firstPlayer);
    }

    @Test
    public void shouldDrawBoardWhenStartOfGame() throws IOException {
        game.start();
        verify(ticTacToeBoard).drawBoard();
    }

    @Test
    public void shouldHavePlayerMakeMoveWhenStartOfGame() throws IOException {
        game.start();
        verify(firstPlayer).makeMove(ticTacToeBoard);
    }

}