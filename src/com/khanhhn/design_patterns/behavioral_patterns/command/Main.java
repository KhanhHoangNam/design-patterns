package com.khanhhn.design_patterns.behavioral_patterns.command;

public class Main {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Light light = new Light();

        control.setCommand(new TurnOnCommand(light));
        control.pressButton();

        System.out.println(light);

        control.setCommand(new TurnOffCommand(light));
        control.pressButton();

        System.out.println(light);
    }
}
