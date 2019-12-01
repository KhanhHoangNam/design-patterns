package com.khanhhn.design_patterns.creational_patterns.abstract_factory;

public class Main {
    public static void main(String[] args) {
        FurnitureAbstractFactory woodFactory = FurnitureFactory.getFactory(MaterialType.WOOD);
        Chair chair = woodFactory.createChair();
        chair.create();

        Table table = woodFactory.createTable();
        table.create();

        System.out.println("--------------------------------");

        FurnitureAbstractFactory plasticFactory = FurnitureFactory.getFactory(MaterialType.PLASTIC);
        Chair plasticChair = plasticFactory.createChair();
        plasticChair.create();

        Table plasticTable = plasticFactory.createTable();
        plasticTable.create();
    }
}
