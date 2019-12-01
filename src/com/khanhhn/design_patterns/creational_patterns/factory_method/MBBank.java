package com.khanhhn.design_patterns.creational_patterns.factory_method;

public class MBBank implements Bank {
    private static final String MB_BANK = "MBBank";
    @Override
    public void getBankName() {
        System.out.println(MB_BANK);
    }
}
