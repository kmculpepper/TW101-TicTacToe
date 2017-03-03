import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by kculpepp on 3/3/17.
 */
public class Player {

    private final BufferedReader in;
    private final PrintStream out;

    public Player(BufferedReader in, PrintStream out) {

        this.in = in;
        this.out = out;
    }

    public void makeMove(TicTacToeBoard ticTacToeBoard) throws IOException {
        String move = promptPlayerForMove();
        ticTacToeBoard.markBoardAt(move);
        ticTacToeBoard.drawBoard();
    }

    public String promptPlayerForMove() throws IOException {
        out.print("Enter number where you wish to place your mark (1-9): ");
        String move = in.readLine();
        return move;
    }
}

