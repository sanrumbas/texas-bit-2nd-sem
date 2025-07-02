package oop.example5;

class Truck extends Car {
    private int loadCapacity; // in kg

    public Truck(String model, int maxSpeed, int loadCapacity) {
        super(model, maxSpeed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void drive() {
        System.out.println("Truck " + getModel() + " rumbles down the track at " + getMaxSpeed() + " km/h with load capacity " + loadCapacity + " kg.");
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
}