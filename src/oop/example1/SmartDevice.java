package oop.example1;

class SmartDevice {
    private String brand;
    private double price;
    // Constructor
    SmartDevice(String brand, double price){
        this.brand = brand;
        this.price = price;
    }
    // Getters (Encapsulation)
    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }
    // Method to display device info (Polymorphic)
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
    }
}