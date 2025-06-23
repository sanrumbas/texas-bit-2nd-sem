// Parent class
class Animal {
    String color = "Brown";//instance variable
    //method
    void display() {
        System.out.println("Animal is walking");
    }
    //constructor
    Animal() {
        System.out.println("Animal constructor called");
    }
}
// Child class
class Dog extends Animal {
    String color = "Black";

    Dog() {
        // Calls parent class constructor
        super();
        System.out.println("Dog constructor called");
    }

    void showColor() {
        // Access parent class variable
        System.out.println("Dog color: " + color);
        System.out.println("Animal color: " + super.color);
    }

    void display() {
        // Call parent class method
        super.display();
        System.out.println("Dog is walking");
    }
}

// oop.Main class
public class TestSuper {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.showColor();
        d.display();
    }
}
