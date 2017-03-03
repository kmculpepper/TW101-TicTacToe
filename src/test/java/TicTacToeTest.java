import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by kculpepp on 3/3/17.
 */
public class TicTacToeTest {

    private PrintStream out;
    private Player firstPlayer;
    private TicTacToe game;

    @Before
    public void setUp() {

        out = mock(PrintStream.class);
        firstPlayer = mock(Player.class);
        game = new TicTacToe(out, firstPlayer);
    }

    @Test
    public void shouldDrawBoardWhenStartOfGame(){
        game.start();

        verify(out).println("1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }

    @Test
    public void firstPlayerShouldMakeMoveWhenStartOfGame(){
        game.start();

        verify(firstPlayer).makeMove();
    }
}