/**
 * Created by kculpepp on 3/4/17.
 */
public class Game {

    private Board board;
    private Player player;

    public Game(Board board, Player player) {

        this.board = board;
        this.player = player;
    }

    public void starts() {
        board.draw();
        player.makeMove();
        board.draw();
    }
}
