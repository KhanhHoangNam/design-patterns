package com.khanhhn.design_patterns.structural_patterns.proxy;

public class CalculatorProxy implements ICalculator {
    private RealCalculator realCalculator;

    public CalculatorProxy() {
        this.realCalculator = new RealCalculator();
    }

    @Override
    public double add(double first, double second) {
        if (first / 2 + second / 2 >= Double.MAX_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        if (first / 2 + second / 2 <= Double.MIN_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        return this.realCalculator.add(first, second);
    }

    @Override
    public double div(double first, double second) {
        if (second == 0) {
            throw new RuntimeException("Can't divide by zero");
        }
        return this.realCalculator.div(first, second);
    }
}
