package Model.Neighbors;

import Adapter.Board;
import Adapter.BoardBox;
import Adapter.Cell;

/**
 * Created by Nathnael on 6/23/2016.
 */
public class FourNeighbors implements Neighbor{
    private Board board;
    int row;
    int column;
    private final static int NUMBER_OF_NEIGHBORS = 4;


    public FourNeighbors(){
        board = BoardBox.getBoard();
    }

    @Override
    public int getNumNeighbors() {
        return NUMBER_OF_NEIGHBORS;
    }

    @Override
    public Void giveNeighborsDot() {
        Cell[][] cells = board.getCells();
        String currentColor = cells[row][column].getCellColor();
        int currentDotNum = cells[row][column].getDotNumber();

        cells[row][column].setDotNumber(currentDotNum - getNumNeighbors());



        cells[row][column+1].addDots(1,currentColor);
        cells[row+1][column].addDots(1,currentColor);
        cells[row][column-1].addDots(1,currentColor);
        cells[row-1][column].addDots(1,currentColor);

        //give to all three neighbors
        return null;
    }

    @Override
    public Void setCellPosition(int row, int column) {
        this.row = row;
        this.column = column;
        return null;
    }
}
