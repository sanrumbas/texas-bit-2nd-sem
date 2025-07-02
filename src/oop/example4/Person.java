package oop.example4;

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}