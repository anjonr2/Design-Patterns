package com.designpatterns.behavioral.Command.ACExample;

public class AcControllerClient {
    public static void main(String []args){
        //invoker
        AcRemoteControl remoteControlObj = new AcRemoteControl();
        //receiver
        AirConditioner airConditioner = new AirConditioner();
        //prepare turn on ac command
        remoteControlObj.setCommand(new TurnAcOnCommand(airConditioner));
        remoteControlObj.pressButton();
    }
}
