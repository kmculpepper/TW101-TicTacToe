import java.io.IOException;

/**
 * Created by kculpepp on 3/3/17.
 */
public class Main {
    public static void main(String [] args) throws IOException {
        Board board = new Board();
        Game game = new Game(board);
        game.starts();
    }
}
