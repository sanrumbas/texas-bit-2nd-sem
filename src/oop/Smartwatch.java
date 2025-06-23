package oop;
class Smartwatch extends SmartDevice {
    private String strapMaterial;
    private boolean isWaterResistant;
    // Constructor with constructor chaining
    Smartwatch(String brand, double price, String strapMaterial, boolean isWaterResistant) {
        super(brand, price); // call to oop.SmartDevice constructor
        this.strapMaterial = strapMaterial;
        this.isWaterResistant = isWaterResistant;
    }
    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Strap Material: " + strapMaterial);
        System.out.println("Water Resistant: " + (isWaterResistant ? "Yes" : "No"));
    }
}