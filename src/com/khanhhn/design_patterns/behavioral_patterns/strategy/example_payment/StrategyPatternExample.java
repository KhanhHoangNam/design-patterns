package com.khanhhn.design_patterns.behavioral_patterns.strategy.example_payment;

public class StrategyPatternExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item first_item = new Item("First Item", 40);
        Item second_item = new Item("Second Item", 80);

        cart.addItem(first_item);
        cart.addItem(second_item);

        cart.pay(new Paypal("tata.namkhanh@gmail.com", "nothingtolose"));
        cart.pay(new CreditCard("NamKhanh", "0101", "010", "202210707"));
    }
}
