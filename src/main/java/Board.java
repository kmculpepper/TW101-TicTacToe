import java.io.PrintStream;
import java.util.List;

/**
 * Created by kculpepp on 3/4/17.
 */
public class Board {
    PrintStream out;
    private List<String> locations;

    public Board(PrintStream out, List<String> locations) {

        this.out = out;
        this.locations = locations;
    }

    public void draw() {
        out.println("1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }

    public void markLocation(int locationToMark) {
        locations.set(locationToMark - 1, "X");
    }
}
