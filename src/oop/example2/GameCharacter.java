package oop.example2;

// Base class
class GameCharacter {
    private String name;
    private int health;
    private int level;

    public GameCharacter(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    // Method to override
    public String attack() {
        return name + " attacks!";
    }

    // Battle method using polymorphism
    public void battle(GameCharacter enemy) {
        System.out.println(this.name + " battles " + enemy.getName());
        System.out.println(enemy.attack());
    }
}