package com.khanhhn.design_patterns.behavioral_patterns.observer;

public class Mailer implements Observer {
    @Override
    public void update(User user) {
        if (user.getStatus() == LoginStatus.EXPIRED) {
            System.out.println("Mailer: User " + user.getEmail());
        }
    }
}
