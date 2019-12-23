package com.khanhhn.design_patterns.behavioral_patterns.chain_of_responsibility.second_example;

public class App {
    public static void main(String[] args) {
        LeaveRequestWorkFlow.getApprover().approveLeave(new LeaveRequest(2));
        System.out.println("-----");

        LeaveRequestWorkFlow.getApprover().approveLeave(new LeaveRequest(5));
        System.out.println("-----");

        LeaveRequestWorkFlow.getApprover().approveLeave(new LeaveRequest(7));
    }
}
