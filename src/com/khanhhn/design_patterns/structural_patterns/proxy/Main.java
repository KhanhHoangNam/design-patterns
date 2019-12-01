package com.khanhhn.design_patterns.structural_patterns.proxy;

public class Main {
    public static void main(String[] args) {
        ICalculator calculator = new CalculatorProxy();

        double result = calculator.add(1,Double.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(result);
    }
}
