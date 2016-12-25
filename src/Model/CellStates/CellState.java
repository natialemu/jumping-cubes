package Model.CellStates;

import Model.Neighbors.Neighbor;

/**
 * Created by Nathnael on 6/23/2016.
 */
public interface CellState {
    Void setNeighbors(Neighbor neighbors);
    Void addDots(int numDots, String color);
    Void setColor(String color);
    Void redistribute();
    Void setCellPosition(int row, int column);
    String getColor();
    Integer getDotNumber();
    Void setDotNumber(int dotNum);
}
