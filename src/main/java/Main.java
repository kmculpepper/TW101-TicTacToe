import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by kculpepp on 3/3/17.
 */
public class Main {
    public static void main(String [] args) throws IOException {
        PrintStream out = System.out;
        Board board = new Board(out);
        Player player = new Player();
        Game game = new Game(board, player);
        game.starts();
    }
}
