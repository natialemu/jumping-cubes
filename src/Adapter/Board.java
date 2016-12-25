package Adapter;

import Model.BoardStates.*;

/**
 * Created by Nathnael on 6/23/2016.
 */
public class Board {
    private static final int DEFAULT_CELL_SIZE = 6;
    private Cell[][] cells;
    private BoardState currentState;

    private BoardState initialState;
    private BoardState playingState;
    private BoardState gameOver;
    private BoardState pausedState;

    private String winningColor;

    //set neighbors of each cell here!
    public Board(){
        cells = new Cell[DEFAULT_CELL_SIZE][DEFAULT_CELL_SIZE];
        initialState = new InitialState(this);
        playingState = new PlayingState(this);
        gameOver = new GameOver(this);
        pausedState = new PausedState(this);

        initialize();
    }

    public Board(int N){
        cells = new Cell[N][N];
        initialState = new InitialState(this);
        playingState = new PlayingState(this);
        gameOver = new GameOver(this);

        initialize();

    }

    public int getCellSize(){
        return cells.length;
    }


    public void setWinningColor(String winningColor){
        this.winningColor = winningColor;
    }


    private void setBoardState(BoardState currentState){
        this.currentState = currentState;
    }

    public Cell[][] getCells()
    {
        return cells;
    }


    private void initialize(){
        setBoardState(new InitialState(this));
    }

    public void clear()
    {

        currentState.clear();
    }

    public void dump(){
        currentState.dump();
    }

    public void quit(){
        currentState.quit();
    }

    public void set(String color, int numDots, int row, int column){
        currentState.set(color,numDots,row,column);
    }
    public void start(){
        currentState.start();
    }
}
