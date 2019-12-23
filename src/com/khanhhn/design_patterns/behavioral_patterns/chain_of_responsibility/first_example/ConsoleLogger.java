package com.khanhhn.design_patterns.behavioral_patterns.chain_of_responsibility.first_example;

public class ConsoleLogger extends Logger {
    public ConsoleLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("Console logger: " + msg);
    }
}
