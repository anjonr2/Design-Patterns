package com.designpatterns.behavioral.State;

public class ReadyState implements VendingMachineState{
    @Override
    public void handleRequest() {
        System.out.println("Please select a product");
    }
}
