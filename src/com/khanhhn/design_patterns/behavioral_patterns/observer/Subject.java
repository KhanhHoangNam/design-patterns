package com.khanhhn.design_patterns.behavioral_patterns.observer;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyAllObserver();
}
