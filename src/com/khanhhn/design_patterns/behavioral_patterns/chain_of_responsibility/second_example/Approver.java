package com.khanhhn.design_patterns.behavioral_patterns.chain_of_responsibility.second_example;

public abstract class Approver {
    protected Approver nextApprover;

    public void approveLeave(LeaveRequest request) {
        System.out.println("Checking permission for " + this.getClass().getSimpleName());
        if (this.canApprove(request.getDays())) {
            this.doApproving(request);
        } else if (nextApprover != null) {
            nextApprover.approveLeave(request);
        }
    }

    public void setNext(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    protected abstract boolean canApprove(int numberOfDays);

    protected abstract void doApproving(LeaveRequest request);
}
