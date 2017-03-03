import java.io.PrintStream;

/**
 * Created by kculpepp on 3/3/17.
 */
public class TicTacToeBoard {
    private PrintStream out;
    private String board;
    private String marker;

    public TicTacToeBoard(PrintStream out) {
        this.out = out;
        board = "1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9";
        marker = "X";
    }

    public void drawBoard() {
        out.println(board);

    }

    public void markBoardAt(String move) {
        String newBoard = board.replaceAll(move, marker);
        if(!newBoard.equals(board)) {
            if ("X".equals(marker))
                marker = "O";
            else
                marker = "X";
            board = newBoard;
        }
        else{
            out.println("Location already taken");
        }
    }


}
