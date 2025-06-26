package object.constructor;
class StudentConstructor{
    int id; //reference variable
    String name;

    //Parameterized Constructor
    StudentConstructor(int id, String name){
        System.out.println(id +" "+ name);
    }
}

public class Student3 {
    public static void main(String[] args) {
        StudentConstructor std = new StudentConstructor(101, "Santosh");
        StudentConstructor std2 = new StudentConstructor(120312312, "Texas ");
    }
}
