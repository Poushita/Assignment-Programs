package com.assignment.oops;

public class Runner {

    public static void main(String[] args) {
        
        SavingsAccount savings = new SavingsAccount(1000);
        savings.calculateAndAddInterest(); 

        System.out.println("-------------------------");

        CurrentAccount current = new CurrentAccount(2000);
        current.calculateAndAddInterest();
    }
}
