package View.GameCommands;

import Adapter.Board;

/**
 * Created by Nathnael on 6/23/2016.
 */
public class Start implements Command {
    private Board board;



    public Start(Board board) {
        this.board = board;
    }

    @Override
    public Void execute() {

        board.start();
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Start start = (Start) o;

        return board != null ? board.equals(start.board) : start.board == null;

    }

    @Override
    public int hashCode() {
        return board != null ? board.hashCode() : 0;
    }
}
