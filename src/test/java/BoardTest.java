import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by kculpepp on 3/4/17.
 */
public class BoardTest {

    private List<String> locations;
    private PrintStream out;
    private Board board;

    @Before
    public void setUp(){
        locations = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9"));
        out = mock(PrintStream.class);
        board = new Board(out, locations);
    }

    @Test
    public void shouldDrawBoardWhenBoardDraws(){
        board.draw();

        verify(out).println("1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }

    @Test
    public void shouldMarkXAtLocation1WhenMarkingLocation1(){
        board.markLocation(1);

        assertThat(locations.get(0), is("X"));
    }
}