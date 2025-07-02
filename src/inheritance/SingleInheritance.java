package inheritance;

class SingleInh{
    public void display(){
        System.out.println("Texas College");
    }
}
public class SingleInheritance extends SingleInh {
    public static void main(String[] args) {
        SingleInheritance sh = new SingleInheritance();
        sh.display();
    }
}
