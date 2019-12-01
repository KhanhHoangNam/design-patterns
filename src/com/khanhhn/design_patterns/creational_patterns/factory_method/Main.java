package com.khanhhn.design_patterns.creational_patterns.factory_method;

public class Main {
    public static void main(String[] args) {
        Bank tpBank = BankFactory.getBank(BankType.TPBANK);
        tpBank.getBankName();

        Bank vietComBank = BankFactory.getBank(BankType.VIETCOMBANK);
        vietComBank.getBankName();

        Bank mbBank = BankFactory.getBank(BankType.MBBANK);
        mbBank.getBankName();
    }
}
