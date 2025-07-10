package oop.example4;

import java.util.*;
public class UniversitySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of graduate students: ");
        int n = sc.nextInt();
        sc.nextLine();  // consume newline

        GraduateStudent[] students = new GraduateStudent[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Roll Number: ");
            String rollNumber = sc.nextLine();

            System.out.print("Course: ");
            String course = sc.nextLine();

            System.out.print("Thesis Title: ");
            String thesisTitle = sc.nextLine();

            System.out.print("Supervisor Name: ");
            String supervisor = sc.nextLine();
            students[i] = new GraduateStudent(name, age, rollNumber, course, thesisTitle, supervisor);
        }
        System.out.print("\nEnter supervisor name to search: ");
        String searchSupervisor = sc.nextLine();

        System.out.println("\n--- Students under Supervisor: " + searchSupervisor + " ---");
        boolean found = false;
        for (GraduateStudent gs : students) {
            if (gs.getSupervisorName().equalsIgnoreCase(searchSupervisor)) {
                System.out.println("--------------------------");
                gs.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No graduate students found under supervisor: " + searchSupervisor);
        }

        sc.close();
    }
}
