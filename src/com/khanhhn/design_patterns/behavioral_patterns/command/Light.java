package com.khanhhn.design_patterns.behavioral_patterns.command;

public class Light {
    private boolean status;

    public void turnOn() {
        this.status = true;
    }

    public void turnOff() {
        this.status = false;
    }

    @Override
    public String toString() {
        return "Status: " + (this.status ? "ON" : "OFF");
    }
}
