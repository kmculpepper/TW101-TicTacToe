import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by kculpepp on 3/3/17.
 */
public class Application {
    private PrintStream out;
    private BufferedReader in;
    private TicTacToeBoard ticTacToeBoard;
    private Player firstPlayer;

    public Application(BufferedReader in, PrintStream out, TicTacToeBoard ticTacToeBoard, Player firstPlayer) {
        this.in = in;
        this.out = out;
        this.ticTacToeBoard = ticTacToeBoard;
        this.firstPlayer = firstPlayer;
    }



    public void start() throws IOException {
        ticTacToeBoard.drawBoard();

        firstPlayer.makeMove(ticTacToeBoard);
    }


}
