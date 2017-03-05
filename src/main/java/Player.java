import java.io.PrintStream;
import java.util.List;

/**
 * Created by kculpepp on 3/4/17.
 */
public class Player {
    private PrintStream out;
    private List<String> locations;

    public Player(PrintStream out, List<String> locations) {

        this.out = out;
        this.locations = locations;
    }

    public void makeMove() {
        out.println("Player 1 please enter a number from 1 to 9");
    }

    public void markLocation(int locationToMark) {
        locations.set(locationToMark - 1, "X");
    }
}
