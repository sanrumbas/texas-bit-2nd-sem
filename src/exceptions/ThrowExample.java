package exceptions;

public class ThrowExample {
    public static void main(String[] args) {
        int age = 15;
        if(age < 18){
            throw new ArithmeticException("AGe must be greater than 18");
        }else{
            System.out.println("Access Granted");
        }
    }
}
