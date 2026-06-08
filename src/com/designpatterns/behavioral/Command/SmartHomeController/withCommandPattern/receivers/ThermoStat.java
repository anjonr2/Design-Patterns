package behavioral.Command.SmartHomeController.withCommandPattern.receivers;

public class ThermoStat {
    private int currentTemperature = 20;

    public void setTemperature(int temperature){
        System.out.println("ThermoStat temperature is set to "+temperature+"C");
        currentTemperature = temperature;
    }

    public int getCurrentTemperature(){
        return currentTemperature;
    }
}
