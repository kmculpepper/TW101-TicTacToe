import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Created by kculpepp on 3/3/17.
 */
public class Main {
    public static void main(String [] args) throws IOException {
        PrintStream out = System.out;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard(out);
        Player firstPlayer = new Player(in, out);
        Application game = new Application(in, out, ticTacToeBoard, firstPlayer);
        game.start();
    }
}
