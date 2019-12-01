package com.khanhhn.design_patterns.behavioral_patterns.template_method;

public class Main {
    public static void main(String[] args) {
        Page htmlPage = new HtmlPage();
        Page pdfPage = new PdfPage();

        htmlPage.print();
        pdfPage.print();
    }
}
