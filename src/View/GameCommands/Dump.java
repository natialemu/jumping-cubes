package View.GameCommands;

import Adapter.Board;

/**
 * Created by Nathnael on 6/23/2016.
 */
public class Dump implements  Command {
    private Board board;

    //how do you create the board

    public Dump(Board board) {
        this.board = board;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dump dump = (Dump) o;

        return board != null ? board.equals(dump.board) : dump.board == null;

    }

    @Override
    public int hashCode() {
        return board != null ? board.hashCode() : 0;
    }

    @Override
    public Void execute()
    {
        board.dump();
        return null;
    }
}
