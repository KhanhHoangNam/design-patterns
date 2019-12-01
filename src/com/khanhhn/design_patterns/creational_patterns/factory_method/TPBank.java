package com.khanhhn.design_patterns.creational_patterns.factory_method;

public class TPBank implements Bank {
    private static final String TP_BANK = "TPBank";

    @Override
    public void getBankName() {
        System.out.println(TP_BANK);
    }
}
