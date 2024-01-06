package ch01.character.behavior.weaponBehavior;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("발도...");
    }
}
