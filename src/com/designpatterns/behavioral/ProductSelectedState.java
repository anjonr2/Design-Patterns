package com.designpatterns.behavioral;

public class ProductSelectedState implements VendingMachineState{
    @Override
    public void handleRequest() {
        System.out.print("Product selected state: Processing payment");
    }
}
