import org.junit.Before;
import org.junit.Test;
import org.mockito.hamcrest.MockitoHamcrest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by kculpepp on 3/4/17.
 */
public class PlayerTest {

    private Player player;
    private PrintStream out;
    private BufferedReader in;
    private Board board;

    @Before
    public void setUp(){
        out = mock(PrintStream.class);
        in = mock(BufferedReader.class);
        board = mock(Board.class);
        player = new Player(in, out, board);
    }

    @Test
    public void shouldPromptUserWhenMakingMove() throws IOException {
        when(in.readLine()).thenReturn("-1");
        player.makeMove();

        verify(out).println(MockitoHamcrest.argThat(both(containsString("Player 1")).and(containsString("enter a number"))));
    }

    @Test
    public void shouldMarkLocationWhenMakingMove() throws IOException {
        when(in.readLine()).thenReturn("-1");
        player.makeMove();

        verify(board).markLocation(-1);
    }

    @Test
    public void shouldMarkLocationAt1WhenPlayerMakesMoveToLocation1() throws IOException {
        when(in.readLine()).thenReturn("1");
        player.makeMove();

        verify(board).markLocation(1);
    }


}