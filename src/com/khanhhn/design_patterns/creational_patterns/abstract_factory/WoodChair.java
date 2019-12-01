package com.khanhhn.design_patterns.creational_patterns.abstract_factory;

public class WoodChair implements Chair {

    @Override
    public void create() {
        System.out.println("Create wood chair");
    }
}
