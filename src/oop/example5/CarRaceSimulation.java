package oop.example5;

public class CarRaceSimulation {
    public static void main(String[] args) {
        // Array of Car objects (polymorphism)
        Car[] racers = new Car[4];
        racers[0] = new SportsCar("Ferrari", 320);
        racers[1] = new Truck("Volvo", 120, 10000);
        racers[2] = new SportsCar("Lamborghini", 330);
        racers[3] = new Truck("MAN", 110, 12000);

        System.out.println("=== Car Race Begins! ===");

        for (Car car : racers) {
            System.out.println("-----------------------------");
            car.drive(); // Polymorphic method call

            // Type-specific actions
            if (car instanceof SportsCar) {
                ((SportsCar) car).boost();
            } else if (car instanceof Truck) {
                System.out.println("Carrying load: " + ((Truck) car).getLoadCapacity() + " kg");
            }
        }

        System.out.println("\n=== Race Finished! ===");
    }
}
