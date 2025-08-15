package fileio;

import java.io.*;
public class FileIOExample {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try{
            inputStream = new FileInputStream("input.txt");
            outputStream = new FileOutputStream(" .txt");
            int byteData;
            while((byteData = inputStream.read()) != -1){
                outputStream.write(byteData);
            }
        }catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        } finally {
            try{
                if(inputStream != null) inputStream.close();
                if (outputStream != null) outputStream.close();
            }catch (IOException ex){
                System.out.println("Error Closing streams: " +ex.getMessage());
            }
        }
    }
}
