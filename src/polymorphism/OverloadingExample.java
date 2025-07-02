package polymorphism;

class Calculator {

    // Method with 2 int parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with 3 int parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with 2 double parameters
    public double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("add(int, int): " + calc.add(5, 10));         // 15
        System.out.println("add(int, int, int): " + calc.add(2, 3, 4));   // 9
        System.out.println("add(double, double): " + calc.add(2.5, 3.2)); // 5.7
    }
}
