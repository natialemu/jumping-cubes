package Model.CellStates;

import Adapter.Cell;
import Model.Neighbors.Neighbor;

/**
 * Created by Nathnael on 6/23/2016.
 */
public class TwoDots implements CellState {
    Cell cell;
    String color;
    Neighbor neighbor;
    int dotNum;

    public TwoDots(Cell cell) {
        this.cell = cell;
        dotNum = 2;
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
        else if (numDots == 1){
            cell.setCurrentState(new ThreeDots(cell));
        }
        else{
            cell.setCurrentState(new FourOrMoreDots(cell,dotNum+numDots));
        }

        return null;
    }

    @Override
    public Void setColor(String color) {
        this.color = color;
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
