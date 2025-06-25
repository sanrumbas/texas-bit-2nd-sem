package oop.example2;

// Archer subclass
class Archer extends GameCharacter {
    Archer(String name, int health, int level) {
        super(name, health, level);
    }

    @Override
    public String attack() {
        return getName() + " shoots a flaming arrow!";
    }
}