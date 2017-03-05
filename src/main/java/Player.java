import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by kculpepp on 3/4/17.
 */
public class Player {
    private BufferedReader in;
    private PrintStream out;
    private Board board;

    public Player(BufferedReader in, PrintStream out, Board board) {
        this.in = in;
        this.out = out;
        this.board = board;
    }

    public void makeMove() {
        int locationToMark = getLocationToMark();
        board.markLocation(locationToMark);
    }

    private int getLocationToMark() {
        out.println("Player 1 please enter a number from 1 to 9");
        try {
            return Integer.parseInt(in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }

}
