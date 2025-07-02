package oop.example5;

class Car {
    private String model;
    private int maxSpeed;

    public Car(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void drive() {
        System.out.println("Car " + model + " is driving at " + maxSpeed + " km/h.");
    }
}