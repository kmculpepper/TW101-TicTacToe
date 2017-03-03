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
        Board board = new Board(out);
        TicTacToe game = new TicTacToe(in, out, board);
        game.start();
    }
}
