package exceptions;
// Custom exception class
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}
// Main class to use custom exception
public class CustomExceptionExample {
    static void withdraw(double amount) throws InsufficientBalanceException {
        double balance = 500.00;
        if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal failed: " +
                    "Insufficient balance.");
        }
        System.out.println("Withdrawal successful. Amount: " + amount);
    }

    public static void main(String[] args) {
        try {
            withdraw(600.00); // More than balance
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("Transaction complete.");
    }
}
