package com.khanhhn.design_patterns.structural_patterns.facade;

public class FacebookShare implements IShare {
    private String message;

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        //Complicated....
        System.out.println("Sharing to Facebook: " + message);
    }
}
