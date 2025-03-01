package com.designpatterns.behavioral.ChainOfResponsibility;

public class InfoLogProcessor extends LogProcessor{
    public InfoLogProcessor(LogProcessor loggerProcessor) {
        super(loggerProcessor);
    }
    public void log(int logLevel, String message){
        if(logLevel==INFO){
            System.out.println("INFO: "+message);
        }else {
            // if log level is not info then we pass it next logger handler to process the message
            super.log(logLevel,message);
        }
    }
}
