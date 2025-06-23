class One{
    void display(){
        System.out.println("Parent One Class");
    }
}
class Two extends One{
    void displayTwo(){
        System.out.println("Derived CLass Two");
    }
}
public class MultilevelInheritanceExample extends Two{
    public static void main(String[] args) {
        MultilevelInheritanceExample me = new MultilevelInheritanceExample();
        me.display();
        me.displayTwo();
    }
}
