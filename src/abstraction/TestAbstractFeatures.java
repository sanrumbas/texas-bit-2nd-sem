package abstraction;

// Abstract class with various members
abstract class Vehicle {
    // Data member
    String type = "abstraction.Vehicle";

    // Constructor
    Vehicle() {
        System.out.println("abstraction.Vehicle constructor called");
    }

    // Abstract method (must be overridden in child class)
    abstract void start();

    // Final method (cannot be overridden)
    final void fuelType() {
        System.out.println("Uses petrol or diesel");
    }

    // Static method (belongs to class, not object)
    static void info() {
        System.out.println("This is a vehicle class");
    }

    // Instance method (non-abstract method)
    void stop() {
        System.out.println("abstraction.Vehicle stopped");
    }
}

// Subclass extending abstract class
class Car extends Vehicle {
    // Implementing the abstract method
    void start() {
        System.out.println("abstraction.Car started with key");
    }
}
// oop.Main class to run the program
public class TestAbstractFeatures {
    public static void main(String[] args) {
        Vehicle.info();
        Car myCar = new Car();
        System.out.println("Type: " + myCar.type);
        myCar.start();       // Abstract method implementation
        myCar.fuelType();    // Final method
        myCar.stop();        // Non-abstract method
    }
}
