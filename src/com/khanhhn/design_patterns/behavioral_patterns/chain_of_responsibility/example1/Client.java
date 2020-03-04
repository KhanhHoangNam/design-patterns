package com.khanhhn.design_patterns.behavioral_patterns.chain_of_responsibility.example1;

public class Client {
    public static void main(String[] args) {
        /*
         * Build the chain of responsibility
         */
        Logger logger = AppLogger.getLogger();
        System.out.println("-----------------|______|-----------------");

        /*
         * Handled by ConsoleLogger since the console has a LogLevel of DEBUG
         */
        logger.log(LogLevel.INFO, "Info message");
        logger.log(LogLevel.DEBUG, "Debug message");
        System.out.println("-----------------|______|-----------------");

        /*
         * Handled by ConsoleLogger and FileLogger
         */
        logger.log(LogLevel.ERROR, "Error message");
        System.out.println("-----------------|______|-----------------");

        /*
         * Handled by ConsoleLogger, FileLogger, EmailLogger
         */
        logger.log(LogLevel.FATAL, "Fatal message");
        System.out.println("-----------------|______|-----------------");
    }
}
