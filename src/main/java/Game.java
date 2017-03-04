/**
 * Created by kculpepp on 3/4/17.
 */
public class Game {

    private Board board;

    public Game(Board board) {

        this.board = board;
    }

    public void starts() {
        board.draw();
    }
}
