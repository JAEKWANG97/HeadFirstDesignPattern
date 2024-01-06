package ch01.character.behavior.weaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("활을 쏩니다...!    쉭!");
    }
}
