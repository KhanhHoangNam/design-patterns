package com.khanhhn.design_patterns.behavioral_patterns.chain_of_responsibility.example1;

public class AppLogger {
    public static Logger getLogger() {
        Logger consoleLogger = new ConsoleLogger(LogLevel.DEBUG);
        Logger fileLogger = consoleLogger.setNext(new FileLogger(LogLevel.ERROR));
        fileLogger.setNext(new EmailLogger(LogLevel.FATAL));

        return consoleLogger;
    }
}
