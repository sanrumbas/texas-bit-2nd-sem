package encapsulation;

class Student {
    // private data member
    private String name;

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }
}

// Main class to test the Student class
public class Main2 {
    public static void main(String[] args) {
        // Creating an object of Student
        Student student1 = new Student();

        // Using setter to assign name
        student1.setName("Santos Rumba");

        // Using getter to retrieve name
        System.out.println("Student Name: " + student1.getName());
    }
}
