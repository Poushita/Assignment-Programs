package com.assignment.oops;

public class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        super(balance, 4.0);
    }

    @Override
    public void calculateAndAddInterest() {
        System.out.print("Savings Account: ");
        super.calculateAndAddInterest();
    }
}
