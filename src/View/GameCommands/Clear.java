package View.GameCommands;

import Adapter.Board;

/**
 * Created by Nathnael on 6/23/2016.
 */
public class Clear implements Command {
    private Board board;


    public Clear(Board board)
    {
        this.board = board;
    }
    @Override
    public Void execute() {

        board.clear();
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clear clear = (Clear) o;

        return board != null ? board.equals(clear.board) : clear.board == null;

    }

    @Override
    public int hashCode() {
        return board != null ? board.hashCode() : 0;
    }
}
