package Model.Neighbors;

import Adapter.Board;
import Adapter.BoardBox;
import Adapter.Cell;

/**
 * Created by Nathnael on 6/23/2016.
 */
public class ThreeNeighbors implements Neighbor {
    private Board board;
    int row;
    int column;
    private final static int NUMBER_OF_NEIGHBORS = 3;

    public ThreeNeighbors(){
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
        if(row == 1 && (column > 1 && column < board.getCellSize())){
            cells[row][column+1].addDots(1,currentColor);
            cells[row+1][column].addDots(1,currentColor);
            cells[row][column-1].addDots(1,currentColor);
            //to the right and below
        }else if(column == 1 && (row > 1 && row < board.getCellSize())){
            cells[row-1][column].addDots(1,currentColor);
            cells[row][column+1].addDots(1,currentColor);
            cells[row+1][column].addDots(1,currentColor);
            //top and right
        }
        else if (row == board.getCellSize() && (column > 1 && column < board.getCellSize())){
            cells[row][column-1].addDots(1,currentColor);
            cells[row][column+1].addDots(1,currentColor);
            cells[row-1][column].addDots(1,currentColor);
            //left and bottom
        }
        else if(column == board.getCellSize() && (row > 1 && row < board.getCellSize()) ){
            cells[row][column-1].addDots(1,currentColor);
            cells[row-1][column].addDots(1,currentColor);
            cells[row+1][column].addDots(1,currentColor);

            //top and left and bottom
        }

        return null;
    }

    @Override
    public Void setCellPosition(int row, int column) {
        this.row = row;
        this.column = column;
        return null;
    }
}
