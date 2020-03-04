package com.khanhhn.design_patterns.behavioral_patterns.chain_of_responsibility.example1;

public abstract class Logger {

    protected LogLevel logLevel;

    protected Logger nextLogger;

    public Logger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public Logger setNext(Logger nextLogger) {
        this.nextLogger = nextLogger;
        return nextLogger;
    }

    public void log(LogLevel severity, String message) {
        if (logLevel.getLevel() <= severity.getLevel()) {
            writeMessage(message);
        }

        if (nextLogger != null) {
            nextLogger.log(severity, message);
        }
    }

    protected abstract void writeMessage(String message);
}
