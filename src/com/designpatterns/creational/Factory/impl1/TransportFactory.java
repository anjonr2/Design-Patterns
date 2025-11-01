package com.designpatterns.creational.Factory.impl1;

public class TransportFactory {
    public static Transport getTransport(String transportType){
        if(transportType.equalsIgnoreCase("Truck")){
            return new Truck();
        }else if(transportType.equalsIgnoreCase("Ship")){
            return new Ship();
        }
        return null;
    }
}
