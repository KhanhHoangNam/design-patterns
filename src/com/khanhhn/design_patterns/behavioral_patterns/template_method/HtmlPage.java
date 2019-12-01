package com.khanhhn.design_patterns.behavioral_patterns.template_method;

public class HtmlPage extends Page {
    @Override
    protected void printHeader() {
        System.out.println("HTML Header");
    }

    @Override
    protected void printBody() {
        System.out.println("HTML Body");
    }

    @Override
    protected void printFooter() {
        System.out.println("HTML Footer");
    }
}
