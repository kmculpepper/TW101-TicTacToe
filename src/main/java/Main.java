/**
 * Created by kculpepp on 3/3/17.
 */
public class Main {
    public static void main(String [] args){
        Player firstPlayer = new Player();
        TicTacToe game = new TicTacToe(System.out, firstPlayer);
        game.start();
    }
}
