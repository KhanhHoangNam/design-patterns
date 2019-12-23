package com.khanhhn.design_patterns.behavioral_patterns.chain_of_responsibility.second_example;

public class DeliveryManager extends Approver {
    @Override
    protected boolean canApprove(int numberOfDays) {
        return numberOfDays <= 5;
    }

    @Override
    protected void doApproving(LeaveRequest request) {
        System.out.println("Leave request approved for " + request.getDays() + " days by Delivery Manager");
    }
}
