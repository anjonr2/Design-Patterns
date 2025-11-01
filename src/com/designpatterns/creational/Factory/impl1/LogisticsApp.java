package com.designpatterns.creational.Factory.impl1;

public class LogisticsApp {
    public  static void main(String []args){
        final Transport truck = TransportFactory.getTransport("Truck");
        truck.deliverItem();

        final Transport ship = TransportFactory.getTransport("Ship");
        ship.deliverItem();
    }
}
