package behavioral.Command.SmartHomeController.withCommandPattern;

import behavioral.Command.SmartHomeController.withCommandPattern.command.Command;
import behavioral.Command.SmartHomeController.withCommandPattern.command.LightOffCommand;
import behavioral.Command.SmartHomeController.withCommandPattern.command.LightOnCommand;
import behavioral.Command.SmartHomeController.withCommandPattern.command.SetTemperatureCommand;
import behavioral.Command.SmartHomeController.withCommandPattern.invoker.RemoteControl;
import behavioral.Command.SmartHomeController.withCommandPattern.receivers.Light;
import behavioral.Command.SmartHomeController.withCommandPattern.receivers.ThermoStat;
import controller.Remote;

/*
Client class
 */
public class SmartHomeApp {
    public static void main(String [] args){
        Light light = new Light();
        ThermoStat thermoStat = new ThermoStat();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command setTemp = new SetTemperatureCommand(thermoStat,22);

        /* invoker */
        RemoteControl remote = new RemoteControl();

        System.out.println("------ Executing Commands ------");
        remote.executeCommand(lightOn);
        remote.executeCommand(setTemp);
        remote.executeCommand(lightOff);

        System.out.println("------ Undoing Commands ------");
        remote.undoLast();
        remote.undoLast();
        remote.undoLast();
        remote.undoLast();
    }
}
