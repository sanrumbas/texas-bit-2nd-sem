package constructor;

public class Main {
    public static void main(String[] args) {
        // Creating account object with initial values
        Account acc1 = new Account("Santos Rumba", 1000.0);

        // Display initial account details
        acc1.displayAccount();

        // Perform deposit
        acc1.deposit(500.0);

        // Perform withdrawal
        acc1.withdraw(300.0);

        // Display final account details
        acc1.displayAccount();
    }
}
