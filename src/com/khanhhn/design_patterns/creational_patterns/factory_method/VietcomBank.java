package com.khanhhn.design_patterns.creational_patterns.factory_method;

public class VietcomBank implements Bank {
    private static final String VIET_COM_BANK = "VietcomBank";
    @Override
    public void getBankName() {
        System.out.println(VIET_COM_BANK);
    }
}
