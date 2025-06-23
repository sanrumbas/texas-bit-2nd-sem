package encapsulation;

class WriteOnly {
    private String secret;

    // Setter only
    public void setSecret(String secret) {
        this.secret = secret;
    }

    // No getter method
}
