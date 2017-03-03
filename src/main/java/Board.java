import java.io.PrintStream;

/**
 * Created by kculpepp on 3/3/17.
 */
public class Board {
    private PrintStream out;
    private String board = "1|2|3\n" +
            "-----\n" +
            "4|5|6\n" +
            "-----\n" +
            "7|8|9";

    public Board(PrintStream out) {

        this.out = out;
    }

    public void drawBoard() {
        out.println(board);

    }

    public void markBoardAt(String move) {
        board = board.replaceAll(move, "X");
    }
}
