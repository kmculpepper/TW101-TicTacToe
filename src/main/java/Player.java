import java.io.PrintStream;

/**
 * Created by kculpepp on 3/4/17.
 */
public class Player {
    private PrintStream out;

    public Player(PrintStream out) {

        this.out = out;
    }

    public void makeMove() {
        out.println("Player 1 please enter a number from 1 to 9");
    }
}
