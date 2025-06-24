package oop.example2;

// Main class
public class GameTest {
    public static void main(String[] args) {
        GameCharacter warrior = new Warrior("Thorin", 100, 5);
        GameCharacter mage = new Mage("Gandalf", 80, 7);
        GameCharacter archer = new Archer("Legolas", 90, 6);

        // Each character battles the others
        warrior.battle(mage);
        mage.battle(archer);
        archer.battle(warrior);
    }
}