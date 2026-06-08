package behavioral.Command.SmartHomeController.withCommandPattern.command;


import behavioral.Command.SmartHomeController.withCommandPattern.receivers.ThermoStat;

public class SetTemperatureCommand implements Command{
    private final ThermoStat thermoStat;
    private final int newTemperature;
    private int previousTemperature;

    public SetTemperatureCommand(ThermoStat thermoStat, int newTemperature) {
        this.thermoStat = thermoStat;
        this.newTemperature = newTemperature;
    }

    @Override
    public void execute() {
        previousTemperature = thermoStat.getCurrentTemperature();
        thermoStat.setTemperature(newTemperature);
    }

    @Override
    public void undo() {
        thermoStat.setTemperature(previousTemperature);
    }
}
