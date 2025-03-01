package com.designpatterns.behavioral.ChainOfResponsibility;

public class ChainOfResponsibilityLoggingExample {
    public static void main(String []args){
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logObject.log(LogProcessor.ERROR, "Exception occurred");
    }
}
