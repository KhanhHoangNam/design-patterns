package com.khanhhn.design_patterns.creational_patterns.singleton;

class Connection {
    private static Connection _instance;

    private Connection() {}

    static Connection getInstance() {
        if (_instance == null) {
            synchronized (Connection.class) {
                _instance = new Connection();
            }
        }
        return _instance;
    }
}
