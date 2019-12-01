package com.khanhhn.design_patterns.behavioral_patterns.template_method;

public class PdfPage extends Page {
    @Override
    void printHeader() {
        System.out.println("PDF Header");
    }

    @Override
    void printBody() {
        System.out.println("PDF Body");
    }

    @Override
    void printFooter() {
        System.out.println("PDF Footer");
    }
}
