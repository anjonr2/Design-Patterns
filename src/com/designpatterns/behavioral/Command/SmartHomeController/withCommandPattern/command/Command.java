package behavioral.Command.SmartHomeController.withCommandPattern.command;

public interface Command {
    void execute();
    void undo();
}
