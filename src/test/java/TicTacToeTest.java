import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by kculpepp on 3/3/17.
 */
public class TicTacToeTest {
    @Test
    public void shouldDrawBoardAtStartOfGame(){
        PrintStream out = mock(PrintStream.class);
        TicTacToe game = new TicTacToe(out);
        game.start();

        verify(out).println("1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }
}