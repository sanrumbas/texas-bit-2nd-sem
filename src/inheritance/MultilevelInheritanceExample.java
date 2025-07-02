package inheritance;

class One{
    void display(){
        System.out.println("Parent inheritance.One Class");
    }
}
class Two extends One{
    void displayTwo(){
        System.out.println("Derived CLass inheritance.Two");
    }
}
public class MultilevelInheritanceExample extends Two{
    public static void main(String[] args) {
        MultilevelInheritanceExample me = new MultilevelInheritanceExample();
        me.display();
        me.displayTwo();
    }
}
