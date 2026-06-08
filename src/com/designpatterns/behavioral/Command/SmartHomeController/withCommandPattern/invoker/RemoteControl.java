package behavioral.Command.SmartHomeController.withCommandPattern.invoker;

import behavioral.Command.SmartHomeController.withCommandPattern.command.Command;

import java.util.Stack;

/*
    * The RemoteControl class is the invoker in the Command pattern.
    * It holds a history of executed commands and allows for undoing the last command.
    * It never knows what the commands do or which devices they affect
 */
public class RemoteControl {
    private final Stack<Command> history = new Stack<>();

    public void executeCommand(Command command){
        command.execute();
        history.push(command);
    }

    public void undoLast(){
        if (!history.isEmpty()){
            Command lastCommand = history.pop();
            lastCommand.undo();
        }else {
            System.out.println("No commands to undo");
        }
    }
}

/*
Remote control class is clean and focused
It does not import Light, Thermostat or any device class
It only depends on the Command interface
Adding a hundred new device types does not require changing a single line to this class
 */