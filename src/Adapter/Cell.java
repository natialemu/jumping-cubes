package Adapter;

import Model.CellStates.*;
import Model.Neighbors.Neighbor;

/**
 * Created by Nathnael on 6/23/2016.
 */
public class Cell {
    CellState currentCellState;

    CellState noDot;
    CellState oneDot;
    CellState twoDots;
    CellState threeDots;
    CellState fourOrMoreDots;

    int row;
    int column;

    Neighbor neighbors;

    public Cell(){initialize();}

    public void setCurrentState(CellState currentCellState){
        this.currentCellState = currentCellState;
        setNeighbors(neighbors);
        setCellPosition(row,column);
    }

    public void setNeighbors(Neighbor neighbors)
    {
        currentCellState.setNeighbors(neighbors);
    }

    private void initialize(){
        setCurrentState(new NoDot(this));

    }
    public String getCellColor()
    {
        return currentCellState.getColor();
    }

    public void addDots(int numDots, String color){
        // no need for the extra color parameter in addDots;
        //get color of current state(so add a getColor method)
        String colorBeforeAddition = currentCellState.getColor();
        currentCellState.addDots(numDots,color);
        //if the new state is two or more dots, pass the old color to the set color

        setCellColor(color);
        redistribute();
    }
    private void setCellColor(String color){
        currentCellState.setColor(color);
    }
    private void redistribute(){
        currentCellState.redistribute();
    }

    public Integer getDotNumber(){return currentCellState.getDotNumber();}
    public void setDotNumber(int dotNum){currentCellState.setDotNumber(dotNum);}

    public void setCellPosition(int row, int column){
        this.row = row;
        this.column = column;
        currentCellState.setCellPosition(row,column); }




}
