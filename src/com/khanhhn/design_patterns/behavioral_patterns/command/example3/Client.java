package com.khanhhn.design_patterns.behavioral_patterns.command.example3;

public class Client {
    public static void main(String[] args) {
        DocumentInvoker instance = new DocumentInvoker();

        instance.write("The 1st text. ");

        instance.undo();
        instance.redo();
        instance.read();

        instance.redo();
        instance.read();

    }
}
