abstract class Language {
    // method of abstract class
    public void display() {
        System.out.println("This is Java Programming");
    }
}
class AbstractExample extends Language {
    public static void main(String[] args) {
        // create an object of oop.Main
        AbstractExample obj = new AbstractExample();
        Language ob = new AbstractExample();
        // access method of abstract class
        // using object of oop.Main class
        obj.display();
    }
}