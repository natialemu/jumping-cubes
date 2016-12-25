package View.GameCommands;

import Adapter.Board;

/**
 * Created by Nathnael on 6/23/2016.
 */
public class Set implements Command {
    private Board board;
    int numDots;
    String color;
    int row;
    int column;


    public Set(Board board, int numDots,String color, int row, int column){
        this.board = board;
        this.numDots = numDots;
        this.row = row;
        this.column = column;
        this.color = color;
    }

    @Override
    public Void execute() {
        board.set(color,numDots,row,column);
        return null;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Set set = (Set) o;

        return board != null ? board.equals(set.board) : set.board == null;

    }

    @Override
    public int hashCode() {
        return board != null ? board.hashCode() : 0;
    }
}
