package com.designpatterns.behavioral;

public class ReadyState implements VendingMachineState{
    @Override
    public void handleRequest() {
        System.out.println("Please select a product");
    }
}
