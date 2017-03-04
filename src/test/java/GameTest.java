import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by kculpepp on 3/4/17.
 */
public class GameTest {

    private Game game;
    private Board board;

    @Before
    public void setUp(){
        board = mock(Board.class);
        game = new Game(board);
    }

    @Test
    public void shouldDrawBoardWhenGameStarts(){
        game.starts();

        verify(board).draw();
    }
}