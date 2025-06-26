package object.method;
class StudentMethod{
    int id; //reference variable
    String name;
    //method
    void insertRecord(int i, String n){
        this.id = i;
        this.name = n;
    }
    void displayInfo(){
        System.out.println(id + " " + name);
    }
}
public class Student2 {
    public static void main(String[] args) {
        StudentMethod std = new StudentMethod();
        StudentMethod std2 = new StudentMethod();
        //calling insertREcord Method to initialize object
        std.insertRecord(101, "Texas College");
        std2.insertRecord(10111, "CHabahil");
        //calling displayInfo() method
        std.displayInfo();
        std2.displayInfo();
    }
}
