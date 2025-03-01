package com.designpatterns.behavioral.ChainOfResponsibility;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel==DEBUG){
            System.out.println("DEBUG: "+message);
        }else {
            super.log(logLevel, message);
        }
    }
}
