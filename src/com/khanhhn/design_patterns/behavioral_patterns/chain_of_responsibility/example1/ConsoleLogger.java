package com.khanhhn.design_patterns.behavioral_patterns.chain_of_responsibility.example1;

public class ConsoleLogger extends Logger {

    public ConsoleLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Console logger: " + message);
    }
}
