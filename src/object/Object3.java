package object;

class Student9 {
    String name;
    int rollno;

    Student9(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
}

public class Object3 {
    public static void main(String[] args) {
        Student9 s1 = new Student9("Sara", 101);
        Student9 s2 = new Student9("Abhijit", 102);
        Student9 s3 = new Student9("Neelam", 101);
        Student9 s5 = new Student9("Vaman", 101);
        Student9 s4 = s1;

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
    }
}
