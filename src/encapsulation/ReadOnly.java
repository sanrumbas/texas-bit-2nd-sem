package encapsulation;

class ReadOnly {
    private String message = "This is read-only data.";

    // Getter only
    public String getMessage() {
        return message;
    }

    // No setter method
}
