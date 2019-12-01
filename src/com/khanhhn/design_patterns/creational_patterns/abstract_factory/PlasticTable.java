package com.khanhhn.design_patterns.creational_patterns.abstract_factory;

public class PlasticTable implements Table {
    @Override
    public void create() {
        System.out.println("Create plastic table");
    }
}
