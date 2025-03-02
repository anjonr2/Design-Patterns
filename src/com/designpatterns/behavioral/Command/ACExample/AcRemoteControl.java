package com.designpatterns.behavioral.Command.ACExample;

public class AcRemoteControl {
    ICommand command;

    AcRemoteControl(){

    }

    //whatever command client passes
    public void setCommand(ICommand command){
        this.command=command;
    }

    public void pressButton(){
        command.execute();
    }
}
