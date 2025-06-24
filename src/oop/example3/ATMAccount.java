package oop.example3;

// Class representing the ATM account
class ATMAccount {
    private String accountNumber;
    private int pin;
    private double balance;

    public ATMAccount(String accountNumber, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public boolean validatePIN(int inputPin) {
        return this.pin == inputPin;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount, int inputPin) {
        if (!validatePIN(inputPin)) {
            System.out.println("Incorrect PIN.");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining Balance: $" + balance);
        }
    }

    public void checkBalance(int inputPin) {
        if (validatePIN(inputPin)) {
            System.out.println("Your current balance is: $" + balance);
        } else {
            System.out.println("Incorrect PIN.");
        }
    }
}