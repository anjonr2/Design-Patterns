package com.designpatterns.behavioral.Command.ACExample;

public class TurnAcOnCommand implements ICommand{
    AirConditioner ac;

    TurnAcOnCommand(AirConditioner ac){
        this.ac=ac;
    }

    @Override
    public void execute() {
        ac.turnOnAc();
    }
}
