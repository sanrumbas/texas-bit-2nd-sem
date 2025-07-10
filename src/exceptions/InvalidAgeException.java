package exceptions;

// Custom exception class
public class InvalidAgeException extends Exception {
    // Constructor
    public InvalidAgeException(String message) {
        super(message);  // Call the constructor of the Exception class
    }
}
