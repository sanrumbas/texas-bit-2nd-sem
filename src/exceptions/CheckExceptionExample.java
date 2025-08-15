package exceptions;

import java.io.*;

public class CheckExceptionExample {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("abc.txt");
        }catch(Exception e){
            System.out.println("FIle Not Found: " +e);
        }
    }
}
