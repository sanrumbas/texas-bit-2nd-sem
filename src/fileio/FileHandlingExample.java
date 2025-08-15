package fileio;

import java.io.*;
public class FileHandlingExample {
    public static void main(String[] args) {
        String filename = "example.txt";
        // 1. Create a file
        try {
            File file = new File(filename);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            // 2. Write to the file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is a file handling example in Java!");
            writer.close();
            System.out.println("Successfully wrote to the file.");

            // 3. Read from the file
            FileReader reader = new FileReader(file);
            int character;
            System.out.print("File content: ");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
