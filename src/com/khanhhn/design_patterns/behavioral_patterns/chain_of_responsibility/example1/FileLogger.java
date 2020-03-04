package com.khanhhn.design_patterns.behavioral_patterns.chain_of_responsibility.example1;

public class FileLogger extends Logger {

    public FileLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("File logger: " + message);
    }
}
