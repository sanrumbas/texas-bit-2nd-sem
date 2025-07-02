package oop.example5;

class SportsCar extends Car {
    public SportsCar(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void drive() {
        System.out.println("SportsCar " + getModel() + " speeds off with roaring engine at " + getMaxSpeed() + " km/h!");
    }

    public void boost() {
        System.out.println("Boost activated! " + getModel() + " gets an extra surge of speed!");
    }
}