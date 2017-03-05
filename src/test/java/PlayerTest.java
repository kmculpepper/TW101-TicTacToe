import org.junit.Test;
import org.mockito.hamcrest.MockitoHamcrest;

import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by kculpepp on 3/4/17.
 */
public class PlayerTest {

    @Test
    public void shouldPromptUserWhenMakingMove(){
        PrintStream out = mock(PrintStream.class);
        Player player = new Player(out);
        player.makeMove();

        verify(out).println(MockitoHamcrest.argThat(both(containsString("Player 1")).and(containsString("enter a number"))));
    }
}