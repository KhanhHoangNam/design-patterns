package com.khanhhn.design_patterns.behavioral_patterns.template_method;

public abstract class Page {
    void print() {
        System.out.println("=========================");
        printHeader();
        printBody();
        printFooter();
        System.out.println("=========================");
    };

    protected abstract void printHeader();
    protected abstract void printBody();
    protected abstract void printFooter();
}
