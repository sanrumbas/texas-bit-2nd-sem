package constructor;

public class MainC {
    public static void main(String[] args) {
        // Using default constructor
        Car c1 = new Car();

        // Using one parameter constructor
        Car c2 = new Car("Suzuki");

        // Using two parameter constructor
        Car c3 = new Car("Toyota", "Red");

        // Using three parameter constructor
        Car c4 = new Car("Tesla", "Black", 75000.0);

        // Displaying details of each car
        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();
        c4.displayDetails();
    }
}
