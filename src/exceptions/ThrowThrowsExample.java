package exceptions;

public class ThrowThrowsExample {

    // Method that declares it may throw an exception
    static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            // Throwing exception manually
            throw new IllegalArgumentException("Age must be 18 or above.");
        }
        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {
        try {
            checkAge(16); // This will throw exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        System.out.println("Program ends normally.");
    }
}
