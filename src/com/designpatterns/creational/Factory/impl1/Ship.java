package com.designpatterns.creational.Factory.impl1;

public class Ship implements Transport{
    @Override
    public void deliverItem() {
        System.out.println("Delivering item by Ship");
    }
}
