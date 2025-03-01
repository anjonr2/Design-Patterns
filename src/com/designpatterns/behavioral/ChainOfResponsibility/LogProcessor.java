package com.designpatterns.behavioral.ChainOfResponsibility;

public abstract class LogProcessor {
    public  static int INFO = 1;
    public  static int DEBUG = 1;
    public  static int ERROR = 1;

    LogProcessor nextLoggerProcessor;

    public LogProcessor(LogProcessor loggerProcessor){
        this.nextLoggerProcessor=loggerProcessor;
    }
    public void log(int logLevel,String message){
        if(nextLoggerProcessor!=null){
            nextLoggerProcessor.log(logLevel,message);
        }
    }
}
