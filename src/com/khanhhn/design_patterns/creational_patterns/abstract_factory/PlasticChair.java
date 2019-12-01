package com.khanhhn.design_patterns.creational_patterns.abstract_factory;

public class PlasticChair implements Chair {
    @Override
    public void create() {
        System.out.println("Create plastic chair");
    }
}
