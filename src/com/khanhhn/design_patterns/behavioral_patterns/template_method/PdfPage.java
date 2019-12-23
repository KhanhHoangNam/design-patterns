package com.khanhhn.design_patterns.behavioral_patterns.template_method;

public class PdfPage extends Page {
    @Override
    public void printHeader() {
        System.out.println("PDF Header");
    }

    @Override
    public void printBody() {
        System.out.println("PDF Body");
    }

    @Override
    public void printFooter() {
        System.out.println("PDF Footer");
    }
}
