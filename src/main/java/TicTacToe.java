import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by kculpepp on 3/3/17.
 */
public class TicTacToe {
    private PrintStream out;
    private BufferedReader in;
    private Board board;

    public TicTacToe(BufferedReader in, PrintStream out, Board board) {
        this.in = in;
        this.out = out;
        this.board = board;
    }



    public void start() throws IOException {
        board.drawBoard();
        makeMove();
    }

    private void makeMove() throws IOException {
        String move = promptPlayerForMove();
        board.markBoardAt(move);
        board.drawBoard();
    }

    public String promptPlayerForMove() throws IOException {
        out.print("Enter number where you wish to place your mark (1-9): ");
        String move = in.readLine();
        return move;
    }

}
