package oop.example4;
class Student extends Person {
    private String rollNumber;
    private String course;
    Student(String name, int age, String rollNumber, String course) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.course = course;
    }
    // Getters
    public String getRollNumber() {
        return rollNumber;
    }
    public String getCourse() {
        return course;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}