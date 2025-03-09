package com.designpatterns.behavioral;

public class StateMain {
    public static void main(String []args){
        VendingMachineContext vendingMachine = new VendingMachineContext();
        //Set initial state
        vendingMachine.setState(new ReadyState());
        //request action for this particular state
        vendingMachine.request();
    }
}
