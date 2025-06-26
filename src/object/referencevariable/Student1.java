package object.referencevariable;
//object initialization through reference variable
class Student{
    int id; //reference variable
    String name;
}

public class Student1 {
    public static void main(String[] args) {
        Student std = new Student();
        //assigning value to reference variable
        std.id = 101;
        std.name = "Texas";
        System.out.println(std.id +" "+std.name);
    }
}
