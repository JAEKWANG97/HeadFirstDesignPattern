package ch01.character.model;

import ch01.character.behavior.weaponBehavior.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public void setWeapon(WeaponBehavior w){
        this.weaponBehavior = w;
    }

    public abstract void fight();
}
