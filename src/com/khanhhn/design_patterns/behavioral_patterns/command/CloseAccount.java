package com.khanhhn.design_patterns.behavioral_patterns.command;

public class CloseAccount implements Command {

    private Account account;

    public CloseAccount(Account account) {
        this.account = account;
    }

    @Override
    public void execute() {
        account.close();
    }
}
