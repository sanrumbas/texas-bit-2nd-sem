package oop;
class Smartphone extends SmartDevice {
    private int cameraMP;
    private int batteryLife;
    // Constructor with constructor chaining
    Smartphone(String brand, double price, int cameraMP, int batteryLife) {
        super(brand, price); // call to oop.SmartDevice constructor
        this.cameraMP = cameraMP;
        this.batteryLife = batteryLife;
    }
    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Camera: " + cameraMP + " MP");
        System.out.println("Battery Life: " + batteryLife + " hours");
    }
}