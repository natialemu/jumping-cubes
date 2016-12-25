package View;

import View.GameCommands.Command;

/**
 * Created by Nathnael on 6/23/2016.
 */
public class Player {
    Command command;

    public Player(Command command){
        this.command = command;
    }

    public void play(){
        command.execute();
    }
}
