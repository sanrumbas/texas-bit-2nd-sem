interface Results {
    final static float pi = 3.14f;  // Constant in interface
    float areaOf(float l, float b); // Abstract method
}

// Rectangle implements Results
class Rectangle8 implements Results {
    public float areaOf(float l, float b) {
        return (l * b);
    }
}

// Square implements Results
class Square8 implements Results {
    public float areaOf(float l, float b) {
        return (l * l);
    }
}

// Circle implements Results
class Circle8 implements Results {
    public float areaOf(float r, float b) {  // 'b' is unused
        return (pi * r * r);
    }
}

// oop.Main class
public class Interface4 {
    public static void main(String args[]) {
        Rectangle8 rect = new Rectangle8();
        Square8 square = new Square8();
        Circle8 circle = new Circle8();

        System.out.println("Area of Rectangle: " + rect.areaOf(20.3f, 28.7f));
        System.out.println("Area of Square: " + square.areaOf(10.0f, 0));
        System.out.println("Area of Circle: " + circle.areaOf(5.2f, 0));
    }
}
