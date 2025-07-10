package exceptions;

public class ErrorExample1 {
    public static void main(String[] args) {
        causeStackOverflow();
    }
    public static void causeStackOverflow(){
        causeStackOverflow(); //Infinite Loop
    }
}
