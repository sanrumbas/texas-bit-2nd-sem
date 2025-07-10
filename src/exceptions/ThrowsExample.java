package exceptions;

import java.io.*;

public class ThrowsExample {
    public static void main(String[] args) throws IOException {
        readFile();
    }
    public static void readFile() throws IOException{
        throw new IOException("File NOt FOund");
    }
}
