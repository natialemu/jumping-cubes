package View.GameCommands;

import Adapter.Board;

/**
 * Created by Nathnael on 6/23/2016.
 */
public class Quit implements Command {
    private Board board;



    public Quit(Board board) {
        this.board = board;
    }

    @Override
    public Void execute() {

        board.quit();
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Quit quit = (Quit) o;

        return board != null ? board.equals(quit.board) : quit.board == null;

    }

    @Override
    public int hashCode() {
        return board != null ? board.hashCode() : 0;
    }
}
