package ch01.character;

import ch01.character.behavior.weaponBehavior.SwordBehavior;
import ch01.character.model.King;

public class Main {
    public static void main(String[] args) {
        King king = new King();
        king.fight();
        king.setWeapon(new SwordBehavior());
        king.fight();
    }
}