package com.designpatterns.behavioral.Command.ACExample;

public class TurnOffAcCommand implements ICommand{
    AirConditioner airConditioner;

    TurnOffAcCommand(AirConditioner ac){
        this.airConditioner=ac;
    }

    @Override
    public void execute() {
        airConditioner.turnOffAC();
    }
}
