package com.khanhhn.design_patterns.behavioral_patterns.chain_of_responsibility.example1;

public class EmailLogger extends Logger {

    public EmailLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Email logger: " + message);
    }
}
