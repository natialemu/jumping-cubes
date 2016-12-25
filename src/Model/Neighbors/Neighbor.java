package Model.Neighbors;

import Adapter.Board;

/**
 * Created by Nathnael on 6/23/2016.
 */
public interface Neighbor {
    int getNumNeighbors();
    Void giveNeighborsDot();
    Void setCellPosition(int row, int column);
}
