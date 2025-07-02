package inheritance;

class HiParent{
    void display(){
        System.out.println("Parent Class");
    }
}
class DeOne extends HiParent{
    void displayOne(){
        System.out.println("Derived CLass inheritance.One");
    }
}
class DeTwo extends HiParent{
    void displayTwo(){
        System.out.println("Derived Class inheritance.Two");
    }
}
public class HIexample {
    public static void main(String[] args) {
        DeOne de = new DeOne();
        DeTwo dt = new DeTwo();
        de.display();
        de.displayOne();
        dt.display();
        dt.displayTwo();
    }
}
