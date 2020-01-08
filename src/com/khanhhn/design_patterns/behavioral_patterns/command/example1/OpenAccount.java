package com.khanhhn.design_patterns.behavioral_patterns.command.example1;

public class OpenAccount implements Command {

    private Account account;

    public OpenAccount(Account account) {
        this.account = account;
    }

    @Override
    public void execute() {
        account.open();
    }
}
