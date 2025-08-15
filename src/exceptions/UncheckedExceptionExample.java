package exceptions;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        try{
            float a = 10 / 3;
            System.out.println(a);
        }catch (ArithmeticException e){
            System.out.println("Exception Occur: "+e);
        }finally {
            System.out.println("Texas College");
        }

    }
}
