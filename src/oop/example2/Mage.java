package oop.example2;

// Mage subclass
class Mage extends GameCharacter {
    Mage(String name, int health, int level) {
        super(name, health, level);
    }

    @Override
    public String attack() {
        return getName() + " casts a fireball!";
    }
}