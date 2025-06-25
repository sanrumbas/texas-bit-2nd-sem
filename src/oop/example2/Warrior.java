package oop.example2;

// Warrior subclass
class Warrior extends GameCharacter {

    Warrior(String name, int health, int level) {
        super(name, health, level);
    }

    @Override
    public String attack() {
        return getName() + " swings a mighty sword!";
    }
}