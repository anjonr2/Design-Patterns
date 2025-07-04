package com.designpatterns.creational.Singleton.SingletonImpl;

public class Logger {
    private static Logger logger = null;
    private Logger(){
         //private constructor to prevent multiple creation of multiple instances
    }

    public static Logger getLogger(){
        if(logger==null){
            logger= new Logger();
        }
        return  logger;
    }

    public void log(String message){
        System.out.println("Log: "+message);
    }
}
