package oop.task3;

import java.util.Scanner;
public class StudentGradingSystem {

    // Method to calculate grade based on marks
    public static String calculateGrade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking Name Input
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();

            // Formatting Name: Trim and Capitalize
            name = name.trim();
            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

            // Taking Marks Input
            System.out.print("Enter Marks (0-100): ");
            String marksInput = scanner.nextLine();

            // Validate numeric format
            int marks;
            try {
                marks = Integer.parseInt(marksInput);
            } catch (NumberFormatException e) {
                throw new InvalidMarkException("Marks must be a valid integer.");
            }

            // Validate range
            if (marks < 0 || marks > 100) {
                throw new InvalidMarkException("Marks must be between 0 and 100.");
            }

            // Calculate grade and print result
            String grade = calculateGrade(marks);
            System.out.println("\n--- Student Report ---");
            System.out.println("Name  : " + name);
            System.out.println("Marks : " + marks);
            System.out.println("Grade : " + grade);

        } catch (InvalidMarkException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("\nProcess completed. Thank you!");
            scanner.close();
        }
    }
}