import org.junit.Before;
import org.junit.Test;
import org.mockito.hamcrest.MockitoHamcrest;

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

/**
 * Created by kculpepp on 3/4/17.
 */
public class PlayerTest {

    private Player player;
    PrintStream out;
    private List<String> locations;

    @Before
    public void setUp(){
        out = mock(PrintStream.class);
        locations = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9"));
        player = new Player(out, locations);
    }

    @Test
    public void shouldPromptUserWhenMakingMove(){
        player.makeMove();

        verify(out).println(MockitoHamcrest.argThat(both(containsString("Player 1")).and(containsString("enter a number"))));
    }

    @Test
    public void shouldMarkXAtLocation1WhenMarkingLocation1(){
        player.markLocation(1);

        assertThat(locations.get(0), is("X"));
    }

}