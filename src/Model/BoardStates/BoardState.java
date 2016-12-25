package Model.BoardStates;

/**
 * Created by Nathnael on 6/23/2016.
 */
public interface BoardState {
    Void clear();
    Void dump();
    Void quit();
    Void set(String color, int numDots, int row, int column);
    Void start();
}
