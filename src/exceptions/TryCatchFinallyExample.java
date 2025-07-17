package exceptions;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            // This will cause ArrayIndexOutOfBoundsException
            System.out.println("Accessing 4th element: " + numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes.");
        }
        System.out.println("Program continues after exception handling.");
    }
}
