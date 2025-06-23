class StudentGet{
    private String name;
    public String getName(){
        return name;
    }
}
public class EncapsulationGetExample {
    public static void main(String[] args) {
        StudentGet sg = new StudentGet();
        System.out.println(sg.getName());
    }
}
