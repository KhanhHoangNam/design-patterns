package com.khanhhn.design_patterns.creational_patterns.factory_method;

class BankFactory {
    private BankFactory() {}

    static Bank getBank(BankType bankType) {
        switch (bankType) {
            case VIETCOMBANK:
                return new VietcomBank();
            case MBBANK:
                return new MBBank();
            case TPBANK:
                return new TPBank();
            default:
                throw new UnsupportedOperationException("This bank type is not supported");
        }
    }
}
