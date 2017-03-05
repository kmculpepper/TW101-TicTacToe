import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kculpepp on 3/3/17.
 */
public class Main {
    public static void main(String [] args) throws IOException {
        PrintStream out = System.out;
        List<String> locations = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9"));
        Board board = new Board(out, locations);
        Player player = new Player(out);
        Game game = new Game(board, player);
        game.starts();
    }
}
