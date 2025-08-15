package oop.example4;

class GraduateStudent extends Student {
    private String thesisTitle;
    private String supervisorName;

    GraduateStudent(String name, int age, String rollNumber, String course,
                           String thesisTitle, String supervisorName) {
        super(name, age, rollNumber, course);
        this.thesisTitle = thesisTitle;
        this.supervisorName = supervisorName;
    }
    public String getSupervisorName() {
        return supervisorName;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Thesis Title: " + thesisTitle);
        System.out.println("Supervisor: " + supervisorName);
    }
}