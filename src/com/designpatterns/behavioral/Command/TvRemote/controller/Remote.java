package controller;

import Command.Command;

//this class is going to take the command from the invoker and will control the flow and execution of commands
public class Remote {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressButton(){
        this.command.execute();
    }
}
