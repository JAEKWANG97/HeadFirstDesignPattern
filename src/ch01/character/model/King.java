package ch01.character.model;

import ch01.character.behavior.weaponBehavior.KnifeBehavior;

public class King extends Character{

    public King() {
        setWeapon(new KnifeBehavior());
    }

    @Override
    public void fight() {
        System.out.println("왕이 싸움을 시작합니다..!");
        weaponBehavior.useWeapon();
    }
}
