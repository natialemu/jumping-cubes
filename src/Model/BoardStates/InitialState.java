package Model.BoardStates;

import Adapter.Board;

/**
 * Created by Nathnael on 6/23/2016.
 */
public class InitialState implements BoardState {
    Board board;

    public InitialState(Board board)
    {
        this.board = board;
    }

    @Override
    public Void clear() {
        //really shouldnt do anything
        System.out.println("Board already Cleared!");
        return null;
    }

    @Override
    public Void dump() {
        //take care of this later!
        return null;
    }

    @Override
    public Void quit() {
        System.out.println("Game hasn't started yet!");
        return null;
    }

    @Override
    public Void set(String color, int numDots, int row, int column) {


        //come back after implementing cellsi8 
        return null;
    }



    @Override
    public Void start() {
        System.out.println("Please make a move! Game has alreayd started");
        return null;
    }
}
