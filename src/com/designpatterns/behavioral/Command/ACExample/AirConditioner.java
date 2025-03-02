package com.designpatterns.behavioral.Command.ACExample;

public class AirConditioner {
    boolean isOn;
    int temperature;

    public void turnOnAc(){
        isOn=true;
        System.out.println("AC is ON");
    }

    public void turnOffAC(){
        isOn=false;
        System.out.println("AC is OFF");
    }

    public void setTemperature(int temperature){
        this.temperature=temperature;
        System.out.println("Temperature is changed to: " + temperature);
    }
}
