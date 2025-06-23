package casting;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

public class CastingExample {
    public static void main(String[] args) {
        // UPCASTING
        Animal a = new Dog();  // Dog is upcasted to Animal
        a.sound();  // Calls overridden method from Dog

        // a.fetch(); // ❌ Not allowed - fetch() not in Animal

        // DOWNCASTING
        Dog d = (Dog) a;  // Downcasting back to Dog
        d.sound();        // Still works
        d.fetch();        // ✅ Now we can access fetch()
    }
}
