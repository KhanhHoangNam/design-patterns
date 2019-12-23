package com.khanhhn.design_patterns.behavioral_patterns.chain_of_responsibility.first_example;

public class FileLogger extends Logger {
    public FileLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("File logger: " + msg);
    }
}
