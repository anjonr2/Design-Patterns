package behavioral.Command.SmartHomeController.withoutCommandPattern;

public class SmartHomeDemo {
    public static void main(String[] args){
        Light livingRoomLight = new Light();
        ThermoStat thermoStat = new ThermoStat();

        SmartHomeController controller = new SmartHomeController(livingRoomLight, thermoStat);
        controller.turnOnLight();
        controller.setThermoStatTemperature(22);
        controller.turnOffLight();
    }
}

/*
This simple controller works for now, but quickly falls apart as complexity increases

SmartHomeController is directly tied every device and their specific method names
Every new device requires adding new fields and new methods to the controller

Adding a new device means adding new fields to the controller
writing more methods for each action, and growing a single class into a bloated monolith

Also there is no way to reverse the command. To undo or redo any action
 */