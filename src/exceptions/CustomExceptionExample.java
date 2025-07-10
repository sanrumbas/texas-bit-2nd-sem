package exceptions;

class MyException extends Exception{
    MyException(String message){
        super(message);
    }
}
public class CustomExceptionExample {
    public static void main(String[] args) {
        try{
            throw new MyException("This is a custom Exception");
        }catch (MyException e){
            System.out.println("Custom Exception caught: "+ e);
        }
    }
}
