package constructor;

class Account {
    private String name;
    private double amount;

    // Constructor to initialize account name and amount
    public Account(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    // Method to deposit amount
    public void deposit(double depositAmount) {
        if (depositAmount > 0) {
            amount += depositAmount;
            System.out.println("Deposited: " + depositAmount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw amount
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > 0 && withdrawAmount <= amount) {
            amount -= withdrawAmount;
            System.out.println("Withdrawn: " + withdrawAmount);
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal!");
        }
    }

    // Method to display account details
    public void displayAccount() {
        System.out.println("Account Holder: " + name);
        System.out.println("Current Balance: " + amount);
    }
}
