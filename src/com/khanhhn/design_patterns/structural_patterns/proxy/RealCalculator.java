package com.khanhhn.design_patterns.structural_patterns.proxy;

public class RealCalculator implements ICalculator {
    @Override
    public double add(double first, double second) {
        return first + second;
    }

    @Override
    public double div(double first, double second) {
        return first / second;
    }
}
