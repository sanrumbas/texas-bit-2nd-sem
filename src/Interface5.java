// Interface_One declaration
interface Interface_One {
    void print();
}

// Interface_Two declaration
interface Interface_Two {
    void show();
}

// Multiple inheritance: DemoClass implements Interface_One and Interface_Two
class DemoClass implements Interface_One, Interface_Two {
    // Override Interface_One print()
    public void print() {
        System.out.println("DemoClass::Interface_One_Print()");
    }
    // Override Interface_Two show()
    public void show() {
        System.out.println("DemoClass::Interface_Two_Show()");
    }
}

// oop.Main class
public class Interface5 {
    public static void main(String[] args) {
        DemoClass obj = new DemoClass(); // Create DemoClass object and call methods
        obj.print();
        obj.show();
    }
}
