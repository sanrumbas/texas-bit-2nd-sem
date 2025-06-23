package constructor;

class Car {
    private String name;
    private String color;
    private double price;

    // Default constructor
    public Car() {
        name = "Unknown";
        color = "Unknown";
        price = 0.0;
    }

    // One parameter constructor
    public Car(String name) {
        this.name = name;
        this.color = "Unknown";
        this.price = 0.0;
    }

    // Two parameter constructor
    public Car(String name, String color) {
        this.name = name;
        this.color = color;
        this.price = 0.0;
    }

    // Three parameter constructor
    public Car(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Name: " + name);
        System.out.println("Car Color: " + color);
        System.out.println("Car Price: " + price);
        System.out.println("----------------------");
    }
}
