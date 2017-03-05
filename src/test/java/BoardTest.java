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
        out = mock(PrintStream.class);
    }

    @Test
    public void shouldDrawBoardWhenBoardDraws(){
        locations = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9"));
        board = new Board(out, locations);
        board.draw();

        verify(out).println("1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }

    @Test
    public void shouldMarkXAtLocation1WhenMarkingLocation1(){
        locations = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9"));
        board = new Board(out, locations);
        board.markLocation(1);

        assertThat(locations.get(0), is("X"));
    }

    @Test
    public void shouldDrawXAtLocation1WhenLocation1IsMarked(){
        locations = new ArrayList<>(Arrays.asList("X","2","3","4","5","6","7","8","9"));
        board = new Board(out, locations);
        board.draw();

        verify(out).println("X|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }

    @Test
    public void shouldDrawXAtLocation2WhenLocation2IsMarked(){
        locations = new ArrayList<>(Arrays.asList("1","X","3","4","5","6","7","8","9"));
        board = new Board(out, locations);
        board.draw();

        verify(out).println("1|X|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }
}