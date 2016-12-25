package Model.CellStates;

import Adapter.Cell;
import Model.Neighbors.Neighbor;

/**
 * Created by Nathnael on 6/23/2016.
 */
public class NoDot implements CellState {
    private Cell cell;
    private Neighbor neighbor;
    private String color;
    private int dotNum;



    public NoDot(Cell cell){
        this.cell = cell;
        dotNum = 0;
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
            cell.setCurrentState(new OneDot(cell));
        }
        else if (numDots == 2){
            cell.setCurrentState(new TwoDots(cell));
        }
        else if(numDots == 3){
            cell.setCurrentState(new ThreeDots(cell));

        } else{

            cell.setCurrentState(new FourOrMoreDots(cell,numDots));
        }
        return null;
    }

    @Override
    public Void setColor(String color) {
        color = "White";
        return null;
    }

    @Override
    public Void redistribute() {
        //print out something that says reditribution not allowed;
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
