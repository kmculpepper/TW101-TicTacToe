import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by kculpepp on 3/3/17.
 */
public class BoardTest {

    private PrintStream out;
    private Board board;

    @Before
    public void setUp() {

        out = mock(PrintStream.class);
        board = new Board(out);
    }

    @Test
    public void shouldFormatCorrectlyWhenDrawingBoard(){
        board.drawBoard();

        verify(out).println("1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }

    @Test
    public void shouldPrintBoardWithXAt1WhenMarkingBoardAt1(){
        board.markBoardAt("1");
        board.drawBoard();

        verify(out).println("X|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }

    @Test
    public void shouldPrintBoardWithXAt9WhenMarkingBoardAt9(){
        board.markBoardAt("9");
        board.drawBoard();
        verify(out).println("1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|X");
    }
}