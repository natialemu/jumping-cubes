package Model.BoardStates;

import Adapter.Board;

/**
 * Created by Nathnael on 6/24/2016.
 */
public class PausedState implements BoardState {
    Board board;

    public PausedState(Board board)
    {
        this.board = board;
    }
    @Override
    public Void clear() {
        return null;
    }

    @Override
    public Void dump() {
        return null;
    }

    @Override
    public Void quit() {
        return null;
    }

    @Override
    public Void set(String color, int numDots, int row, int column) {
        return null;
    }

    @Override
    public Void start() {
        return null;
    }
}
