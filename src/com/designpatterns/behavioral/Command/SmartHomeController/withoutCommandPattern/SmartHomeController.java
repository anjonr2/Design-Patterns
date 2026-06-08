package behavioral.Command.SmartHomeController.withoutCommandPattern;

public class SmartHomeController {
    private final Light light;
    private final ThermoStat thermoStat;

    public SmartHomeController(Light light, ThermoStat thermoStat) {
        this.light = light;
        this.thermoStat = thermoStat;
    }

    public void turnOnLight(){
        light.on();
    }

    public void turnOffLight(){
        light.off();
    }

    public void setThermoStatTemperature(int temperature){
        thermoStat.setTemperature(temperature);
    }
}
