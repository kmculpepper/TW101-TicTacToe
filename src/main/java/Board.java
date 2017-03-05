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
        String output = String.format("%s|%s|%s\n" +
                                      "-----\n" +
                                      "%s|%s|%s\n" +
                                      "-----\n" +
                                      "%s|%s|%s", locations.toArray());

        out.println(output);
    }

    public void markLocation(int locationToMark) {
        locations.set(locationToMark - 1, "X");
    }
}
