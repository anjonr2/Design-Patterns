package com.designpatterns.behavioral.State;

public class ProductSelectedState implements VendingMachineState{
    @Override
    public void handleRequest() {
        System.out.print("Product selected state: Processing payment");
    }
}
