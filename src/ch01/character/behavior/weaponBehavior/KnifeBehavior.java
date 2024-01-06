package ch01.character.behavior.weaponBehavior;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("칼을 휘두릅니다..!     서걱");
    }
}
