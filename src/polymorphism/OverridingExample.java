package polymorphism;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Animal a1 = new Dog();  // upcasting
        Animal a2 = new Cat();  // upcasting

        a1.sound();  // Dog barks
        a2.sound();  // Cat meows
    }
}
