package client;

import Command.Command;
import Command.TvOffCommand;
import Command.TvOnCommand;
import controller.Remote;
import receiver.Tv;

public class TVClient {
    public static void main(String []args){
        /*client is the invoker*/
        /*invoker knows which command to invoke
        * executor knows how to execute the command
        * controller will take the command from the invoker to the executor*/

        Tv tv = new Tv(); //executor
        Remote remote = new Remote(); //controller

        Command turnOnCommand = new TvOnCommand(tv);
        Command turnOffCommand = new TvOffCommand(tv);

        remote.setCommand(turnOnCommand);
        remote.pressButton();
    }
}
