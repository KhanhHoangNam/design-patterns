package com.khanhhn.design_patterns.behavioral_patterns.chain_of_responsibility.second_example;

public class LeaveRequestWorkFlow {
    public static Approver getApprover() {
        Approver supervisor = new Supervisor();
        Approver manager = new DeliveryManager();
        Approver director = new Director();

        supervisor.setNext(manager);
        manager.setNext(director);

        return supervisor;
    }
}
