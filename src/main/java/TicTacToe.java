import java.io.PrintStream;

/**
 * Created by kculpepp on 3/3/17.
 */
public class TicTacToe {
    private PrintStream out;
    private Player firstPlayer;

    public TicTacToe(PrintStream out, Player firstPlayer) {

        this.out = out;
        this.firstPlayer = firstPlayer;
    }

    public void start() {
        out.println("1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
        firstPlayer.makeMove();
    }
}
