import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by kculpepp on 3/3/17.
 */
public class TicTacToeBoardTest {

    private PrintStream out;
    private TicTacToeBoard ticTacToeBoard;

    @Before
    public void setUp() {

        out = mock(PrintStream.class);
        ticTacToeBoard = new TicTacToeBoard(out);
    }

    @Test
    public void shouldFormatCorrectlyWhenDrawingBoard(){
        ticTacToeBoard.drawBoard();

        verify(out).println("1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }

    @Test
    public void shouldPrintBoardWithXAt1WhenMarkingBoardAt1(){
        ticTacToeBoard.markBoardAt("1");
        ticTacToeBoard.drawBoard();

        verify(out).println("X|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }

    @Test
    public void shouldPrintBoardWithXAt9WhenMarkingBoardAt9(){
        ticTacToeBoard.markBoardAt("9");
        ticTacToeBoard.drawBoard();
        verify(out).println("1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|X");
    }

    @Test
    public void shouldPrintBoardWithOWhenMarkingBoardASecondTime(){
        ticTacToeBoard.markBoardAt("1");
        ticTacToeBoard.markBoardAt("2");
        ticTacToeBoard.drawBoard();
        verify(out).println("X|O|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }

    @Test
    public void shouldPrintBoardWithXWhenMarkingBoardAThirdTime(){
        ticTacToeBoard.markBoardAt("1");
        ticTacToeBoard.markBoardAt("2");
        ticTacToeBoard.markBoardAt("5");
        ticTacToeBoard.drawBoard();
        verify(out).println("X|O|3\n" +
                "-----\n" +
                "4|X|6\n" +
                "-----\n" +
                "7|8|9");
    }

    @Test
    public void shouldDisplayErrorWhenTryingToMarkAnAlreadyMarkedSpot() throws IOException {
        ticTacToeBoard.markBoardAt("1");
        ticTacToeBoard.markBoardAt("1");
        verify(out).println("Location already taken");
    }
}