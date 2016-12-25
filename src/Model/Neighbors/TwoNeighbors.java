package Model.Neighbors;

import Adapter.Board;
import Adapter.BoardBox;
import Adapter.Cell;

/**
 * Created by Nathnael on 6/23/2016.
 */
public class TwoNeighbors implements Neighbor {
    private Board board;
    int row;
    int column;
    private final static int NUMBER_OF_NEIGHBORS = 2;

    public TwoNeighbors(){
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
        if(row == 1 && column == 1){
            cells[row][column+1].addDots(1,currentColor);
            cells[row+1][column].addDots(1,currentColor);
            //to the right and below
        }else if(row == board.getCellSize() && column == 1){
            cells[row-1][column].addDots(1,currentColor);
            cells[row][column+1].addDots(1,currentColor);
            //top and right
        }
        else if (row == 1 && column == board.getCellSize()){
            cells[row][column-1].addDots(1,currentColor);
            cells[row+1][column].addDots(1,currentColor);
            //left and bottom
        }
        else if(row == board.getCellSize() && column == board.getCellSize()){
            cells[row][column-1].addDots(1,currentColor);
            cells[row-1][column].addDots(1,currentColor);

            //top and left
        }
        //get the cells array of the board
        //access the current cell and get its color
        //access the two neighbours(there are 4 conditions depending on which 4 corners are the position)

        //call their add method and pass in the value of 1 and the color you just calculated

        return null;
    }

    @Override
    public Void setCellPosition(int row, int column) {
        this.row = row;
        this.column = column;
        return null;
    }
}
