package encapsulation;

public class Main {
    public static void main(String[] args) {
        // Write-Only example
        WriteOnly writeObj = new WriteOnly();
        writeObj.setSecret("Hidden Data");

        // Read-Only example
        ReadOnly readObj = new ReadOnly();
        System.out.println("Read-Only Message: " + readObj.getMessage());
    }
}
