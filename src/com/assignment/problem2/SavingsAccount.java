package com.assignment.problem2;

public class SavingsAccount {

    private static double annualInterestRate = 0.0;

    private double savingsBalance;

    public SavingsAccount(double balance){
        savingsBalance = balance;
    }

    public void calculateMonthlyInterest(){
        double interest;
        interest = (savingsBalance * (annualInterestRate / 100)) / 12;
        savingsBalance += interest;
    }
    public static void modifyInterestRate(double newRate){
        annualInterestRate = newRate;
    }

    public void displayBalance() {
        System.out.printf("%.2f", savingsBalance);
    }

    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount(2000.0); // initializing first instance
        SavingsAccount saver2 = new SavingsAccount(3000.0); // initializing second instance
        SavingsAccount.modifyInterestRate(4.0); // setting interest rate to 4.0%
        System.out.println("Month \t\t Saver1 \t Saver2");


        for(int i=1; i<=12; ++i){

            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

            System.out.print("Month " + i + ": \t");

            saver1.displayBalance();
            System.out.print("\t");

            saver2.displayBalance();
            System.out.println("\t");
        }
        System.out.println();

        System.out.println("Setting the Interest Rate to 5.0%");

        SavingsAccount.modifyInterestRate(5.0); // Changing the interest rate to 5.0%


        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();


        System.out.print("Month 13: \t");
        saver1.displayBalance();
        System.out.print("\t");
        saver2.displayBalance();
        System.out.println();
    }
}
