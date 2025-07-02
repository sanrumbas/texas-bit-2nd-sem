package interfaceexampls;

// interfaceexampls.Interface_One declaration
interface Interface_One {
    void print();
}

// interfaceexampls.Interface_Two declaration
interface Interface_Two {
    void show();
}

// Multiple inheritance: interfaceexampls.DemoClass implements interfaceexampls.Interface_One and interfaceexampls.Interface_Two
class DemoClass implements Interface_One, Interface_Two {
    // Override interfaceexampls.Interface_One print()
    public void print() {
        System.out.println("interfaceexampls.DemoClass::Interface_One_Print()");
    }
    // Override interfaceexampls.Interface_Two show()
    public void show() {
        System.out.println("interfaceexampls.DemoClass::Interface_Two_Show()");
    }
}

// oop.Main class
public class Interface5 {
    public static void main(String[] args) {
        DemoClass obj = new DemoClass(); // Create interfaceexampls.DemoClass object and call methods
        obj.print();
        obj.show();
    }
}
