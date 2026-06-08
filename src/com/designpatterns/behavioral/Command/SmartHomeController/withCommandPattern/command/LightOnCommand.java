package behavioral.Command.SmartHomeController.withCommandPattern.command;


import behavioral.Command.SmartHomeController.withCommandPattern.receivers.Light;

public class LightOnCommand implements Command{
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
