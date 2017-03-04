import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by kculpepp on 3/4/17.
 */
public class GameTest {

    private Game game;
    private Board board;
    private Player player;

    @Before
    public void setUp(){
        board = mock(Board.class);
        player = mock(Player.class);
        game = new Game(board, player);
    }

    @Test
    public void shouldDrawBoardWhenGameStarts(){
        game.starts();

        verify(board).draw();
    }

    @Test
    public void shouldHavePlayerMakeMoveWhenGameStarts(){
        game.starts();

        verify(player).makeMove();
    }
}