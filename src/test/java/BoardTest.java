import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by kculpepp on 3/4/17.
 */
public class BoardTest {

    @Test
    public void shouldDrawBoardWhenBoardDraws(){
        PrintStream out = mock(PrintStream.class);
        Board board = new Board(out);

        board.draw();

        verify(out).println("1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }
}