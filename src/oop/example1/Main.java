package oop.example1;
public class Main {
    public static void main(String[] args) {
        // Create an array of SmartDevice references
        SmartDevice[] devices = new SmartDevice[4];
        // Store Smartphone and Smartwatch objects
        devices[0] = new Smartphone("Samsung", 899.99, 108, 24);
        devices[1] = new Smartwatch("Apple", 499.99, "Silicone", true);
        devices[2] = new Smartphone("OnePlus", 699.99, 64, 30);
        devices[3] = new Smartwatch("Fitbit", 199.99, "Leather", false);
        // Use polymorphism to display device info
        for (SmartDevice device : devices) {
            System.out.println("----- Device Info -----");
            device.displayInfo();
            System.out.println();
        }
    }
}