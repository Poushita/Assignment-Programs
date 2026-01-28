package com.assignment.oops;

public class Account {
    protected double balance;
    protected double interestRate;

    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void calculateAndAddInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest added: " + interest + " | New Balance: " + balance);
    }
}
