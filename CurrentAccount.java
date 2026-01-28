package com.assignment.oops;

public class CurrentAccount extends Account {
    public CurrentAccount(double balance) {
        super(balance, 0.0);
    }

    @Override
    public void calculateAndAddInterest() {
        System.out.print("Current Account: ");
        super.calculateAndAddInterest();
    }
}
