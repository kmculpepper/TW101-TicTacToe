import java.io.PrintStream;

/**
 * Created by kculpepp on 3/4/17.
 */
public class Board {
    PrintStream out;

    public Board(PrintStream out) {

        this.out = out;
    }

    public void draw() {
        out.println("1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }
}
