package com.khanhhn.design_patterns.creational_patterns.singleton;

public class Main {
    public static void main(String[] args) {
        Connection connection = Connection.getInstance();
        Connection firstConnection = Connection.getInstance();
        Connection secondConnection = Connection.getInstance();
        Connection thirdConnection = Connection.getInstance();

    }
}
