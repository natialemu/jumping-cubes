package Model.CellStates;

import Adapter.Cell;
import Model.Neighbors.Neighbor;

/**
 * Created by Nathnael on 6/23/2016.
 */
public class FourOrMoreDots implements CellState{
    private Cell cell;
    private String color;
    private Neighbor neighbor;
    private int dotNum;



    public FourOrMoreDots(Cell cell, int dotNum) {
        this.cell = cell;
        this.dotNum = dotNum;
    }



    @Override
    public Void setNeighbors(Neighbor neighbors) {
        neighbor = neighbors;
        return null;
    }

    @Override
    public Void addDots(int numDots, String color) {
        if(numDots > neighbor.getNumNeighbors()){
            //display error
        }
        else {
            //adding not allowed in this state
            //cell.setCurrentState(new FourOrMoreDots(cell));
        }
        //call setColor with color
        return null;
    }

    @Override
    public Void setColor(String color) {
        return null;
    }

    @Override
    public Void redistribute() {

        neighbor.giveNeighborsDot();
        return null;
    }

    @Override
    public Void setCellPosition(int row, int column) {
        neighbor.setCellPosition(row,column);
        return null;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getDotNumber() {
        return dotNum;
    }

    @Override
    public Void setDotNumber(int dotNum) {
        this.dotNum = dotNum;
        return null;
    }
}
