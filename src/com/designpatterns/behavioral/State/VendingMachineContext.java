package com.designpatterns.behavioral;

public class VendingMachineContext {
    private VendingMachineState state;

    public void setState(VendingMachineState state){
        this.state=state;
    }

    public void request(){
        //delegating the request to particular state obj
        state.handleRequest();
    }
}
