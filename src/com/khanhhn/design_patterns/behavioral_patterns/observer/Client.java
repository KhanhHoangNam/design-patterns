package com.khanhhn.design_patterns.behavioral_patterns.observer;

public class Client {
    public static void main(String[] args) {
        AccountService account1 = createAccount("contact@gpcoder.com", "127.0.0.1");
        account1.login();
        account1.changeStatus(LoginStatus.EXPIRED);

        System.out.println("---");
        AccountService account2 = createAccount("contact@khanhhn.com", "192.168.0.106");
        account2.login();
    }

    private static AccountService createAccount(String email, String ip) {
        AccountService account = new AccountService(email, ip);
        account.attach(new Logger());
        account.attach(new Mailer());
        account.attach(new Protector());
        return account;
    }
}
