package com.khanhhn.design_patterns.behavioral_patterns.command;

public class RemoteControl {
    private ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        this.command.execute();
    }
}
