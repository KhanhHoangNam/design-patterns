package com.khanhhn.design_patterns.behavioral_patterns.chain_of_responsibility.example1;

public enum LogLevel {
    NONE(0), INFO(1), DEBUG(2), WARNING(4), ERROR(8), FATAL(16), ALL(32);

    private int level;

    LogLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
