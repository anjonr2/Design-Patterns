package behavioral.Command.SmartHomeController.withoutCommandPattern;

public class ThermoStat {
    public void  setTemperature(int temperature){
        System.out.println("Thermostat set to "+temperature + "C");
    }
}
