package com.khanhhn.design_patterns.behavioral_patterns.strategy.example_payment;

public class Paypal implements PaymentStrategy{
    private String emailId;
    private String password;

    public Paypal(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " using Paypal");
    }
}
